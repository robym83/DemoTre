package com.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	// ------------------- Ricerca Per Codice ------------------------------------
		@RequestMapping(value = "/ciao", method = RequestMethod.GET, produces = "application/json")
		public ResponseEntity<String> helloWorld()  
				 
		{
			System.out.println("****** dentro HelloWorld Controller 5555  *******");
			logger.info("dentro HelloWorld");
			logger.debug("dentro DEBUG HelloWorld");
	
			return new ResponseEntity<String>("ciao mamma", HttpStatus.OK);
		}


}
