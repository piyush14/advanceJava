package com.onetonmapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="STOCK")
public class Stock {
	@Id
	@GeneratedValue
	@Column(name="STOCK_ID")
	private int STOCK_ID;
	
	@Column(name="STOCK_NAME")
	private String stockName;
	
	@Column(name="STOCK_VALUE")
	private long stockValue;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="MARKET_ID")
	private Market market;

	public Stock(String stockName, long stockValue) {
		this.stockName = stockName;
		this.stockValue = stockValue;
	}

	
	
	public Stock() {
		
	}



	public int getSTOCK_ID() {
		return STOCK_ID;
	}

	public void setSTOCK_ID(int sTOCK_ID) {
		STOCK_ID = sTOCK_ID;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public long getStockValue() {
		return stockValue;
	}

	public void setStockValue(long stockValue) {
		this.stockValue = stockValue;
	}

	public Market getMarket() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

}
