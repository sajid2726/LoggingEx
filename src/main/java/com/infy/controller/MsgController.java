package com.infy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	Logger logger = LoggerFactory.getLogger(MsgController.class);

	@GetMapping("/welcome")
	public String welcome() {
		logger.debug("Welcome method saterted");
		String msg = "Welcome to Sajid IT";
		
		
		try {
			int i = 10/0;
		} catch(Exception e) {
			logger.error("Error occurred " + e.getMessage());
		}
		
		logger.debug("Welome method ended");
		return msg;
		
	}
		
}
