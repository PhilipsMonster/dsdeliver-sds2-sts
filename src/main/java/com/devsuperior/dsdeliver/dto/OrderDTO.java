package com.devsuperior.dsdeliver.dto;

import java.time.Instant;

import com.devsuperior.dsdeliver.entities.OrderStatus;

public class OrderDTO {
	
	private Long id;
	private String address;
	private Double latitude;
	private Double longitude;
	private Instant moment;
	private OrderStatus status;
	
	

}
