package com.sup.service;

import java.util.List;

import com.sup.vo.CustomerVO;

public interface CustomerService {
	CustomerVO read(String userid);
	List<CustomerVO> readAll();
	void update(CustomerVO userVO);
	void delete(String userid);
	
	void create(CustomerVO customerVO);
	int login(String userid, String passwd);
	List<String> findIdByPhone(String name, String phone);
	List<String> findIdByEmail(String name, String email);
	int findPasswordByPhone(String userid, String name, String phone);
	int findPasswordByEmail(String userid, String name, String email);
}
