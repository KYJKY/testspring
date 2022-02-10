package com.test.mybatis;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyBatisDAO {
	
	//Connection conn;
	//Statement stat;
	//ResultSet rs;
	
	@Autowired
	private SqlSessionTemplate template;
	
	
	public void m1() {
		//SQL 실행
		//- String sql > execute > return ~;
		
		//- stat.excuteQuery() > template.selectXXX()
		
		// - state.executeUpdate()
		// 	= template.insert()
		// 	= template.update()
		// 	= template.delete()
		
		template.insert("test.m1");
	}


	public int m2(MemoDTO dto) {
		/* template.insert(statement, parameter); */
		return template.insert("test.m2", dto);
	}
	public int m3(String seq) {
		/* template.insert(statement, parameter); */
		return template.insert("test.m3", seq);
	}


	public int m4(HashMap<String, String> map) {
		return template.insert("test.m4", map);
	}


	public int m5() {
		/*
		 * select 
		 * 1. template.selectOne() 		결과셋의 레코드 수가 한 개일 때 > 주로 DTO 반환
		 * 2. template.selectList()		결과셋의 레코드 수가 여러 개일 때 > 주로 List<DTO> 반환
		 */
		return template.selectOne("test.m5");
	}


	public MemoDTO m6(String seq) {
		
		return template.selectOne("test.m6", seq);
	}


	public List<String> m7() {
		// TODO Auto-generated method stub
		return template.selectList("test.m7");
	}


	public List<MemoDTO> m8() {
		// TODO Auto-generated method stub
		return template.selectList("test.m8");
	}


	public List<MemoDTO> m9(HashMap<String, String> map) {
		
		return template.selectList("test.m9", map);
	}

}
