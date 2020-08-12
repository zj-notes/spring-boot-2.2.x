package com.springbootdemo.web;

import com.springbootdemo.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired(required = false)
	CalculateService calculateService;

    @RequestMapping("/")
    public String hi(){
        return "It works!";
    }

	@GetMapping("/add/{a}/{b}")
	public String add(@PathVariable("a") int a, @PathVariable("b") int b){
		return "add result : " + calculateService.add(a, b) + ", from [" + calculateService.getServiceDesc() + "]";
	}

	@RequestMapping("/applicationContext")
	public String applicationContextTest(){
		return calculateService.applicationContextTest();
	}

}