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
public class penjualanlaptop {
    
    public static void main(String[] args){
        //Deklarasi variabel
        String[] laptop = {"asus","acer","lenovo","macbook"};
        int[] harga = {7000,5000,4500,12000};
        
        System.out.println("-------------------SELAMAT DATANG DI TOKO LAP-TOP--------------------");
        System.out.println("--------------------------SELAMAT BELANJA----------------------------");
        System.out.println("---------------------------------------------------------------------");
        
        for (int a=0; a<harga.length;a++){
            System.out.println(a+". "+laptop[a]+" harganya adalah "+harga[a]);
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Kamu Mau Yang Mana        :");
        
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Oh Jadi Kamu Mau Yang Ini : "+laptop[pilihan]);
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Kamu Bawa Uang Berapa Sih : ");
        int bayar = input.nextInt();
        System.out.print("Ada Diskon Nich Buat Kamu : ");
            int diskon = input.nextInt();
        if(bayar > harga[pilihan]-diskon){
            System.out.println("Kembalian Mu Nich     : "+(bayar-harga[pilihan]+diskon));
            System.out.println("-------------------------TERIMA KASIH----------------------------");
            System.out.println("--------------------HATI - HATI BANYAK COPET---------------------");
        }else if (bayar == harga[pilihan]-diskon){
            System.out.println("Uang Kamu Pas");
            System.out.println("-------------------------TERIMA KASIH----------------------------");
            System.out.println("--------------------HATI - HATI BANYAK COPET---------------------");
        }else{
            System.out.println("Uang Kamu Kurang Nich : "+(harga[pilihan]-bayar+diskon));
            System.out.println("---------------------HARUS RAJIN MENABUNG YA---------------------");
            System.out.println("---------------SEMOGA BESOK UANGNYA DAH CUKUP YA-----------------");
        }
        
        }
    }
    
        
    
