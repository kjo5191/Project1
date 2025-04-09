package com.lgy.ShoFriend.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.lgy.ShoFriend.dto.CustomerDTO;


public interface InfoDAO {
	public ArrayList<CustomerDTO> auth(HashMap<String, String> param);
	public void updatePwd(HashMap<String, String> param);
}
