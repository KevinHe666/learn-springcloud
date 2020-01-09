package kevin.jugg.product_service.service.impl;

import kevin.jugg.product_service.domain.Product;
import kevin.jugg.product_service.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Description:商品服务类
 * @Author: Kevin
 * @Create 2020-01-09 15:00
 */
@Service
public class ProductServiceImpl implements ProductService {

    private static final Map<Integer, Product> daoMap = new HashMap<>();

    static {
        Product p1 = new Product(1, "iphonex", 9999, 10);
        Product p2 = new Product(2, "ipad", 123, 100);
        Product p3 = new Product(3, "table", 234, 101);
        Product p4 = new Product(4, "book", 23434, 103);
        Product p5 = new Product(5, "apple", 123123, 104);
        Product p6 = new Product(6, "oranage", 23424, 150);
        Product p7 = new Product(7, "banana", 1235, 180);
        Product p8 = new Product(8, "computer", 123, 160);
        daoMap.put(p1.getId(), p1);
        daoMap.put(p2.getId(), p2);
        daoMap.put(p3.getId(), p3);
        daoMap.put(p4.getId(), p4);
        daoMap.put(p5.getId(), p5);
        daoMap.put(p6.getId(), p6);
        daoMap.put(p7.getId(), p7);
        daoMap.put(p8.getId(), p8);
    }

    @Override
    public List<Product> listProduct() {
        Collection<Product> collection = daoMap.values();
        List<Product> list = new ArrayList<>(collection);
        return list;
    }

    @Override
    public Product findById(int id) {
        return daoMap.get(id);
    }
}
