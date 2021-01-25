package kevin.jugg.rabbitmqprovider;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitmqProviderApplication.class)
class RabbitmqProviderApplicationTests {
    @Autowired
    private Sender sender;

    @Test
    void contextLoads() {
        sender.send();
    }

}
