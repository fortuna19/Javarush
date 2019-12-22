package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sort {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int i = 0;
        int temp;

        while (i < 5) {
            if (b > a) {
                temp = b;
                b = a;
                a = temp;
            }
            if (c > b) {
                temp = c;
                c = b;
                b = temp;
            }
            if (d > c) {
                temp = d;
                d = c;
                c = temp;
            }
            if (e > d) {
                temp = e;
                e = d;
                d = temp;
            }
            i++;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}

