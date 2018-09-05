/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum1;

/**
 *
 * @author CRex64
 */
abstract class Manusia {
    
     public double Tinggibadan;
    
    public void Manusia(double TB){
        this.Tinggibadan = TB;
    }
    public double getTinggibadan(){
        return Tinggibadan;
    }
    public abstract double htgbbi();

    
}

