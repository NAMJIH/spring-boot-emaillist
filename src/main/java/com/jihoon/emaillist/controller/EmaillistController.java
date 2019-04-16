package com.jihoon.emaillist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jihoon.emaillist.dao.EmaillistDao;
import com.jihoon.emaillist.vo.EmaillistVo;

@Controller
public class EmaillistController {
	@Autowired
	private EmaillistDao emaillistDao;

	//	@RequestMapping("/main")
//	public ModelAndView list() {
//		EmaillistDao emaillistDao = new EmaillistDao();
//		List<EmaillistVo> list = emaillistDao.getList();
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("/WEB-INF/views/list.jsp");
//		mav.addObject("list", list);
//	   //request.setAttribute("", list); 대체				// 중요
//
//		return mav;
//	}
	@RequestMapping("/main")
	public String list(Model model) {
		List<EmaillistVo> list = emaillistDao.getList();
		model.addAttribute("list",list);
		return "list";
	}
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
//	@RequestMapping("/add")
//	public String add(
//			@RequestParam("fn") String firstName,
//			@RequestParam("ln") String lastName,
//			@RequestParam("email") String email) {
//	
//		EmaillistVo ev = new EmaillistVo();
//		ev.setFirstName(firstName);
//		ev.setLastName(lastName);
//		ev.setEmail(email);
//		
//		emaillistDao.insert(ev);
//		
//	//	System.out.println(firstName + ":" +lastName + ":" + email );
//		return "redirect:/main";
//	}
	@RequestMapping("/add")
	public String add(@ModelAttribute EmaillistVo ev) {
		emaillistDao.insert(ev);
		return "redirect:/main";
	}
	
}
