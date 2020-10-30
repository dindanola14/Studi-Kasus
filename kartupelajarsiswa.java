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
public class kartupelajarsiswa {
    
    public static void main(String[] args){
        //Deklarasi variabel 
        String namasekolah, alamatsekolah, websekolah, emailsekolah, nama, nomerinduk, NIS, tanggallahir, agama, alamat;
        Scanner input = new Scanner(System.in);
       
        System.out.println("-----------------KARTU PELAJAR SISWA------------------");
        System.out.println("---------------PEMERINTAHAN KOTA MALANG---------------");
        System.out.println("-------------------DINAS PENDIDIKAN-------------------");
        System.out.print("Nama Sekolah   : ");
        namasekolah = input.nextLine();
        System.out.print("Alamat Sekolah : ");
        alamatsekolah = input.nextLine();
        System.out.print("Web Sekolah    : ");
        websekolah = input.nextLine();
        System.out.print("Email Sekolah  : ");
        emailsekolah = input.nextLine();
        System.out.println("----------------------Data Siswa----------------------");
        System.out.print("Nama           : ");
        nama = input.nextLine();
        System.out.print("Nomer Induk    : ");
        nomerinduk = input.nextLine();
        System.out.print("NIS            : ");
        NIS = input.nextLine();
        System.out.print("Tanggal Lahir  : ");
        tanggallahir = input.nextLine();
        System.out.print("Agama          : ");
        agama = input.nextLine();
        System.out.print("Alamat Rumah   : ");
        alamat = input.nextLine();
        System.out.println("---------------------KEPALA SEKOLAH-------------------");
        
        
        
    }
    
}
