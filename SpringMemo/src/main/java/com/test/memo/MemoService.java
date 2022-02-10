package com.test.memo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 의존객체 자격을 부여해주는 어노테이션 > 기능은 동일하나 시멘틱 태그 느낌
// @Component	> 나머지 객체
// @Repository	> DAO 객체
// @Service 	> 서비스 객체 역할
@Service //의존 객체의 자격 부여
public class MemoService implements IMemoService{
	
	@Autowired
	private MemoDAO dao; //의존객체가 되라
	
	@Override
	public List<MemoDTO> list() {
		
		MemoDAO dao = new MemoDAO();
		
		List<MemoDTO> list = dao.list();
		
		for (MemoDTO dto : list) {
			dto.setRegdate(dto.getRegdate().substring(0,10));
		}
		return list;
	}

	@Override
	public int add(MemoDTO dto) {
		return dao.add(dto);
	}
	
	@Override
	public MemoDTO get(String seq) {
		
		return dao.get(seq);
	}
	
	@Override
	public int edit(MemoDTO dto) {
		return dao.edit(dto);
	}
	
	@Override
	public int del(String seq) {
		return dao.del(seq);
	}
}
