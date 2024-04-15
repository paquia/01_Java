package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. Map 의 자료구조에 대해 이해하고 HashMap 을 이용할 수 있다. */
        /* 필기.
         *   Map 인터페이스의 특징
         *   Collection 인터페이스 와는 다른 저장 방식을 가진다.
         *   키(key) 와 값(value) 를 하나의 쌍으로 저장하는 방식을 사용한다.
         *
         * 필기.
         *   키(key) 란?
         *   값(value) 를 찾기 위한 이름 역할을 하는 객체를 의미한다.
         *   1. 요소의 저장 순서를 유지하지 않는다.
         *   2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장 가능하다.
         *
         *  필기.
         *   HashMap, HashTable, TreeMap 등이 대표적인 클래스이다.
         *   HashMap 가장 많이 쓰인다.
         *  */

        HashMap hmap = new HashMap();

//        Map hmap2 = new HashMap();
//        List list = new ArrayList<>();

        // 키와 값 쌍으로 저장한다.
        // 키와 값 둘 다 반드시 객체여야 한다.
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);
        // autoBoxing 처리 됨 : 12 => new Integer(12)

        System.out.println("hmap = " + hmap);

        hmap.put(12, "fineapple");

        System.out.println("hmap = " + hmap);

        hmap.put(11, "fineapple");

        System.out.println("hmap = " + hmap);

        hmap.remove(11);
        System.out.println("hmap = " + hmap);

        System.out.println("키 12번에 대한 객체 : " + hmap.get(12));

        HashMap<String, String> hmap2 = new HashMap<>();

        hmap2.put("one", "java");
        hmap2.put("two", "mysql");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html");
        hmap2.put("five", "css");

        System.out.println("hmap2 = " + hmap2);

        /* 목차. 1. keySet()을 이용해서 키만 따로 set으로 만들고, iterator()로 키에 대한 목록 만듦  */
//		Set<String> keys = hmap2.keySet();
//		Iterator<String> keyIter = keys.iterator();

        Iterator<String> keyIter = hmap2.keySet().iterator();

        while (keyIter.hasNext()) {
            String key = (String) keyIter.next();
            String value = (String) hmap2.get(key);
            System.out.println(key + " = " + value);
        }

        /* 목차. 2. 저장된 value객체들만 values()로 Collection으로 만듦 */
        Collection<String> values = hmap2.values();

        /* 목차. 2-1. Iterator()로 목록 만들어서 처리 */
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()) {
            System.out.println(valueIter.next());
        }

        /* 목차. 2-2. 배열로 만들어서 처리 */
        Object[] valueArr = values.toArray();
        for (int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " : " + valueArr[i]);
        }

        /* 목차. 3. Map의 내부클래스인 EntrySet을 이용 : entrySet() */
        Set<Map.Entry<String, String>> set = hmap2.entrySet();
        /* 설명. Entry : 키 객체와 값 객체를 쌍으로 묶은 것 */
        Iterator<Map.Entry<String, String>> entryIter = set.iterator();
        while (entryIter.hasNext()) {
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
