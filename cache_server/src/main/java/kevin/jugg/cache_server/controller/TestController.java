package kevin.jugg.cache_server.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author Kevin
 * @Date 2020/8/1 6:25 下午
 * @Version
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test")
    public void test() throws IOException {
        String data = "";
        ClassPathResource cpr = new ClassPathResource("id_rsa_lm_yirendai");
        byte[] bdata = FileCopyUtils.copyToByteArray(cpr.getInputStream());
        data = new String(bdata, StandardCharsets.UTF_8);
        System.out.println(data);

//        File file = org.springframework.util.ResourceUtils.
//                getFile("classpath:id_rsa_lm_yirendai");
//        fileTest(file, 10);
    }

    public static void fileTest(File file, int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());
        if (file == null || !file.exists()) {
            return;
        } else if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                fileTest(f, deep++);
            }
        }
    }
}
