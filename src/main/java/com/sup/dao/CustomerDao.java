package com.sup.dao;

import java.util.List;

import com.sup.vo.CustomerVO;

public interface CustomerDao {
	CustomerVO selectUser(String userid);
	List<CustomerVO> selectAllUsers();
	void updateUser(CustomerVO userVO);
	void deleteUser(String userid);
	
	//
	void insertUser(CustomerVO customerVO);
	int loginUser(String userid, String passwd);
	List<String> findIdByPhone(String name, String phone);
	List<String> findIdByEmail(String name, String email);
	int findPasswordByPhone(String userid, String name, String phone);
	int findPasswordByEmail(String userid, String name, String email);
}
