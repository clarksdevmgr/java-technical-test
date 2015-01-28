package com.clarks.technicaltest.domain;

import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @NotNull
    @Column(name = "id", nullable = false, updatable = false)
    private String productId;

    private Product() {
    }

    public Product(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("productId", productId)
                .toString();
    }
}
