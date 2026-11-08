package org.example;

public class Developer extends Employee {
    public String label = "похідне значення, Розробник";

    public Developer(String name) {
        super(name);
        System.out.println("-> Крок 2: Developer, конструктор похідного класу");
    }
    @Override
    public void describe() {
        System.out.println("Виконується метод describe з похідного класу Developer");
        super.describe();
    }
}