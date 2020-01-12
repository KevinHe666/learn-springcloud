package kevin.jugg.order_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "kevin.jugg.order_service.mapper")
public class OrderServiceApplication {
    /**
     * Ribbon类似httpClient
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
