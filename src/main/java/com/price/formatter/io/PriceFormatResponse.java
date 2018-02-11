/**
 * 
 */
package com.price.formatter.io;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * output response format
 * 
 * @author sidonepudi
 *
 */
public class PriceFormatResponse {

	private String bigFigure;
	private String dealingPrice;
	private String fractionalPips;

	public PriceFormatResponse(String bigFigure, String dealingPrice, String fractionalPips) {
		this.bigFigure = bigFigure;
		this.dealingPrice = dealingPrice;
		this.fractionalPips = fractionalPips;
	}

	@JsonProperty
	public String getBigFigure() {
		return bigFigure;
	}

	@JsonProperty
	public String getDealingPrice() {
		return dealingPrice;
	}

	@JsonProperty
	public String getFractionalPips() {
		return fractionalPips;
	}

	@Override
	public String toString() {
		return "PriceFormatResponse [bigFigure=" + bigFigure + ", dealingPrice=" + dealingPrice + ", fractionalPips="
				+ fractionalPips + "]";
	}

}
