package com.sup.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sup.vo.PurchaseVO;
import com.sup.vo.WishlistVO;

@Repository("wishlistDao")
public class WishlistDaoImpl implements WishlistDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(WishlistVO wishlistVO) {
		this.sqlSession.insert("Wishlist.insertSP", wishlistVO);
		
	}

	@Override
	public List<WishlistVO> selectMyWishlist(String memberId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberId", memberId);   //INPUT Parameter
		this.sqlSession.selectList("Wishlist.selectMyWishlistSP", map);
		return (List<WishlistVO>) map.get("result");
	}

	@Override
	public List<WishlistVO> selectFriendsWishlist(String memberId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberId", memberId);   //INPUT Parameter
		this.sqlSession.selectList("Wishlist.selectFriendsWishlistSP", map);
		return (List<WishlistVO>) map.get("result");
	}

	@Override
	public void update(WishlistVO wishlistVO) {
		this.sqlSession.update("Wishlist.updateSP", wishlistVO);
		
	}

	@Override
	public void delete(int wishlistId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("wishlistId", wishlistId);   //INPUT Parameter
		this.sqlSession.delete("Wishlist.deleteSP", map);
		
	}
	
	

}
