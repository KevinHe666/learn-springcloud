package kevin.jugg.product_service.controller;

import kevin.jugg.product_service.domain.Product;
import kevin.jugg.product_service.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2020-01-09 14:46
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Value("${server.port}")
    private String port;
    @Autowired
    ProductService productService;

    /**
     * 获取所有商品列表
     *
     * @return
     */
    @RequestMapping("list")
    public Object list() {
        return productService.listProduct();
    }

    /**
     * 根据id查找商品详情
     *
     * @param id
     * @return
     */
    @RequestMapping("find")
    public Object findById(@RequestParam("id") int id) {
        Product product = productService.findById(id);
        Product result = new Product();
        BeanUtils.copyProperties(product, result);
        product.setName(result.getName() + " data from port=" + port);
        return result;
    }
}
