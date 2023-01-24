package com.company.inventory.response;

public class ProductResponseRest extends ResponseRest {

	private ProductResponse product = new ProductResponse();

	public ProductResponse getProduct() {
		return product;
	}

	public void setProduct(ProductResponse product) {
		this.product = product;
	}

	
}
