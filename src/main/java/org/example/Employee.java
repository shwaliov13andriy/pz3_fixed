package org.example;

public class Employee {
    public String label = "базове значення, Працівник";

    public Employee(String name) {
        System.out.println("-> Крок 1: Employee, конструктор базового класу. Ім'я: " + name);
    }

    public void describe() {
        System.out.println("Виконується метод describe з базового класу Employee");
    }
}