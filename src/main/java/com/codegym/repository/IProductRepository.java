package com.codegym.repository;

import com.codegym.model.Product;
import com.codegym.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends CrudRepository<Product,Long> {
    Iterable<Product> findAllByProvince(Province province);
}
