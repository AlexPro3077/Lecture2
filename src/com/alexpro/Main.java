package com.alexpro;

import java.util.Scanner;

public class Main {
    //Вычисление частного
    private static void Task01() {
        Scanner scan = new Scanner(System.in);
        double x = 0D, y = 0D;
        System.out.println("Введите переменную x:");
        x = scan.nextDouble();
        System.out.println("Введите переменную y:");
        y = scan.nextDouble();
        if (y == 0) {
            System.out.println("Ошибка. На 0 делить нельзя!");
        } else {
            System.out.println(x / y);
        }
    }

    //Год основания Одессы
    private static void Task02() {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        System.out.println("В каком году была основана Одесса?");
        x = scan.nextInt();
        if (x == 1795) {
            System.out.println("Awesome!");
        } else {
            System.out.println("Вы ошиблись. Одесса была основана в 1975 году");
        }
    }

    //Расчет суммы покупки со скидкой
    private static void Task03() {
        Scanner scan = new Scanner(System.in);
        double x = 0D;
        System.out.println("Введите сумму покупки:");
        x = scan.nextDouble();
        if (x <= 500) {
            System.out.println("Сумма Вашей покупки " + x + " рублей. Скидок не предусмотрено");
        } else if (x >= 501 && x <= 1000) {
            System.out.println("Вам предоставленна скидка в 3%. Сумма Вашей покупки " + Math.round(x * 0.97) + " рублей с учетом скидки");
        } else {
            System.out.println("Вам предоставленна скидка в 5%. Сумма Вашей покупки " + Math.round(x * 0.95) + " рублей с учетом скидки");
        }
    }

    //Проверка четности числа
    private static void Task04() {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        System.out.println("Введите целое число, и нажмите <Enter>:");
        x = scan.nextInt();
        if (x % 2 == 0) {
            System.out.println("Число " + x + " четное");
        } else {
            System.out.println("Число " + x + " нечетное");
        }
    }

    //Проверка кратности трем
    private static void Task05() {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        System.out.println("Введите целое число, и нажмите <Enter>:");
        x = scan.nextInt();
        if (x % 3 == 0) {
            System.out.println("Число " + x + " делится на 3 без остатка. Результат деления составляет " + x / 3);
        } else {
            System.out.println("Число " + x + " на 3 без остатка не делится");
        }
    }

    //Расчет стоимости телефонного разговора со скидкой и без нее
    private static void Task06() {
        Scanner scan = new Scanner(System.in);
        int day = 0, x = 0;
        System.out.println("Стоимость разговора составляет 3 грн./1 мин.");
        System.out.println("В выходные дни предоставляется скидка в 20%");
        System.out.println("Введите номер дня недели");
        day = scan.nextInt();
        System.out.println("Введите время разговора (целое количество минут)");
        x = scan.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Рабочий день. Сумма разговора составляет " + x * 3 + " грн. Скидок не предусмотрено.");
                break;
            case 6:
            case 7:
                System.out.println("Выходной день. Предоставлена скидка в 20%.");
                System.out.println("Сумма разговора составляет " + x * 3 * 0.8 + " грн.");
                break;
            default:
                System.out.println("Некорректно введен день недели.");
        }
    }
//Сравнение цифр в трехзначном числе
private static void Task07() {
    Scanner scan = new Scanner(System.in);
    int num = 0, a = 0, b = 0, c = 0;
    System.out.println("Трехзначное число:");
    num = scan.nextInt();
    a = num / 100;
    b = (num - a * 100) / 10;
    c = num - (a * 100 + b * 10);
    if (a > c) {
        System.out.println("Первая цифра больше последней");
    } else if (a == c) {
        System.out.println("Первая и последняя цифра равны");
    } else {
        System.out.println("Последняя цифра больше первой");
    }
    if (a > b) {
        System.out.println("Первая цифра больше второй");
    } else if (a == c) {
        System.out.println("Первая и вторая цифра равны");
    } else {
        System.out.println("Вторая цифра больше первой");
    }
    if (b > c) {
        System.out.println("Вторая цифра больше последней");
    } else if (b == c) {
        System.out.println("Вторая и последняя цифра равны");
    } else {
        System.out.println("Последняя цифра больше второй");
    }
}
//Определить, равен ли квадрат трехзначного числа сумме кубов его цифр
private static void Task08() {
    Scanner scan = new Scanner(System.in);
    int num = 0, a = 0, b = 0, c = 0, res = 0, x=0, y=0,z=0;
    System.out.println("Трехзначное число:");
    num = scan.nextInt();
    a = num / 100;
    b = (num - a * 100) / 10;
    c = num - (a * 100 + b * 10);
    res = (int) Math.pow(num, 2);
    x = (int) Math.pow(a, 3);
    y = (int) Math.pow(b, 3);
    z = (int) Math.pow(c, 3);
    System.out.println("Квадрат числа равен " + res);
    System.out.println("Куб первой цифры равен " + x);
    System.out.println("Куб второй цифры равен " + y);
    System.out.println("Куб третьей цифры равен " + z);
    if (res == (x+y+z)){
        System.out.println("ДА! Квадрат числа " + num + " равен сумме кубов его цифр");
    }
    else {
        System.out.println("Квадрат числа " + num + " не равен сумме кубов его чисел");
    }
}
    //Замена х и у
    private static void Task09() {
        Scanner scan = new Scanner(System.in);
        double x = 0D, y = 0D;
        System.out.println("Введите x:");
        x = scan.nextDouble();
        System.out.println("Введите y:");
        y = scan.nextDouble();
        if (x < y) {
            System.out.println("x = " + (x + y) / 2 + " y = " + x * y * 2);
        } else if (x == y) {
            System.out.println("Числа не должны быть равными друг другу");
        } else {
            System.out.println("x = " + x * y * 2 + " y = " + (x + y) / 2);
        }
    }
//Программа решения уравнения ax^3 + bх = 0 для произвольных а и b
    private static void Task10() {
        Scanner scan = new Scanner(System.in);
        double a = 0D, b = 0D;
        System.out.println("Введите a:");
        a = scan.nextDouble();
        System.out.println("Введите b:");
        b = scan.nextDouble();
        if (a < 0 || b < 0) {
            System.out.println("x1 = 0, x2 = " + Math.sqrt(-b / a));
        } else {
            System.out.println("Уравнение не имеет решения");
        }
    }
    public static void main(String[] args) {
        Task01();
        Task02();
        Task03();
        Task04();
        Task05();
        Task06();
        Task07();
        Task08();
        Task09();
        Task10();
    }
}
