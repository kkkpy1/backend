package com.sup.service;

import java.util.List;

import com.sup.vo.WishlistVO;

public interface WishlistService {
	void addToWishlist(WishlistVO wishlistVO);
	List<WishlistVO> getMyWishlist(String memberId);
	List<WishlistVO> getFriendsWishlist(String memberId);
	void updateWishlist(WishlistVO wishlistVO);
	void deleteFromWishlist(int wishlistId);

}
