package com.korea.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.korea.dto.MemberDTO;

public class MemberJoinController implements SubController {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		
		try {
			//채우기
			String userid = req.getParameter("userid");
			String pwd = req.getParameter("pwd");
			String name = req.getParameter("name");
			String ph1 = req.getParameter("ph1");
			String ph2 = req.getParameter("ph2");
			String ph3 = req.getParameter("ph3");
			String email = req.getParameter("email");
			String zipcode = req.getParameter("zipcode"); 
			String addr1 = req.getParameter("addr1");
			String addr2 = req.getParameter("addr2");
			
			
			MemberDTO dto = new MemberDTO();
			dto.setUserid(userid);
			dto.setPwd(pwd);
			dto.setName(name);
			dto.setPh1(ph1);
			dto.setPh2(ph2);
			dto.setPh3(ph3);
			dto.setEmail(email);
			dto.setZipcode(0);
			dto.setAddr1(addr1);
			dto.setAddr2(addr2);
			
			
			resp.sendRedirect("/WEB-INF/View/MemberJoin.do");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
