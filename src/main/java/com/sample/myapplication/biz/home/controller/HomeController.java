package com.sample.myapplication.biz.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

import com.sample.myapplication.config.AppConfig;

/**
 * Home Controller
 *
 * @author SungHyun Cheong
 */
@Controller
@Validated
public class HomeController {

	@Autowired AppConfig appConfig;

	/** ROOT 접근 시 호출 */
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("appConfig", appConfig);
		return "home/home";
	}

}
