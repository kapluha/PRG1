/**
 * Created by akaplun on 27.03.2015.
 */
public class PZ1 {
    public static byte myByte = 0;
    public static short myShort = 500;
    public static int myInt = 555555;
    public static long myLong = 99999999999l;

    public static float myFloat = 555.55f;
    public static double myDouble  = 555.55;

    public static char myChar = 'U';
    public static boolean myBoolean = false;

    //2)

    public static float myFloat1;
    public static float myFloat2;
    public static float myFloat3;
    public static float myFloat4;
    public static float myFloat5;
    public static float myFloat6;




    public static void main(String args[]) {

        byte myByte = 5;
        short myShort = 555;
        short myShort1 = 555;
        int myInt = 4444;
        long myLong = 8888888888l;

        float myFloat = 444.44f;
        double myDouble  = 556671.55;

        char myChar = 'З';
        boolean myBoolean = true;

        myFloat1 = 1.f;
        myFloat2 = 1f;
        myFloat3 = 0x1;
       // myFloat4 = 0b1; -- НЕЗЯ
        myFloat5 = 1.0e1f;
        myFloat6 = 01;

        /*
        3) Создайте переменную типа short. Инициализаируйте ее результатом выполнения следующих операций:
            - суммой двух целых чисел;
            - суммой целого и дробного чисел; // НЕЗЯ
            - суммой значений переменных типов float и int;// НЕЗЯ
            - суммой значений переменных типа byte + short;
            - суммой значений переменных типа float + double;// НЕЗЯ
        * */

        myShort = 1+1;
        myShort =  (short) (myByte + myShort1);

        /* 4) Заданы значения 2-х катетов и гипотенузы треугольника.
            Проверить является ли данный треугольник прямоугольным.
            Вычисления записать выражением, состоящим из одной строки (используя оператор “?:”).
         */

        float katet1 = 2f, katet2 = 2f, gipotenuza = 4f;
        boolean rectangular;

        rectangular = ((gipotenuza * gipotenuza) == (katet1 * katet1 + katet2 * katet2)) ? true : false;

        //5) Подсчитать сумму целых чисел от 1 до 20.
        short summa = 0, i = 0;

        while (i <= 20){
            summa += i++;
        }
        System.out.println(summa);

        summa = 0;
        i = 0;
        //6) Подсчитать сумму четных целых цисел от 1 до 20.
        while (i <= 20){
            summa += i;
            i += 2;
        }
        System.out.println(summa);
        //7) Подсчитать сумму простых чисел в диапазоне от 1 до 20.
        summa = 0;
        i = 2;
        boolean z = true;

        while (i <= 20){
            for (int j = 2; j < i; j++) {
                if (( i % j) > 0){
                    continue;
                }
                z = false;
            }

            if (z) {
                summa += i;
                //System.out.println(i);
            }
            z = true;
            i++;
        }
        System.out.println(summa);

        /* VOV int i = 2;
        for (; i <= 20; i++) {
            for (int x = 2; x <= 20; x++) {

                if (i % x == 0 && i != x) {
                    break;
                }else {
                    if (x == 20) System.out.println(i);
                }
            }
        }
        */


        //8) Имея три переменных типа int a, b, c выведите на экран “true”,
        // если сумма значений двух любых из этих переменных равна значению третьей.
        int a,b,c;
        for (a = 1; a <= 20; a++){
            for (b = 1; b <= 20; b++){
                for (c = 1; c <= 20; c++){
                    if ((a + b == c) || (a + c == b) || (c + b == a)){
                        System.out.println("a = " + a + " b = " + b + "c = " + c + " - " + true);
                    }
                }
            }
        }

        //9) Две переменные типа int, имеют положительные значения int a - начало диапазона, int b - конец диапазона, a>b.
        // Вычислить среднее значение чисел в заданном диапазоне.
        a = 20;
        b = 0;
        float average = 0;
        int col = a - b + 1;

        do {
            average += a--;
        }
        while (a > b);

        average /= col;
        System.out.println(average);

        /*10) Написать программу расчета обязательных платежей кредитора при пользовании банковским кредитом.
        Задание:
        а) Для каждого месяца вывести на экран сумму к оплате по телу кредита и начисленные проценты
        б) Суммарное значение выплаченных процентов за период пользования кредитом.
        Исходные данные: Сумма кредита, процентная ставка, срок кредитования.
        */

        float sumCredit = 50000,  interestRate = 5, allInterestRate = 0;
        int period = 36;
        for (int month = 1; month <= period; month++){
            System.out.println("Month № " + month);
            System.out.println("Sum for payment on a body = " + (sumCredit / period));
            System.out.println("Sum for payment on a interest rate = " + ((sumCredit - (sumCredit / period) * (month-1) ) * interestRate / 100) );

            allInterestRate += ((sumCredit - (sumCredit / period) * (month-1) ) * interestRate / 100);
        }
        System.out.println("Sum for payment ALL interest rate = " + allInterestRate);




        /*    System.out.println(myInt);
            System.out.println(myLong);
            System.out.println(myFloat);
            System.out.println(myDouble);
            System.out.println(myChar);
            System.out.println(myBoolean);*/

    }
}

