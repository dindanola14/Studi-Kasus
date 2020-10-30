/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class perhitungannilaiulangan {
    
    public static void main(String[] args){
        //Deklarasi variabel
        int soalsalah, skorsalah, skorbenarsemua, nilai;
        Scanner input = new Scanner(System.in);
        
    System.out.println("------------------PENILAIAN ULANGAN HARIAN MATEMATIKA PILIHAN GANDA--------------------");
    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println("Jumlah Soal Pilihan Ganda : 10 ");
    System.out.print("Jumlah Soal Salah         : ");
    soalsalah = input.nextInt();
   
    skorsalah = (soalsalah)*-10;
    skorbenarsemua = (10)*10;
    nilai = skorbenarsemua+skorsalah;
   
    System.out.println("Nilai Akhir               : " +nilai);  
    
    if(nilai > 90){
        System.out.println("\nAnda mendapat grade A");
        System.out.println("PERFECT!");
    }
    else if(nilai > 80){
        System.out.println("\nAnda mendapat grade B+");
        System.out.println("GOOD!");

    }
    else if(nilai > 70){
        System.out.println("\nAnda mendapat grade B");
        System.out.println("BELAJAR LAGI YUK!");

    }
    else if(nilai > 60){
        System.out.println("\nAnda mendapat grade C");
        System.out.println("BELAJAR LAGI YUK!");
    }
    else if(nilai > 50){
        System.out.println("\nAnda mendapat grade D");
        System.out.println("BESOK ORANG TUA KAMU KE SEKOLAH YA!");
    }
    else if(nilai > 40){
        System.out.println("\nAnda mendapat grade E");
        System.out.println("BESOK ORANG TUA KAMU KE SEKOLAH YA!");
    }
    else{
        System.out.println("\nAnda mendapat grade F");
        System.out.println("-----------------------BESOK ORANG TUA KAMU KE SEKOLAH YA---------------------------");
    }

    }
}
    
