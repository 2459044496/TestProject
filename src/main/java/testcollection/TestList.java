package testcollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CUI
 */
public class TestList {
    public static void main(String[] args) {
        List list = new ArrayList(3);
        list.add(1);
        list.add(2);
        list.hashCode();
        System.out.println();
        //idea默认的快捷键是sout
        System.out.println(list.hashCode());
        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }

}
