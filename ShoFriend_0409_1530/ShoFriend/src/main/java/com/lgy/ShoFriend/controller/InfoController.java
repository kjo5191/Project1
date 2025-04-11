package com.lgy.ShoFriend.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.ShoFriend.dto.CustomerDTO;
import com.lgy.ShoFriend.service.InfoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class InfoController {
	
	@Autowired
	private InfoService service;	
	
	@RequestMapping("/my_page")
	public String myPage() {
		log.info("@# my_page()");
		return "my_page";
	}
	
	@RequestMapping("/customer_info") //구매자 마이페이지
	public String customerInfo() {
		log.info("@# customer_info()");
		return ("customer_info");
	}
	
	@RequestMapping("/update_pwd")
	public String updatePwd() {
		log.info("@# update_pwd()");
	    return "update_pwd";
	}
	
	@RequestMapping("/updatePwdOk")
	public String updatePwdOk(@RequestParam("new_pwd") String newPwd, HttpSession session) {
	    CustomerDTO loginCustomer = (CustomerDTO) session.getAttribute("loginCustomer");

		log.warning("안녕");
	    if (loginCustomer != null) {
	        HashMap<String, String> param = new HashMap<String, String>();
	        param.put("id", Integer.toString(loginCustomer.getId()));
	        param.put("new_pwd", newPwd);

	        service.updatePwd(param);
	        loginCustomer.setPassword(newPwd); // 세션도 업데이트
	        log.info("@# update_pwd()");
	        
	        return "redirect:customer_info";
	    } else {
			log.info("잘가");
	        return "redirect:login";
	    }
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate();  // 현재 로그인된 세션 모두 삭제
	    log.info("@# logout()");
	    return "redirect:login";  // 로그인 페이지로 이동
	}
	
	@RequestMapping("/check_pwd")
	public String checkPwdPage() {
		log.info("@# check_pwd()");
	    return "check_pwd";  //
	}
	
	@RequestMapping("/checkPwdOk")
	public String checkPwdOk(@RequestParam("input_pwd") String inputPwd, HttpSession session) {
	    CustomerDTO loginCustomer = (CustomerDTO) session.getAttribute("loginCustomer");

	    if (loginCustomer != null && inputPwd.equals(loginCustomer.getPassword())) {
	        return "redirect:customer_info";  // 맞으면 정보 페이지로
	    } else {
	        return "redirect:check_pwd";  // 틀렸으면 다시 입력
	    }
	}
}
