package lesson_04;

import javax.naming.Name;

public class HomeWork04 {
    public static void main(String[] args) {

        // тип данных умеющий хранить имена
        // Стринг хранит тексты/ инт хорошо отображает возраст (в целых числах)
        // для молока - тип данных которые умеют хранить дробную часть. Молоко это деньги нам понадобятся
        // дабл стоимость молока называем на анг.
        String name = "Name";
        int age = 100;
        double milkPrice = 1.40;

        System.out.println(name);
        // Разделительная черта
        System.out.println("--------------------------------------------------");

//Task 2
/*
все строки между звездачками воспринимаются компилятором
как закоментированный
Ctrl+D скопировать строку с курсором или несколько строк
*/
        int var1 = 0;
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;

        int average = (var1 + var2 + var3 + var4) / 4;   //можно писать составные v2 и появится Var3
        // джава придерживается приоритета сложения, по порядку от первой
        // = (2 + 4) / 4 приоритет выполнения мат операция - вначале деление и умножение (взятие остатка), а потом сложение и вычитание
        //  скобки имеют наивысший приоритет
        // Поставить ковычки или скобки - выделить слово и удержав ctrl нажать первую скобку или ковычки
        // Что бы вычислить остаток после деления можно добавить % как внизу

        int rest = (var1 + var2 + var3 + var4) % 4;

        System.out.println("Среднее: " + average);
        System.out.println("Остаток: " + rest);

        // Option 2 Сначала вычисисляем сумму, затем уже целую часть и осттоа

        int sum = var1 + var2 + var3 + var4;
        int average1 = sum / 4;   //можно писать составные v2 и появится Var3
        int rest1 = sum % 4;
        System.out.println(rest1);

        System.out.println("--------------------------------------------------");

// Task 3 цена в евро и может быть с копейками!!! тип инт не подходит, поменяются условия и все..
        // поэтому работаем с дабл/ Могут уточнить что нужно убрать скидку и это надо будет искать в коде
        // рекомендуется в виде переменных можно инт

        double priceA = 1000;
        double priceB = 500;

        int discount = 10; // в процентах

        // вначале выведем скидку дискаун мани
        // сложить цену 2 товаров и взять 10 %
        // умножить на 10 и разделить на 100
        double discountMoney = (priceA + priceB) * discount / 100;
        double priceWithDiscount = (priceA + priceB) - discountMoney;
        System.out.println("Сумма скидки: " + discountMoney);
        System.out.println("Сумма продукта: " + priceWithDiscount);

        // Второй вариант

        double priceWithDiscount2 = (priceA + priceB) * (100 - discount) / 100;
        System.out.println("Сложный вариант: " + priceWithDiscount2);

        System.out.println("--------------------------------------------------");

// Task 4 Данные для температуры среднее значение чисел
        // узнать сумму всех чисел деленное на колличество. Можно температуру в интовом вараинте
        // о среднее лучше взять в дабл. Что бы данные не отбросились и не потерялись


        int t = 20;
        int t1 = 18;
        int t2 = 22;
        int t3 = 17;
        int t4 = 23;
        int t5 = 21;
        int t6 = 20;

        int days = 7; // лучше отобразить сразу сумму что бы ничего не увеличивать в показателях
        int sumTemp = t + t1 + t2 + t3 + t4 + t5 + t6;
        System.out.println("sumTemp: " + sumTemp);
        // вначале дабл производит манипуляции / сложение справа
        // целочисленные отбрасываются - дальше происходит преобразование типов

        double averageTemp = (t + t1 + t2 + t3 + t4 + t5 + t6) / 7;
        System.out.println("Средняя температура: " + averageTemp);
// произошло не явное преобразование - все ты теперь дабл
        //Можно посчитать по другому:
        //   double averageTemp = sumTemp / days;
        //    double averageTemp = (double) sumTemp / days;

        //  System.out.println("AverageTemp: " + averageTemp);


    }
}
