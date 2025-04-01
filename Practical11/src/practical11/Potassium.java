/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical11;

/**
 *
 * @author piyus
 */
public class Potassium extends Chemical {
    float kContent;
    Potassium(String name,float amountPerAcre,String state,String sideEffects,float kContent){
        super(name,amountPerAcre,state,sideEffects);
        this.kContent = kContent;
    }
}
