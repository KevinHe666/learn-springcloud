package kevin.jugg.cache_server.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import javax.swing.text.TabableView;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName NewTask
 * @Description TODO
 * @Author Kevin
 * @Date 2020/7/8 8:47 上午
 * @Version
 */
public class NewTask {
    private static final String TASK_QUEUE_NAME = "task_queue";

    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try {
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
            channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);
            System.out.println("输入要发送的消息以.结尾");
            Scanner input = new Scanner(System.in);
            String a = input.nextLine();
            String[] array = a.split(".");
            Arrays.asList(array).stream().forEach(s -> System.out.println(s));
            String message = String.join(" ", a);
            channel.basicPublish("", TASK_QUEUE_NAME,
                    MessageProperties.PERSISTENT_TEXT_PLAIN,
                    message.getBytes("UTF-8"));
            System.out.println(" [x] Sent '" + message + "'");
        } catch (Exception e) {

        }
    }
}
