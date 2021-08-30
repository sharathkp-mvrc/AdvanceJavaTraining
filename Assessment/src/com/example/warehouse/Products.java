package com.example.warehouse;

public class Products {

    int totalProducts,productPrize;
    String productType,productDescription;

    public Products() {
        this.productType = productType;
        this.productDescription = productDescription;
        this.productPrize = productPrize;
    }
    public int getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(int totalProducts) {
        this.totalProducts = totalProducts;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductPrize() {
        return productPrize;
    }

    public void setProductPrize(int productPrize) {
        this.productPrize = productPrize;
    }

}
