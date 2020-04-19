package com.ninchitech.bookstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_book")
@Getter
@Setter
@ToString
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private String sku;
	private String name;
	private String description; 
	private String image_url;
	private boolean active;
    private int units_in_stock;
    private BigDecimal unit_price;
    private Date date_created;
    private Date last_updated;
    
    @ManyToOne()
    @JoinColumn(name="category_id", nullable=false)
    private BookCategory category;
    

}
