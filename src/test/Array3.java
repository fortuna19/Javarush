/*
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать массив на 10 целых чисел.
•	Программа должна считывать числа для массива с клавиатуры.
•	Программа должна выводить 10 строчек, каждую с новой строки.
•	Массив должен быть выведен на экран в обратном порядке.
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
89
 */

package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array3 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] Array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Integer.parseInt(reader.readLine());
        }

        for (int a = Array.length - 1; a >= 0; a--) {
            System.out.println(Array[a]);
        }

    }


}
