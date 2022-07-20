package com.java8topics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class ComparatorComparableJava8 {

    public static  void main(String arr[])
    {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Force Awakens", 83, 2015));
        list.add(new Employee("Star Wars", 87, 1977));
        list.add(new Employee("Empire Strikes Back", 88, 1980));
        list.add(new Employee("Return of the Jedi", 84, 1983));

        //list.stream().sorted().forEach(x->System.out.println(x.getName()));
        list.stream().sorted((o1,o2)->(int)o1.getAge()-o2.getAge()).forEach(x->System.out.println(x.getName()));
        list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(x->System.out.println(x.getName()));

        list.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(x->System.out.println(x.getName()));


    }
}

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    // constructors, getters & setters
}
