/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author user
 */
public class TestSiswa {
    public static void main(String args[]){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Najwa");
        siswa.setAbsent(28);
        siswa.setAddress("Malang");
        
        System.out.print("name : " + siswa.getName() 
                + "Absent : " + siswa.getAbsen() + " Address : " + siswa.getaddress());
        
    }
}
