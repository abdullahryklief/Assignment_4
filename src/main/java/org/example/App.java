package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public void ListExample()
    {
        List<String> list = new ArrayList<>();
        list.add("Abdullah");
        list.add("Waseem");
        list.add("Ridhaa");
        list.add("Yaseen");
        list.add("Junaid");
        list.add("Abdullah");
    }

    public void SetExample()
    {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(1);

        Set<String> set2 = new TreeSet<>();
        set2.add("Abdullah");
        set2.add("Ridhaa");
        set2.add("Yaseen");
        set2.add("Abdullah");
    }

    public void MapExample()
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Abdullah");
        map.put(2, "Ridhaa");
        map.put(3, "Yaseen");
        map.put(4, "Waseem");
        map.put(1, "Junaid");
    }
}
