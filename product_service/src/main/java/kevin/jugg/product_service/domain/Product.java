package kevin.jugg.product_service.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description:商品类
 * @Author: Kevin
 * @Create 2020-01-09 14:47
 */
@Data
public class Product implements Serializable {
    public Product(int id, String name, int price, int store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }

    /**
     * id
     */
    private int id;
    /**
     * 商品名字
     */
    private String name;
    /**
     * 价格 分为单位
     */
    private int price;
    /**
     * 库存
     */
    private int store;
}
