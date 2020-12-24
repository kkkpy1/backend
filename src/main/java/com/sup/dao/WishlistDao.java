package com.sup.dao;

import java.util.List;

import com.sup.vo.WishlistVO;

public interface WishlistDao {

	void insert(WishlistVO wishlistVO);

	List<WishlistVO> selectMyWishlist(String memberId);

	List<WishlistVO> selectFriendsWishlist(String memberId);

	void update(WishlistVO wishlistVO);

	void delete(int wishlistId);

}
