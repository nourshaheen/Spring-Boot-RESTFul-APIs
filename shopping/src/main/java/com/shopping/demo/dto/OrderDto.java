package com.shopping.demo.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderDto {
	
	
	private Long orderId ;
	private String orderName ;	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date date ;
	private Long qty ;
	private ProductDto product;
	private Long productId;

}
