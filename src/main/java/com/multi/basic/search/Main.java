package com.multi.basic.search;

import java.util.Arrays;
import java.util.Comparator;

class Person {
    String name;
    int height;
    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }
    @Override
    public String toString() {
        return name + " (" + height + "cm)";
    }
}
//키를 비교하는 비교기
class HeightComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o2.height, o1.height);
    }
}
// 이름(name)을 기준으로 비교하는 Comparator
class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p2.name.compareTo(p1.name); // 이름을 기준으로 비교 (사전순)
    }
}
public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Ajax", 170),
                new Person("Tree", 160),
                new Person("Heap", 180)
        };
        // 키로 정렬
        Arrays.sort(people, new HeightComparator());
        System.out.println("키로 정렬된 결과:");
        for (Person p : people) {
            System.out.println(p);
        }
//        //이름으로 정렬
        Arrays.sort(people, new NameComparator());
        System.out.println("이름으로 정렬된 결과:");
        for (Person p : people) {
            System.out.println(p);
        }



    }
}
