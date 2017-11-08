package program.com.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import program.com.model.Product;
import program.com.services.ProductService;

@Path("/products")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {

	ProductService ps = new ProductService();

	@GET
	// @Produces(MediaType.APPLICATION_XML)
	public List<Product> getProducts() {
		return ps.getAllProducts();
	}

	@GET
	@Path("/{prodId}")
	public Product getProductById(@PathParam("prodId") String id) {
		System.out.println(id);
		return ps.getProductById(id);
	}

}
