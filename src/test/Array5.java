/*
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - число жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.

Требования:
•	Программа должна создавать массив на 15 целых чисел.
•	Программа должна считывать числа для массива с клавиатуры.
•	Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
•	Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.
 */

/*
5
10
16
17
9
3
4
46
97
12
45
42
98
98
71
 */

package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array5 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] Array = new int[15]; // Array initialization

        //Padding an array with numbers from the keyboard
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Integer.parseInt(reader.readLine());
        }

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0)
                sumEven = sumEven + Array[i];
            else
                sumOdd = sumOdd + Array[i];
        }


        if (sumEven > sumOdd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }

}
