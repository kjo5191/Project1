package com.lgy.ShoFriend.dao;

import java.util.HashMap;

public interface RegiDAO {
//	public ArrayList<RegiDAO> list();
	public int emailCheck(String email);
	public void write(HashMap<String, String> param);
	public void sell_write(HashMap<String, String> param);
//	public RegiDTO contentView(HashMap<String, String> param);
//	public void modify(HashMap<String, String> param);
//	public void delete(HashMap<String, String> param);

}
