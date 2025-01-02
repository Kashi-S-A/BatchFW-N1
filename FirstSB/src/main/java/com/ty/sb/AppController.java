package com.ty.sb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

//	@RequestMapping(value = "/msg",method = RequestMethod.GET)
	@GetMapping("/msg")
	public String getMsg() {
		return "hi";
	}

	@PostMapping("/greet")
	public String greet() {
		return "Good Night";
	}
	
	@PutMapping("/update")
	public String putMethodName() {
		return "Put request";
	}

}
