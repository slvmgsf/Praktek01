/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author C55D
 */
public class KomputerAksi {
    public static void main(String[] args) {
        Komputer Ana = new Komputer();
        
        Ana.Monitor="LG";
        Ana.Mouse="Mouse Wireless";
        Ana.RAM="2GB";
        Ana.Warna="Hitam";
        Ana.OS="Windows XP";
        
        Ana.cetakInfo();
    }
  
}
