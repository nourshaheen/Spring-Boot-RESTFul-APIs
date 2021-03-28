package com.shopping.demo.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Table(name = "SH_ORDER")
@Data
public class Order {
	
    @Id
	private Long id ;
	private String name ;	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date date ;
	private Long qty ;
	
	private Product product;

	
}
