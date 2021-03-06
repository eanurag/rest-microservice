package com.globomart.microservices.object;

public class Product {
	private String id;
	private String name;
	private ProductType type;
	private Integer price;
	
	public Product(){
		
	}

	public Product(String id, String name, ProductType type, Integer price) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		final Product other = (Product) obj;

		if (!this.id.equalsIgnoreCase(other.id)) {
			return false;
		}
		return true;
	}

}
