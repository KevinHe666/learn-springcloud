package kevin.jugg.rabbitmqprovider;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName Sender
 * @Description Sender
 * @Author Kevin
 * @Date 2021/1/25 6:17 下午
 * @Version 1.0
 **/
@Component
public class Sender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send() {
        String message = "Hello World!";
        /**
         * 第一个参数：交换机名称
         * 第二个参数：路由key名称
         * 第三个参数：发送的消息
         */
        rabbitTemplate.convertAndSend("topicExchange", "topic.msg", message);
        System.out.println("发送：" + message);
    }
}
