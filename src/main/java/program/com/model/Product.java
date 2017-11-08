package program.com.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	public String id;
	public String pname;
	public int price;
	public String description;

	public Product() {

	}

	public Product(String id, String pname, int price, String description) {
		this.id = id;
		this.pname = pname;
		this.price = price;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
