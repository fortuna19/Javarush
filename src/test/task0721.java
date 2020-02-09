package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class task0721 {


/*
Минимаксы в массивах
*/

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int maximum;
            int minimum;

            int[] array = new int[20];
            for (int i = 0; i < 20; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }

            maximum = array[0];
            for (int i = 1; i < array.length; i++){
                if (maximum < array[i]){
                    maximum = array[i];
                }
            }

            minimum = array[0];
            for (int i = 1; i < array.length; i++){
                if (minimum > array[i]){
                    minimum = array[i];
                }
            }
            

            System.out.print(maximum + " " + minimum);
        }
    }
