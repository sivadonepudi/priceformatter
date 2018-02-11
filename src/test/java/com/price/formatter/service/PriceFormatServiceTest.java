/**
 * 
 */
package com.price.formatter.service;

import static com.price.formatter.io.PriceFormatRequest.DisplayFormat;

import org.junit.Assert;
import org.junit.Test;

import com.price.formatter.io.PriceFormatRequest;
import com.price.formatter.io.PriceFormatResponse;
import com.price.formatter.service.PriceFormatService;
import com.price.formatter.service.PriceFormatServiceImpl;

/**
 * Test class for price format service
 * 
 * @author sidonepudi
 *
 */
public class PriceFormatServiceTest {

	@Test
	public void testFormterDecimal() {
		PriceFormatService priceFormatService = new PriceFormatServiceImpl();

		PriceFormatRequest req = new PriceFormatRequest();

		req.setRawPrice(47.92);
		req.setDisplayFormat(DisplayFormat.DECIMAL);
		req.setDealingPriceLength(2);
		req.setFractionalPipLength(3);
		req.setScale(4);

		PriceFormatResponse res = priceFormatService.format(req);
		Assert.assertEquals("verifying BigFigure", "4", res.getBigFigure());
		Assert.assertEquals("verifying DealingPrice", "7.9", res.getDealingPrice());
		Assert.assertEquals("verifying FractionalPips", "2", res.getFractionalPips());
	}

	@Test
	public void testFormterPercentage() {
		PriceFormatService priceFormatService = new PriceFormatServiceImpl();

		PriceFormatRequest req = new PriceFormatRequest();

		req.setRawPrice(0.1523);
		req.setDisplayFormat(DisplayFormat.PERCENTAGE);
		req.setDealingPriceLength(1);
		req.setFractionalPipLength(2);
		req.setScale(4);

		PriceFormatResponse res = priceFormatService.format(req);

		Assert.assertEquals("verifying BigFigure", "15.2", res.getBigFigure());
		Assert.assertEquals("verifying DealingPrice", "3", res.getDealingPrice());
		Assert.assertEquals("verifying FractionalPips", "", res.getFractionalPips());
	}

	@Test
	public void testFormterPercentage2() {
		PriceFormatService priceFormatService = new PriceFormatServiceImpl();

		PriceFormatRequest req = new PriceFormatRequest();

		req.setRawPrice(0.16754);
		req.setDisplayFormat(DisplayFormat.PERCENTAGE);
		req.setDealingPriceLength(1);
		req.setFractionalPipLength(2);
		req.setScale(4);

		PriceFormatResponse res = priceFormatService.format(req);

		Assert.assertEquals("verifying BigFigure", "16.7", res.getBigFigure());
		Assert.assertEquals("verifying DealingPrice", "5", res.getDealingPrice());
		Assert.assertEquals("verifying FractionalPips", "4", res.getFractionalPips());
	}

	@Test
	public void testFormterBasisPoint() {
		PriceFormatService priceFormatService = new PriceFormatServiceImpl();

		PriceFormatRequest req = new PriceFormatRequest();

		req.setRawPrice(0.0018);
		req.setDisplayFormat(DisplayFormat.BASIS_POINT);
		req.setDealingPriceLength(3);
		req.setFractionalPipLength(1);
		req.setScale(5);

		PriceFormatResponse res = priceFormatService.format(req);

		Assert.assertEquals("verifying BigFigure", "", res.getBigFigure());
		Assert.assertEquals("verifying DealingPrice", "18.0", res.getDealingPrice());
		Assert.assertEquals("verifying FractionalPips", "", res.getFractionalPips());
	}

}
