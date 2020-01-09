package kevin.jugg.order_service.service;

import kevin.jugg.order_service.domain.ProductOrder;

/**
 * @Description:订单业务类
 * @Author: Kevin
 * @Create 2020-01-09 18:17
 */
public interface ProductOrderService {
    /**
     * 下单接口
     *
     * @param userId
     * @param productId
     * @return
     */
    ProductOrder save(int userId, int productId);
}
