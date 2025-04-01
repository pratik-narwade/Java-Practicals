/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical11;

/**
 *
 * @author piyus
 */
public class Other extends Chemical {
    String NPK;
    Other(String name,float amountPerAcre,String state,String sideEffects,String NPK){
        super(name,amountPerAcre,state,sideEffects);
        this.NPK = NPK;
    }
}
