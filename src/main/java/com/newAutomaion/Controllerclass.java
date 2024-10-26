package com.newAutomaion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value="/control")
public class Controllerclass {
	@GetMapping(value="/get")
	public String get() {
		return "from newAutomation";
	}

}
