/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.pkgclass.vehicle;

/**
 *
 * @author asus
 */
public class Aerplane extends AbstractClassVehicle {

    @Override
    public void walk() {
        System.out.println("Aerplane flying");
        
    }
    
    public static void main(String[] args) {
        Aerplane garuda = new Aerplane();
        garuda.function();
        garuda.fuel();
        garuda.walk();
        
    }
    
    
}
