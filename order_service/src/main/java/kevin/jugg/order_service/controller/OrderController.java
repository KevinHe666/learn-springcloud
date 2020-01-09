package kevin.jugg.order_service.controller;

import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import kevin.jugg.order_service.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2020-01-09 18:16
 */
@RestController
@RequestMapping("api/v1/order/save")
public class OrderController {
    @Autowired
    ProductOrderService productOrderService;

    public Object save(@RequestParam("user_id") int userId, @RequestParam("product_id") int productId) {
        return null;
    }
}
