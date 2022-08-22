package com.project.kcookserver.product.repository;

import com.project.kcookserver.product.dto.ProductListRes;
import com.project.kcookserver.product.entity.Product;
import com.project.kcookserver.product.vo.PopularProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductRepositoryCustom {
    Page<Product> findAllCakeProduct(Pageable pageable, String event, String options, Integer lowPrice, Integer highPrice, String area);

    Page<Product> findAllAdditionalProduct(Pageable pageable, String options, Integer lowPrice, Integer highPrice, String area);

    Page<PopularProduct> findAllPopularProducts(Pageable pageable);

	Page<ProductListRes> findRecentUpdatedProducts(Pageable pageable);
}
