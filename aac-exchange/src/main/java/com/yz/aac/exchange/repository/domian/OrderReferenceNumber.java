package com.yz.aac.exchange.repository.domian;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderReferenceNumber {

	/** ID */
	private Long id;
	
	/** 订单参考号  */
	private String referenceNumber;

	public OrderReferenceNumber(String referenceNumber) {
		super();
		this.referenceNumber = referenceNumber;
	}
	
}
