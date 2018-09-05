/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphism;

/**
 *
 * @author CRex64
 */
class singa extends hewan  {
    @Override
    void setNama(){
        String singa = "Alex";
        System.out.println("Suara Singa : " + singa);
    }
    
    @Override
    void setSuara(){
        String suara = "Roaaarr";
        System.out.println("Suara Singa : " + suara);
    }
    
    @Override
    void setBerat(){
        double berat = 10.0;
        System.out.println("Berat Singa : " + berat + " KG");
    }
    
    
}
