package kalkulator;
import java.util.*;

public class Kalkulator {

    public static void main(String[] args) {
        
        Scanner inputUser;
        int angka1;
        char operator;
        int angka2;
        int hasil;
        
        inputUser =  new Scanner(System.in);
        System.out.print("Masukan angka pertama: ");
        angka1 = inputUser.nextInt();
     
        System.out.print("Masukan Operator: ");
        operator = inputUser.next().charAt(0);
        
        System.out.print("Masukan angka kedua: ");
        angka2 = inputUser.nextInt();
        
        if (operator == '+'){
            hasil = angka1+angka2;
            System.out.println("Hasil penjumlahan "+angka1+operator+angka2+"="+hasil);
        } else if (operator =='-'){
            hasil = angka1-angka2;
            System.out.println("Hasil pengurangan "+angka1+operator+angka2+"="+hasil);
       } else if (operator =='*'){
            hasil = angka1*angka2;
            System.out.println("Hasil perkalian "+angka1+operator+angka2+"="+hasil);
       } else if (operator =='/'){
            hasil = angka1/angka2;
            System.out.println("Hasil pembagian "+angka1+operator+angka2+"="+hasil);
        } else {
            System.out.println("Masukan salah");
        }    
    }
}
