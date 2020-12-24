package com.sup.test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sup.dao.WishlistDao;
import com.sup.service.WishlistService;
import com.sup.vo.WishlistVO;

import lombok.extern.java.Log;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log
class WishlistTest {
	@Autowired
	private SqlSession sqlSession;

	@Autowired
	private WishlistService wishlistService;
	
	@Disabled @Test
	void test() {
		assertNotNull(sqlSession);
	}
	
	
	@Disabled @Test
	void insertOne() { // 삽입
		int productId = 2;
		String memberId = "customer2";
		// String wishlistName = "ㅎㅎ";
		
		WishlistVO wishlistVO = new WishlistVO();
		wishlistVO.setProductId(productId);
		wishlistVO.setMemberId(memberId);
		// wishlistVO.setWishlistName(wishlistName);
		this.wishlistService.addToWishlist(wishlistVO);
	}
	
	@Disabled @Test
	void select1() { // 1명의 위시리스트. memberId로 접근. 친구1명꺼도 이걸로 접근
		String memberId= "customer1";
		List<WishlistVO> list = this.wishlistService.getMyWishlist(memberId);
		for (int i = 0; i < list.size(); i++) {
			log.info(list.get(i).getWishlistName());
			log.info(list.get(i).getProductName());
			log.info(list.get(i).getProductImg());
		}
	}

	@Disabled @Test
	void select2() { // 내 친구들(전체)의 위시리스트
		String memberId= "customer1";
		List<WishlistVO> list = this.wishlistService.getFriendsWishlist(memberId);
		for (int i = 0; i < list.size(); i++) {
			log.info(list.get(i).getMemberId());
			log.info(list.get(i).getWishlistName());
			log.info(list.get(i).getProductName());
		}
	}

	@Disabled @Test
	void update() { // Update Complete
		int wishlistId = 6;
		int productId = 1;
		String memberId= "customer2";
		String wishlistName = "수정된 이름";
		
		WishlistVO wishlistVO = new WishlistVO();
		wishlistVO.setWishlistId(wishlistId);
		wishlistVO.setProductId(productId);
		wishlistVO.setMemberId(memberId);
		wishlistVO.setWishlistName(wishlistName);
		this.wishlistService.updateWishlist(wishlistVO);
	}
	
	@Disabled @Test
	void deleteT() {
		int wishlistId = 7;
		this.wishlistService.deleteFromWishlist(wishlistId);
	}

}
