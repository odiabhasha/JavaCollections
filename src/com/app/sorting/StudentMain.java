package com.app.sorting;

import java.util.*;

public class StudentMain {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(5,"John","26-08-1991",5));
        list.add(new Student(3,"John","26-08-1991",9));
        list.add(new Student(6,"Kiran","20-01-1992",2));
        list.add(new Student(8,"Lov","01-05-1995",7));
        list.add(new Student(7,"Guru","19-07-2020",3));
        list.add(new Student(1,"Ram","12-08-1999",1));

        System.out.println("Before Duplicate Removed");
        System.out.println(list.toString());
        HashSet<Student> hashSet = new HashSet<Student>();
        hashSet.addAll(list);
        list.clear();
        list.addAll(hashSet);
        System.out.println("After Duplicate Removed");
        System.out.println(hashSet.toString());

        System.out.println(list.get(0).equals(list.get(1)));

        System.out.println("After Sort");
        //Collections.sort(list, new StudentComparator(StudentComparator.SORT_GRADE_DESCENDING));
        list.sort(new StudentComparator(StudentComparator.SORT_DEFAULT));
        System.out.println(list.toString());
    }
}
