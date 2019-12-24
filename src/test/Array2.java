/*
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

Требования:
•	Программа должна создавать массив на 10 строк.
•	Программа должна считывать 8 строк для массива с клавиатуры.
•	Программа должна выводить на экран 10 строк, каждую с новой строки.
•	Программа должна выводить на экран массив (10 элементов) в обратном порядке.
 */


package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] Array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            Array[i] = reader.readLine();
        }

        for (int a = 9; a >= 0; a--) {
            System.out.println(Array[a]);
        }
    }
}
