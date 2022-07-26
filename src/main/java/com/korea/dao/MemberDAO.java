package com.korea.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.korea.dto.MemberDTO;

 

public class MemberDAO {
	
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String id="book_ex";
	private String pw="1234";
	//채우기
	private Connection conn=null;
	private PreparedStatement pstmt =null;
	private ResultSet rs =null;
	
	private static MemberDAO dao = new MemberDAO();
	DBConnectionMgr pool = DBConnectionMgr.getInstance();
	private MemberDAO(){
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DBConnected..");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static MemberDAO getInstance() {
		return dao;
	}
	
	public void memberJoin(MemberDTO member) {
		//채우기
		MemberDTO dto = new MemberDTO();
		
		try {
			pstmt=conn.prepareStatement("");
			pstmt.setString(1, member.getUserid());
			pstmt.setString(2, member.getPwd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getPh1());
			pstmt.setString(5, member.getPh2());
			pstmt.setString(6, member.getPh3());
			pstmt.setString(7, member.getEmail());
			pstmt.setInt(8, member.getZipcode());
			pstmt.setString(9,member.getAddr1());
			pstmt.setString(10, member.getAddr2());
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
