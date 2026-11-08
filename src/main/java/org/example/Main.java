package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1. Дослідження порядку конструкторів ---");
        Employee manager = new Manager("Іван");
        System.out.println();
        Employee dev = new Developer("Олена");

        System.out.println("\n--- 2. Дослідження полів та методів ---");
        System.out.println("manager.label -> " + manager.label);
        System.out.println("Виклик manager.describe():");
        manager.describe();

        System.out.println("\ndev.label -> " + dev.label);
        System.out.println("Виклик dev.describe():");
        dev.describe();

        System.out.println("\n--- 3. Спроба присвоїти базовий об'єкт похідному посиланню ---");
        System.out.println("Рядок присвоєння закоментовано.");
        System.out.println("Причина помилки: базовий об'єкт не містить специфічних полів і методів похідного класу.");
    }
}