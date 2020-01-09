package kevin.jugg.order_service.service.impl;

import kevin.jugg.order_service.domain.ProductOrder;
import kevin.jugg.order_service.service.ProductOrderService;

import java.util.Date;
import java.util.UUID;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2020-01-09 18:18
 */
public class ProductOrderServiceImpl implements ProductOrderService {
    @Override
    public ProductOrder save(int userId, int productId) {
        //获取商品详情 dubbo是调用方法 普通http调用用httpclient 这里用ribbon


        ProductOrder productOrder = new ProductOrder();
        productOrder.setCreateTime(new Date());
        productOrder.setUserId(userId);
        productOrder.setTradeNo(UUID.randomUUID().toString());
        return productOrder;
    }
}
