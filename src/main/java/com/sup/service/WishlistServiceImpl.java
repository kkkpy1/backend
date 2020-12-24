package com.sup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sup.dao.WishlistDao;
import com.sup.vo.WishlistVO;

@Service("wishlistService")
public class WishlistServiceImpl implements WishlistService {
	@Autowired
	private WishlistDao wishlistDao;

	@Override
	public void addToWishlist(WishlistVO wishlistVO) {
		this.wishlistDao.insert(wishlistVO);
	}

	@Override
	public List<WishlistVO> getMyWishlist(String memberId) {
		return this.wishlistDao.selectMyWishlist(memberId);
	}

	@Override
	public List<WishlistVO> getFriendsWishlist(String memberId) {
		return this.wishlistDao.selectFriendsWishlist(memberId);
	}

	@Override
	public void updateWishlist(WishlistVO wishlistVO) {
		this.wishlistDao.update(wishlistVO);
	}

	@Override
	public void deleteFromWishlist(int wishlistId) {
		this.wishlistDao.delete(wishlistId);
	}

}
