package com.ty.read;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class ReadController {

	@GetMapping("/get")      //method - Get , url - http://localhost:8080/api/get?uid=101&uname=Dinga
	public String getApi(@RequestParam(name = "uid") Integer id,@RequestParam String uname) {
		return "uid :"+id+", Name : "+uname;
	}
	
}
