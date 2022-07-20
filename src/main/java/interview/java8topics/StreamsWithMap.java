package com.java8topics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamsWithMap {

    public static  void main(String arr[])
    {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Force Awakens", 83, 2015));
        list.add(new Employee("Star Wars", 87, 1977));
        list.add(new Employee("Empire Strikes Back", 88, 1980));
        list.add(new Employee("Return of the Jedi", 84, 1983));


       var list1 =  list.stream().filter(emp-> emp.getAge()>60).
               map(emp->emp.getName().toUpperCase(Locale.ROOT)).sorted(Comparator.comparing(name->name))
               .collect(Collectors.toList());
        System.out.print(list1.toString());
       // list.stream().map()
        //Var books =  books.stream.filter(book->book.getAuthor().getAge()>=50).
        //
        // foreach(book->book.getAuthor().setLastName()(book.getAuthor().getLastName().uppercase())
        // .collect(Collectors.toSet());


        //list.stream().filter(emp->emp)

    }
}
