/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical11;

/**
 *
 * @author piyus
 */
public class Practical11 {
public static void main(String[] args){
        System.out.println("Welcome TO Shri Krushi Seva Kendra");
        AnimalBased ab = new AnimalBased("Manure",10.5f,"Solid",2.5f,"Cow");
        PlantBased pb = new PlantBased("Green Manure",20.5f,"Solid",4.5f);
        Nitrogen n = new Nitrogen("Urea",60.5f,"Solid","Soil Acidification",100.0f);
        Potassium k = new Potassium("Murate of Pottash",25.6f,"Solid","Water Contamination",90.3f);
        Phosphorus p = new Phosphorus("Rock Phosphate",20.3f,"Solid","Soil pollution",100.0f);
        Other o = new Other("10-26-26",100.0f,"Solid","For life of Living and Nonliving both.","10-26-26");
        System.out.println("Welcome TO Shri Krushi Seva Kendra");
}
}
