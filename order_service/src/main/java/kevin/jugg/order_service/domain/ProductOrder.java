package kevin.jugg.order_service.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:商品订单实体类
 * @Author: Kevin
 * @Create 2020-01-09 18:13
 */
@Data
public class ProductOrder implements Serializable {
    /**
     * id
     */
    private int id;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 流水号订单号
     */
    private String tradeNo;
    /**
     * 价格
     */
    private int price;
    /**
     * 下单时间
     */
    private Date createTime;
    /**
     * 用户id
     */
    private int userId;
    /**
     * 用户名称
     */
    private String userName;

}
