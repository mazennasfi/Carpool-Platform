package com.cov.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MetaController {
	@RequestMapping("/")
	public String home()
	{
		return "hello";
	}

}
