package KVBO0821_Baybakov;

import java.util.Scanner;

public class Pr1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum = 0;
        double average = 0;
        System.out.println("Введите 10 целочисленных элементов массива: ");
        for(int i=0; i < 10; i++){
            int n = sc.nextInt();
            a[i] = n;
            sum += n;
            average += n;
        }
        average /= a.length;
        System.out.print("Сумма чисел массива: ");
        System.out.println(sum);
        System.out.print("Среднее арифметическое массива: ");
        System.out.println(average);
    }
}
