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
public class PurchaseVO {
	private int productId;
	private String senderId;
	private String recepientId;
	private String purchaseState;
	private String purchaseDate;
	
}
