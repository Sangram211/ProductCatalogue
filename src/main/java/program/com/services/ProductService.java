package program.com.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import program.com.database.ProductDao;
import program.com.model.Product;

public class ProductService {

	ProductDao dao = new ProductDao();

	public ProductDao getDao() {
		return dao;
	}

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	Map<String, Product> prods = dao.getAllProducts();

	public List<Product> getAllProducts() {
		return new ArrayList<Product>(prods.values());
	}

	public Product getProductById(String id) {
		System.out.println("Id " + id);
		return prods.get(id);

	}

}
