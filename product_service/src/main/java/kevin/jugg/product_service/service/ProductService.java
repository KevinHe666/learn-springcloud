package kevin.jugg.product_service.service;

import kevin.jugg.product_service.domain.Product;

import java.util.List;

/**
 * @Description:商品服务接口
 * @Author: Kevin
 * @Create 2020-01-09 14:58
 */
public interface ProductService {
    /**
     * 商品列表
     *
     * @return
     */
    List<Product> listProduct();

    /**
     * 查询接口
     *
     * @param id
     * @return
     */
    Product findById(int id);
}
