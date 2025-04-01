/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical11;

/**
 *
 * @author piyus
 */
public class Chemical extends Fertilizer {
    String sideEffects;
    Chemical(String name,float amountPerAcre,String state,String sideEffects){
        super(name,amountPerAcre,state);
        this.sideEffects = sideEffects;
    }
}
