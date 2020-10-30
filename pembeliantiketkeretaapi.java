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
public class pembeliantiketkeretaapi {
    
    public static void main(String[] args){
        //Deklarasi variabel
        String kodebooking, nama, namaKA, tanggal, stasiunjamberangkat, stasiunjamtiba, kelas, nomerKA, tanggalpembayaran, jampembayaran, nomertempatduduk;
        int penumpang, dewasa, anak, bayi, biayaadminstrasi, yangharusdibayar;
        double hargadewasa, hargaanak, hargabayi, jumlahbayar;
        Scanner input = new Scanner(System.in);
        
        System.out.println("----------STRUK PEMBELIAN------------");
        System.out.println("----------TIKET KERETA API-----------");
        System.out.println("--------via www.tiketasik.com--------");
        System.out.println("-------------------------------------");
        System.out.print("Kode Booking          : ");
        kodebooking = input.nextLine();
        System.out.print("Nama                  : ");
        nama = input.nextLine();
        System.out.print("Nama KA               : ");
        namaKA = input.nextLine();
        System.out.print("Tgl. Keberangkatan    : ");
        tanggal = input.nextLine();
        System.out.print("Stasiun/Jam Berangkat : ");
        stasiunjamberangkat = input.nextLine();
        System.out.print("Stasiun/Jam Tiba      : ");
        stasiunjamtiba = input.nextLine();
        System.out.print("Kelas                 : ");
        kelas = input.nextLine();
        System.out.print("No. KA                : ");
        nomerKA = input.nextLine();
        System.out.print("Tgl. Pembayaran       : ");
        tanggalpembayaran = input.nextLine();
        System.out.print("Jam Pembayaran        : ");
        jampembayaran = input.nextLine();
        System.out.println("------------------------------------");        
        System.out.print("No. Tempat Duduk      : ");
        nomertempatduduk = input.nextLine();
        System.out.println("--------------------------------------");
        System.out.print("Penumpang             : ");
        penumpang = input.nextInt();
        System.out.print("Dewasa                : ");
        dewasa = input.nextInt();
        System.out.print("Anak                  : ");
        anak = input.nextInt();
        System.out.print("Bayi                  : ");
        bayi = input.nextInt();
        
        hargadewasa  = 20000;
        hargaanak    = 20000;
        hargabayi    = 2000;
        System.out.print("Biaya Adminstrasi     : ");
        biayaadminstrasi = input.nextInt();
        jumlahbayar  = (((hargadewasa)*dewasa)+((hargaanak)*anak)+((hargabayi)*bayi)+biayaadminstrasi);
       
        System.out.println("Total Yang Harus Dibayar : "+jumlahbayar);
        System.out.println("--------------------------------------");
        System.out.println("Struk ini tidak berlaku sebagai tiket");
        System.out.println("Struk harus ditukar dengan tiket di Stasiun KA-Online paling lambat 1 jam sebelum keberangkatan");
       
                        
                
                
                
                
                
                
                         
        
    }
    
}
