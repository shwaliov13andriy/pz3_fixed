package org.example;

public class Manager extends Employee {
    public String label = "похідне значення, Менеджер";

    public Manager(String name) {
        super(name);
        System.out.println("-> Крок 2: Manager, конструктор похідного класу");
    }

    @Override
    public void describe() {
        System.out.println("Виконується метод describe з похідного класу Manager");
        super.describe();
    }
}