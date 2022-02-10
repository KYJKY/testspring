package com.test.memo;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemoController {
	
	//의존객체에 선언
	@Autowired
	private IMemoService service;
	
//	public MemoController(IMemoService service) {
//		this.service=service;
//	}

	@RequestMapping(value = "/list.do", method = { RequestMethod.GET })
	public String list(HttpServletRequest req) {


		List<MemoDTO> list = service.list();

		req.setAttribute("list", list);

		return "list";
	}

	@RequestMapping(value = "/add.do", method = { RequestMethod.GET })
	public String add() {

		return "add";
	}

	@RequestMapping(value = "/addok.do", method = { RequestMethod.POST })
	public void addok(HttpServletResponse resp ,MemoDTO dto) {//1
		//1. 데이터 가져오기
		//2. DB작업 > insert > DAO가 아닌 service객체에게 위임
		
		//2
//		IMemoService service = new MemoService();
		System.out.println(dto.toString());
		int result=service.add(dto);
		try {
			if(result==1) {
				resp.sendRedirect("/memo/list.do");
			} else {
				resp.sendRedirect("/memo/add.do");			
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@RequestMapping(value = "/edit.do", method = { RequestMethod.GET })
	public String edit(HttpServletRequest req ,String seq) {
		
		//할일
		//1. 글번호 받기 seq
		//2. DB작업 > select > Service 위임
		//3. 반환값 전달 + JSP 호출
		
		MemoDTO dto = service.get(seq);
		
		req.setAttribute("dto", dto);
		
		return "edit";
	}

	@RequestMapping(value = "/editok.do", method = { RequestMethod.POST })
	public void editok(HttpServletResponse resp, MemoDTO dto) {
		//1. 데이터 가져오기
		//2. DB 작업 > update > Service 위임
		//3. 피드백
		int result = service.edit(dto);
		
		try {
			if(result==1) {
				resp.sendRedirect("/memo/list.do");
			} else {
				resp.sendRedirect("/memo/edit.do?seq="+dto.getSeq());			
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@RequestMapping(value = "/delok.do", method = { RequestMethod.GET})
	public void delok(HttpServletResponse resp, String seq) {
		//1. 데이터 가져오기 seq
		//2. DB 작업 > delete > Service 위임
		//3. 피드백
		int result=service.del(seq);
		try {
			resp.sendRedirect("/memo/list.do");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
