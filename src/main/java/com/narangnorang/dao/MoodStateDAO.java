package com.narangnorang.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.narangnorang.dto.MoodStateDTO;

@Repository("moodStateDAO")
public class MoodStateDAO {

	@Autowired
	SqlSession sqlSession;

	// 기분 상태 저장
	public int insert(MoodStateDTO moodStateDTO) throws Exception {
		return sqlSession.insert("com.config.MoodStateMapper.insert", moodStateDTO);
	}

	// 기분 상태 조회
	public List<MoodStateDTO> selectList(int memberId) throws Exception {
		return sqlSession.selectList("com.config.MoodStateMapper.selectList", memberId);
	}

}
