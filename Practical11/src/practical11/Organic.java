/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical11;

/**
 *
 * @author piyus
 */
public class Organic extends Fertilizer {
    float cultivationPeriod;
    Organic(String name,float amountPerAcre,String state,float cultivationPeriod){
        super(name,amountPerAcre,state);
        this.cultivationPeriod = cultivationPeriod;
    }
}
