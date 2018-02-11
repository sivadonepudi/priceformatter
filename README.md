Notes: - 
---------
1. This is restful service that returns the price format responses for the various requested input types
2. It is developed by using Java, JAX-RS, Spring, SpringBoot, Maven.
3. To run the Price formatter Service 
 priceformatter> `java -jar target/priceformatter-0.0.1-SNAPSHOT.jar com.price.formatter.PriceformatterApplication`
4. To import the requests 
	https://www.getpostman.com/collections/4f74518ae2541c70f09a
	

	
Sample Request: - 
{
	"rawPrice" : "47.92",
	"displayFormat" : "DECIMAL",
	"dealingPriceLength" : "2",
	"fractionalPipLength" : "3",
	"scale": "4"
}

Sample Response: - 
{
    "bigFigure": "4",
    "dealingPrice": "7.9",
    "fractionalPips": "2"
}
	