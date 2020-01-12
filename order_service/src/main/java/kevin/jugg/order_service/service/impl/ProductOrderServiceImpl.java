package kevin.jugg.order_service.service.impl;

import kevin.jugg.order_service.domain.ProductOrder;
import kevin.jugg.order_service.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.UUID;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2020-01-09 18:18
 */
@Service
public class ProductOrderServiceImpl implements ProductOrderService {
//    @Autowired
//    private RestTemplate restTemplate;

    @Override
    public ProductOrder save(int userId, int productId) {
        //获取商品详情 dubbo是调用方法 普通http调用用httpclient 这里用ribbon
//        restTemplate.getForObject("", Object.class);

        ProductOrder productOrder = new ProductOrder();
        productOrder.setCreateTime(new Date());
        productOrder.setUserId(userId);
        productOrder.setTradeNo(UUID.randomUUID().toString());
        return productOrder;
    }
}
