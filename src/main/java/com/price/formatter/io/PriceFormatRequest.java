/**
 * 
 */
package com.price.formatter.io;

/**
 * Input data format
 * 
 * @author sidonepudi
 *
 */
public class PriceFormatRequest {

	private double rawPrice;
	private DisplayFormat displayFormat;
	private int dealingPriceLength;
	private int fractionalPipLength;
	private int scale;

	public double getRawPrice() {
		return rawPrice;
	}

	public void setRawPrice(double rawPrice) {
		this.rawPrice = rawPrice;
	}

	public DisplayFormat getDisplayFormat() {
		return displayFormat;
	}

	public void setDisplayFormat(DisplayFormat displayFormat) {
		this.displayFormat = displayFormat;
	}

	public int getDealingPriceLength() {
		return dealingPriceLength;
	}

	public void setDealingPriceLength(int dealingPriceLength) {
		this.dealingPriceLength = dealingPriceLength;
	}

	public int getFractionalPipLength() {
		return fractionalPipLength;
	}

	public void setFractionalPipLength(int fractionalPipLength) {
		this.fractionalPipLength = fractionalPipLength;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	@Override
	public String toString() {
		return "PriceFormatRequest [rawPrice=" + rawPrice + ", displayFormat=" + displayFormat + ", dealingPriceLength="
				+ dealingPriceLength + ", fractionalPipLength=" + fractionalPipLength + ", scale=" + scale + "]";
	}
	
	/**
	 * Various display formats
	 * 
	 * @author sidonepudi
	 *
	 */
	 public static enum DisplayFormat {

		DECIMAL(1), PERCENTAGE(100), MILE(1000), BASIS_POINT(10000);

		private int value;

		DisplayFormat(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	 }
}

