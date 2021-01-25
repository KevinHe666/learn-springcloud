package kevin.jugg.rabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName Consumer
 * @Description Rabbit Consumer
 * @Author Kevin
 * @Date 2021/1/25 6:20 下午
 * @Version 1.0
 **/
@Component
//监听队列
@RabbitListener(queues = "topics")
public class Consumer {
    //表示接收消息后的处理方法
    @RabbitHandler
    public void recv(String message) {
        System.out.println("接收消息：" + message);
    }
}
