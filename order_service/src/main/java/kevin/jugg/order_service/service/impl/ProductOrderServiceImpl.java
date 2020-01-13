package kevin.jugg.order_service.service.impl;

import kevin.jugg.order_service.domain.ProductOrder;
import kevin.jugg.order_service.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2020-01-09 18:18
 */
@Service
public class ProductOrderServiceImpl implements ProductOrderService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Override
    public ProductOrder save(int userId, int productId) {
        //获取商品详情 dubbo是调用方法 普通http调用用httpclient 这里用ribbon 调用的名称一定是配置文件里的名称
//        Object object = restTemplate.getForObject("http://product-service/api/v1/product/find?id=" + productId,
//        Object.class);
        //默认ribbon去做了负载均衡 商品服务起多个节点会打到不同的服务上
//        System.out.println(object);
        Map<String, Object> productMap = restTemplate.getForObject("http://product-service/api/v1/product/find?id="
                + productId, Map.class);
        ProductOrder productOrder = new ProductOrder();
        productOrder.setCreateTime(new Date());
        productOrder.setUserId(userId);
        productOrder.setTradeNo(UUID.randomUUID().toString());
        productOrder.setProductName(productMap.get("name").toString());
        productOrder.setPrice(Integer.parseInt(productMap.get("price").toString()));
        return productOrder;
    }
}
