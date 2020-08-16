package test.test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/3/31 18:58
 */
public class Ma2 {
    public static void main(String[] args) {
        int a = -1;
        int b = 0;
        int c=  1;
        int d = 5;
        String s1 = "aaa";
        String s2 = new String("aaa");
        String s3 = new String("aaa");
        System.out.println(s3 == s2);
        ClassLoader classLoader = Ma2.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
        HashMap hashMap = new HashMap(16);
        hashMap.put("a","1");
        hashMap.put("b","2");
        hashMap.put("c","3");
        hashMap.put("a","4");
        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        method(null);
        System.out.println("23");
    }

    public static void method(String param) {
        switch (param) {
            case "a":
                System.out.println("a");
                break;
            case "null":
                System.out.println("null");
                break;
            default:
                System.out.println("default");
        }

    }
}
