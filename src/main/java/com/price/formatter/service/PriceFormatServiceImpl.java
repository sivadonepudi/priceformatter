/**
 * 
 */
package com.price.formatter.service;

import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

import com.price.formatter.io.PriceFormatRequest;
import com.price.formatter.io.PriceFormatResponse;

/**
 * Service layer i.e computing the display format
 * 
 * @author sidonepudi
 *
 */
@Service
public class PriceFormatServiceImpl implements PriceFormatService {

	public PriceFormatResponse format(PriceFormatRequest req) {
		DecimalFormat decimalFormat = new DecimalFormat(".#####");

		String tail = "";
		String bigFigure = "";
		String dealingPrice = "";
		String fractionalPips = "";

		int displayFormatValue = req.getDisplayFormat().getValue();
		String input4Format = decimalFormat.format(req.getRawPrice() * displayFormatValue);

		int bigFigureSplitter = String.valueOf(displayFormatValue).length();

		if (bigFigureSplitter > input4Format.length()) {
			tail = input4Format;
		} else {
			bigFigure = input4Format.substring(0, bigFigureSplitter);
			tail = input4Format.substring(bigFigureSplitter);
		}

		if (bigFigure.contains(".")) {
			bigFigure = input4Format.substring(0, ++bigFigureSplitter);
			tail = input4Format.substring(bigFigureSplitter);
		}

		dealingPrice = tail.length() > req.getDealingPriceLength() ? tail.substring(0, req.getDealingPriceLength())
				: tail;

		if (dealingPrice.contains(".")) {
			int dealingPriceLength = req.getDealingPriceLength();
			dealingPrice = tail.substring(0, ++dealingPriceLength);
			fractionalPips = tail.length() > req.getDealingPriceLength() ? tail.substring(dealingPriceLength) : "";
		} else {
			fractionalPips = tail.length() > req.getDealingPriceLength() ? tail.substring(req.getDealingPriceLength())
					: "";
		}

		return new PriceFormatResponse(bigFigure, dealingPrice, fractionalPips);
	}

}
