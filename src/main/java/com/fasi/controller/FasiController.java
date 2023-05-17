package com.fasi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FasiController {

	/*
	 	http://localhost:8071/hello?name=Ravi
	 	*/
	
	@GetMapping(value="/hello", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> sayHello(@RequestParam String name) {
		
		return new ResponseEntity<String>("Hello "+name, HttpStatus.OK);
    }
	
	@GetMapping(value="/add", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> sayHello(@RequestParam Integer n1,@RequestParam Integer n2) {
		
		return new ResponseEntity<String>("Sum of "+n1+" and "+n2+" = "+(n1+n2), HttpStatus.OK);
    }
}
