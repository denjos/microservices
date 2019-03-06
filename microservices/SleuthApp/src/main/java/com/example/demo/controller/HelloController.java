package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Parameter;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/rest")
public class HelloController {
	
	
	@PostMapping("/hello")
	public String getGreeting(@RequestBody Parameter param)
	{
		
		log.info("inicio");

		String saludo=String.format(" Hello %s !!!",param.getValue());
		
		log.info("fin");
		return saludo;
		
	}

}
