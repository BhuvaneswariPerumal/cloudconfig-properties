package com.example.comcast;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RateController {
	@Value("${Experience}")
	String Experience;
	@Value("${minskill}")
	String minskill;
	@Value("${maxskill}")
	String maxskill;
	@RequestMapping("/rate")
	public String getRate(){
		System.out.println(Experience+minskill+maxskill);
		return " Experience: "+Experience+" minskill: "+minskill+" maxskill: "+maxskill;
	}

}
