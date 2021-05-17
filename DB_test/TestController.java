package com.mariadb.test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TestController {
	
	@Autowired
    MemberService MemberService;
    
    @RequestMapping(value ="/test" , method = RequestMethod.POST)
    public String goTestPage(Model model, HttpServletRequest request){
          
    	String mId = request.getParameter("mId");	
		List<MemberDTO> list = MemberService.getMember(mId);
		
		if(list.size()>0) {
			model.addAttribute("rs", "Success_DB_Conncetion");
		}else {
			model.addAttribute("rs", "Fail");
		}
		
		return "test";
  }


}
