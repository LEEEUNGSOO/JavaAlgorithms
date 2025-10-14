package com.multi.basic.recursive;

import java.util.LinkedHashMap;
import java.util.Map;

//LRU 가장 오래된 것부터 ...지운다
public class SimpleCache<K,V> {
    private final int capacity;
    private final LinkedHashMap<K,V> cache;

    public SimpleCache(int capacity) {
        this.capacity = capacity;
        this.cache=new LinkedHashMap<K,V>(capacity,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        };//내부클래스 (anonymouse)
    }//생성자

    public V get(K key) {
        return cache.getOrDefault(key,null);//key값이 없으면 null을 반환
    }
    public void put(K key, V value) {
        cache.put(key, value);
    }

    public static void main(String[] args) {
        SimpleCache<Integer,String> cache = new SimpleCache<Integer,String>(3);
        cache.put(1,"A");
        cache.put(2,"B");
        cache.put(3,"C");
        //System.out.println(cache.get(1));
        //{1=A, 2=B, 3=C}
        System.out.println(cache.get(1));//key값이 1번이 가장 최근사용 된다..
        //{2=B, 3=C, 1=A}
        cache.put(4,"D");
        System.out.println(cache.get(2));

    }

}//SimpleCache End
