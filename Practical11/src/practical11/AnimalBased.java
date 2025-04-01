    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical11;

/**
 *
 * @author piyus
 */
public class AnimalBased extends Organic {
    String sourceAnimal;
    AnimalBased(String name,float amountPerAcre,String state,float cultivationPeriod,String sourceAnimal){
        super(name,amountPerAcre,state,cultivationPeriod);
        this.sourceAnimal = sourceAnimal;
    }
}
