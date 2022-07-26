package com.korea.controller;


import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{
	 
	HashMap<String, SubController> list = null;

	@Override
	public void init(ServletConfig sc) throws ServletException 	 
	{
		 
		list = new HashMap();
		//채우기
		 
		list.put("MemberJoin.do", new MemberJoinController());
		
		
	
	}

	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		//채우기 
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String url = req.getRequestURI();
		System.out.println("URL : " + url);
		SubController sub=list.get(url);
		if(sub!=null)
			sub.execute(req, resp);
		
		//수정중ㄹ
	
	}
}
