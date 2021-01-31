package kevin.jugg.cache_server.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName RBTree
 * @Description TODO
 * @Author Kevin
 * @Date 2020/7/13 8:53 下午
 * @Version
 */
public class RBTree {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        String s = map.get("3");
        System.out.println(s);
        TreeMap<Object, Object> objectObjectTreeMap = new TreeMap<>();
    }
}
