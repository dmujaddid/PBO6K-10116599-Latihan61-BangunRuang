/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program LivingThing.
 * 
 */
public class PBO6K10116599Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Human human = new Human();
        human.setNama("Rizki Adam Kurniawan");
        
        LivingThing lt = new LivingThing();
        
        
        
        human.getNama();
        
        System.out.print(human.getNama());
        lt.walk("");
        System.out.print(human.getNama());
        lt.breath("");
        System.out.print(human.getNama());
        lt.eat("");
    }
    
}
