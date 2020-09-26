package com.sbs.example.lolHi.controller.usr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/usr/home/main") 
	@ResponseBody 
	public String showMain() {
		return "안녕";
	}
	@RequestMapping("/usr/home/main2") 
	@ResponseBody 
	public String showMain2() {
		return "잘가";
	}
	@RequestMapping("/usr/home/plus") 
	@ResponseBody 
	public int showPlus(int a, int b) {
		return a + b;
	}
	@RequestMapping("/usr/home/minus") 
	@ResponseBody 
	public int showMinus(int a, int b) {
		return a - b;
	}
	@RequestMapping("/usr/home/multi") 
	@ResponseBody 
	public int showMulti(int a, int b) {
		return a * b;
	}
	@RequestMapping("/usr/home/div") 
	@ResponseBody 
	public int showDiv(int a, int b) {
		return a / b;
	}
}
