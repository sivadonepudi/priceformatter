/**
 * 
 */
package com.price.formatter.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.price.formatter.io.PriceFormatRequest;
import com.price.formatter.io.PriceFormatResponse;
import com.price.formatter.service.PriceFormatService;

/**
 * Exposes the entry point for the application
 * 
 * @author sidonepudi
 *
 */
@RestController
@RequestMapping("/priceformatter")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public class PriceFormatController {

	@Autowired
	PriceFormatService priceFormatService;

	@RequestMapping("/format")
	@POST
	public PriceFormatResponse format(@RequestBody PriceFormatRequest req) {
		return priceFormatService.format(req);
	}

}
