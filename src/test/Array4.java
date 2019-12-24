/*
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать большой массив на 20 целых чисел.
•	Программа должна считывать с клавиатуры 20 чисел для большого массива.
•	Программа должна создавать два маленьких массива на 10 чисел каждый.
•	Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.
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
12
45
98
111
42
98
98
-9
71
-150
 */

package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array4 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] bigArray = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        int[] smallArray1 = new int[bigArray.length / 2];
        int[] smallArray2 = new int[bigArray.length / 2];

        //coping to 1st array
        for (int i = 0; i < 10; i++) {
            smallArray1[i] = bigArray[i];
        }

        //coping to 2nd array
        for (int i = 10; i < 20; i++) {
            smallArray2[i - 10] = bigArray[i];
        }

        //Output 2nd small array
        for (int i = 0; i < 10; i++) {
            System.out.println(smallArray2[i]);
        }
    }

}
