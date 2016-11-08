package com.onetonmapping;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="MARKET")
public class Market {
	@Id
	@GeneratedValue
	@Column(name="MARKET_ID")
	private int MARKET_ID;
	
	@Column(name="MARKET_NAME")
	private String marketName;
	
	@Column(name="MARKET_PRICE")
	private long marketPrice;
	
	
	@OneToMany(mappedBy="market", cascade={CascadeType.ALL})
	private Set<Stock> stock;


	public int getMARKET_ID() {
		return MARKET_ID;
	}


	public void setMARKET_ID(int mARKET_ID) {
		MARKET_ID = mARKET_ID;
	}


	public String getMarketName() {
		return marketName;
	}


	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}


	public long getMarketPrice() {
		return marketPrice;
	}


	public void setMarketPrice(long marketPrice) {
		this.marketPrice = marketPrice;
	}


	public Set<Stock> getStock() {
		return stock;
	}


	public void setStock(Set<Stock> stock) {
		this.stock = stock;
	}
	
	

}
