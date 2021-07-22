package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.model.Province;

public interface IProductService extends IGeneralService<Product> {
    Iterable<Product> findAllByProvince(Province province);
}