package kevin.jugg.order_service;

import kevin.jugg.order_service.domain.ProductOrder;
import kevin.jugg.order_service.mapper.ProductOderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @Description TODO
 * @Author Kevin
 * @Date 2020-01-12 18:33
 * @Version V1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductOrderTest {
    @Autowired
    private ProductOderMapper productOderMapper;

    @Test
    public void test() {
        ProductOrder productOrder = productOderMapper.selectById(1);
        System.out.println(productOrder.toString());

    }
}
