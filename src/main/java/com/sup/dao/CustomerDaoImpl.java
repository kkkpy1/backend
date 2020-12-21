package com.sup.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sup.vo.CustomerVO;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public CustomerVO selectUser(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerVO> selectAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(CustomerVO userVO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(String userid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertUser(CustomerVO customerVO) {
		this.sqlSession.insert("Customer.insertSP",customerVO);

	}


	@Override
	public int loginUser(String userid, String passwd) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberId", userid);       //INPUT Parameter
		map.put("memberPassword", passwd);   //INPUT Parameter
		this.sqlSession.selectList("Customer.login", map);
		//log.info("result = " + map.get("result"));
		return (Integer)map.get("result");
	}

	@Override
	public List<String> findIdByPhone(String name, String phone) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberName", name);       //INPUT Parameter
		map.put("memberPhone", phone);   //INPUT Parameter
		this.sqlSession.selectList("Customer.findIdByPhone", map);
		List<String> list = (List<String>)map.get("result");
		return (List<String>)map.get("result");
	}

	@Override
	public List<String> findIdByEmail(String name, String email) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberName", name);       //INPUT Parameter
		map.put("memberEmail", email);   //INPUT Parameter
		this.sqlSession.selectList("Customer.findIdByEmail", map);
		List<String> list = (List<String>)map.get("result");
		return (List<String>)map.get("result");
	}

	@Override
	public int findPasswordByPhone(String userid, String name, String phone) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberId", userid);       //INPUT Parameter
		map.put("memberName", name);       //INPUT Parameter
		map.put("memberPhone", phone);   //INPUT Parameter
		this.sqlSession.selectList("Customer.findPasswordByPhone", map);
		return (Integer)map.get("result");
	}

	@Override
	public int findPasswordByEmail(String userid, String name, String email) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberId", userid);       //INPUT Parameter
		map.put("memberName", name);       //INPUT Parameter
		map.put("memberEmail", email);   //INPUT Parameter
		this.sqlSession.selectList("Customer.findPasswordByEmail", map);
		return (Integer)map.get("result");
	}

}
