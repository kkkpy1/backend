package com.sup.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("purchaseDao")
public class PurchaseDaoImpl implements PurchaseDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(int productId, String senderId, String recepientId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("productId", productId);       //INPUT Parameter
		map.put("senderId", senderId);   //INPUT Parameter
		map.put("recepientId", recepientId);   //INPUT Parameter
		this.sqlSession.insert("Purchase.insert", map);
	}

}
