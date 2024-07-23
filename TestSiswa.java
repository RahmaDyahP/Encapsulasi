/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encap;

import java.util.Scanner;

/**
 *
 * @author Rahma Dyah
 */
public class TestSiswa {
    
    
    public static void main(String[] args) {
        //TODO code application logic here
        EncapSiswa siswa = new EncapSiswa();
        Scanner input=new Scanner (System.in);
        System.out.println("Masukkan Nama");
        String Nama = input.nextLine();
        System.out.println("Masukkan Alamat");
        String Alamat = input.nextLine();
        System.out.println("Masukkan umur");
        int Umur = input.nextInt ();
        siswa.setName(Nama);
        siswa.setAge(Umur);
        siswa.setAddress(Alamat);
        
        System.out.println("nama: "+siswa.getName() + " alamat "+siswa.getAddress()+ " berumur "+siswa.getAge()+ " tahun");
        
        
    
    
    }
}
