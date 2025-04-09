package com.lgy.ShoFriend.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgy.ShoFriend.dao.InfoDAO;
import com.lgy.ShoFriend.dto.CustomerDTO;


@Service("InfoService")
public class InfoServiceImpl implements InfoService{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void updatePwd(HashMap<String, String> param) {
		InfoDAO dao = sqlSession.getMapper(InfoDAO.class);
		dao.updatePwd(param);
	}

}
