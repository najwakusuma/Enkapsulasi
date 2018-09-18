/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author user
 */
public class UjiBus4 {
    public static void main(String[]args){
          //membuat objek busBesar dari class Bus
         
          Bus4 busBesar = new Bus4(40);
         
          busBesar.addpenumpang(15);
          busBesar.addpenumpang(5);
          busBesar.addpenumpang(26);
          busBesar.getPenumpang(46);
          busBesar.getAverage();
       }
}
