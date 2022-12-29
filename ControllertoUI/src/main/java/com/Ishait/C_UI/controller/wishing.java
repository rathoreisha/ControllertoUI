package com.Ishait.C_UI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class wishing {
	
	@GetMapping("/greeting")
	public String greet()
	{
		String string="HI java developer";
		return string;
	}

}
