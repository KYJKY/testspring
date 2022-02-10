package com.test.tiles;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/main.do", method = { RequestMethod.GET })
	public String main(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {
//		기존리졸버
//		return "main"; 의 역할 > JSP 경로 + 기존 리졸버 경로 > 완성
		
//		타일즈리졸버
//		tiles.xml에 <definition>중, name속성값이 리턴값인 <definition>을 찾아간다.
//		<definition>의 template속성값의 경로에 있는 jsp를 찾아간다
		return "main";
	}	
	
	
	@RequestMapping(value = "/sub.do", method = { RequestMethod.GET })
	public String sub(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {
		
		return "sub";
	}	
	
	
	@RequestMapping(value = "/member/info.do", method = { RequestMethod.GET })
	public String info(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		return "member.info";
	}
	
	@RequestMapping(value = "/member/log.do", method = { RequestMethod.GET })
	public String log(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		return "member.log";
	}
	
	@RequestMapping(value = "/admin/chart.do", method = { RequestMethod.GET })
	public String chart(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		return "admin.chart";
	}
	
	@RequestMapping(value = "/admin/point.do", method = { RequestMethod.GET })
	public String point(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		return "admin.point";
	}

}





















