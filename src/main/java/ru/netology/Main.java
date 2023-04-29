package ru.netology;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println("Сумма " + intsCalc.sum(3, 5));
        System.out.println("Вычитание " + intsCalc.sub(20, 5));
        System.out.println("Умножение " + intsCalc.mult(3, 8));
        System.out.println("Деление " + intsCalc.div(6, 4));
        System.out.println("Возведение в степень " + intsCalc.pow(2, 5));
    }
}