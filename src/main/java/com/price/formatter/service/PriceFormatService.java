/**
 * 
 */
package com.price.formatter.service;

import com.price.formatter.io.PriceFormatRequest;
import com.price.formatter.io.PriceFormatResponse;

/**
 * Service layer i.e computing the display format
 * 
 * @author sidonepudi
 *
 */
public interface PriceFormatService {

	public PriceFormatResponse format(PriceFormatRequest req);

}
