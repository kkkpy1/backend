package com.sup.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WishlistVO {
	// Wishlist Info
	private int wishlistId;
	private int productId;
	private String memberId;
	private String wishlistName;
	private String wishlistDate;
	
	// Product Info
	private String productName;
	private int productPrice;
	private String productImg;
}
