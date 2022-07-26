package com.korea.service;

import com.korea.dao.MemberDAO;

public class MemberService {
	private static MemberService service = new MemberService();
	public MemberDAO dao = MemberDAO.getInstance();
	
	private MemberService(){}

	public static MemberService getInstance() {
		return service;
	}

	public void memberJoin(MemberDAO member) {
		//채우기
	}
}
