package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukan angka pertama:");
        int x, y, hasil;
        x = sc.nextInt();
        System.out.println("masukan angka kedua");
        y = sc.nextInt();
        hasil = (x+y);
        
        System.out.println("Hasil penjumlahan data diatas = "+hasil);
        
    }
    
}
