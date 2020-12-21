package com.sup.dao;

import java.util.List;

import com.sup.vo.ProductVO;

public interface ProductDao {
	List<ProductVO> selectAll();

	List<ProductVO> selectOne(int productId);

}
