package kevin.jugg.order_service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import kevin.jugg.order_service.domain.ProductOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:订单业务类Mapper
 * @Author: Kevin
 * @Create 2020-01-09 18:17
 */
@Mapper
public interface ProductOderMapper extends BaseMapper<ProductOrder> {
    
}
