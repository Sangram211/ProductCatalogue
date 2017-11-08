package program.com.database;

import java.util.HashMap;
import java.util.Map;

import program.com.model.Product;

public class ProductDao {

	Map<String, Product> products = new HashMap<>();

	public ProductDao() {

		products.put("1", new Product("1", "SonyTV", 100, "Large LED"));
		products.put("2", new Product("2", "Vedicon TV", 90, "Large"));
		products.put("3", new Product("3", "AC", 200, "5*"));
	}

	public Map<String, Product> getAllProducts() {
		return products;
	}

}
