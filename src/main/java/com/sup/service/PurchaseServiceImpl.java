package com.sup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sup.dao.PurchaseDao;

@Service("purchaseService")
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	private PurchaseDao purchaseDao;

	@Override
	public void purchase(int productId, String senderId, String recepientId) {
		this.purchaseDao.insert(productId, senderId, recepientId);
	}

}
