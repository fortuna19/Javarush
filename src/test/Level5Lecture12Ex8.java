/*
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.

Требования:
•	Программа должна считывать числа с клавиатуры.
•	Программа должна выводить число на экран.
•	В классе должен быть метод public static void main.
•	Нельзя добавлять новые методы в класс Solution.
•	Программа должна выводить на экран максимальное из введенных N чисел.
•	Программа не должна ничего выводить на экран, если N меньше либо равно 0.
*/

package test;

import java.io.*;

public class Level5Lecture12Ex8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        if (N > 0) {
            int maximum = Integer.parseInt(reader.readLine());
            while (N > 0) {
                if (N > 1) {
                    int a = Integer.parseInt(reader.readLine());
                    maximum = a < maximum ? maximum : a;
                }
                N--;
            }
            System.out.println(maximum);
        }
    }
}