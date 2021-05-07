package com.vivek.publicisProject.resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/weatherReport")
public class WeatherReportResource {
	
	@Autowired
	private RestTemplate rt;
	
	@RequestMapping("/{city}")
	public String getReport(Model model, @PathVariable("city") String cityName) {
		
		CityReportVO vo=rt.getForObject("https://samples.openweathermap.org/data/2.5/forecast?q="+cityName+",us&appid=d2929e9483efc82c82c32ee7e02d563e", CityReportVO.class);
		System.out.println("CityReportVO=="+vo.toString());
		
		List<DayWeatherDetailsVO> list= vo.getList();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
		
		OutputReportVO outputvo=new OutputReportVO();
		outputvo.setName(cityName);
		outputvo.setStatus(vo.getCod());
		ArrayList<OutputDetailsVO> listOutput=new ArrayList<OutputDetailsVO>();
		int count=0;
		list.stream().filter( l-> l.getDt_txt().contains("00:00:00") ).limit(3).forEach(l->{ String message="";
		l.getMain().setTemp(Math. round(l.getMain().getTemp()- 273.15));
		l.getMain().setTemp_min(Math. round(l.getMain().getTemp_min()- 273.15));
		l.getMain().setTemp_max(Math. round(l.getMain().getTemp_max()- 273.15));
			if(l.getMain().getTemp_max()>40)message="Use sunscreen lotion";
			if(l.getWeather().get(0).getMain().contains("Rain"))message="Carry umbrella";
			OutputDetailsVO tempvo=new OutputDetailsVO(l.getDt_txt(), l.getMain().getTemp(), l.getMain().getTemp_min(), l.getMain().getTemp_max(), l.getWeather().get(0).getDescription(), l.getWeather().get(0).getMain(), message);
			listOutput.add(tempvo);
				
									});
		outputvo.setList(listOutput);
		model.addAttribute("OutputReportVO",outputvo);
		return "report";
		//return outputvo;
	}

}
