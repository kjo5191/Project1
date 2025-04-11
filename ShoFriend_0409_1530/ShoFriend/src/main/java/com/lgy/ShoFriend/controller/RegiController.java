package com.lgy.ShoFriend.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.ShoFriend.dto.CustomerDTO;
import com.lgy.ShoFriend.service.RegiService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class RegiController {

	@Autowired
	private RegiService service;
	
	//	(일반회원가입) 25.04.08 김채윤
	@RequestMapping("/register")
	public String register() {
		log.info("@# register()");
		log.info("그냥 찎어보는 로그");
		return "register";
	}
	
	//	(일반회원가입 완료) 25.04.08 김채윤
	@RequestMapping("/registerOk")
	public String registerOk(@RequestParam HashMap<String, String> param) {
		log.info("@# registerOk()");

		service.write(param);
		return "redirect:login";
	}
	
	//	(판매자 회원가입) 25.04.08 김채윤
	@RequestMapping("/sell_register")
	public String sell_register() {
		log.info("sell_register()");
		return "sell_register";
	}
	
	//	(판매자 회원가입 완료) 25.04.08 김채윤
	@RequestMapping("/sell_registerOk")
	public String sell_registerOk(@RequestParam HashMap<String, String> param) {
		log.info("@# sell_registerOk()");

		service.sell_write(param);
		return "redirect:login";
	}	
}
