
/**
 * Developed and designed a VideoGameChar class along with a driver class in Java. Users can set a name for the characters, 
 * as well as specify the maximum health and current health of each character.
 *
 * @author Lavincia S.
 * @version Febuary 11, 2022
 */
 
import java.lang.Math;
 
public class VideoGameChar{
    private String name ;
    private double maxhealth;
    private double remaininghealth;
    
 
    
    public VideoGameChar(){
        name = ""; 
        remaininghealth = 0.0;
        maxhealth = 0.0;
        
    } 
    
    
    public static void getWelcome(){
        String welcome = "Welcome to the VideoGameChar class driver"; //make custom method
        
        
    }
    
    public VideoGameChar(String name, double maxhealth, double remaininghealth){
        this.name = name;
        this.maxhealth = maxhealth;
        this.remaininghealth = remaininghealth;   
        
    }
 
    
    
    public String getName(){   
                                          //Accessor name method
        return name; 
    } 
    
    
    public double getMaxHealth(){        //Accessor MaxHealth method
        return maxhealth;
        
    }
    
    
    public double getRemainingHealth(){  //Accessor RemainingHealth method
        return remaininghealth;
    
    }
    
    
    
 
    public void setName(String name){
        this.name = name;   
        
                                                 //Mutator name methods 
        
    }
    
    public void setMaxHealth(double maxhealth){
        this.maxhealth = maxhealth;                    //Mutator maxhealth methods 
 
    }
    
    
    public void setRemainingHealth(double remaininghealth){
        this.remaininghealth = remaininghealth;              //Mutator remaininghealth methods 
        
    }
 
 
    public double getHealthPercentage(){
        double percentage = (remaininghealth/ maxhealth) * 100.0; 
        return percentage;                                                          // returns the remaining health divided by the max health multiplied by 100.0.
                                                                    
                                                                                    // do not round percentage  
    }
    
 
 
   
 
 
    
    public String toString(){
        
         return (name + ":" + Math.round(remaininghealth * 10.0)/10.0 + "  out of  " + Math.round(maxhealth * 10.0)/10.0 + "   health or  " + Math.round(getHealthPercentage() * 10.0)/10.0  +  " % ");//need math.round here
         
                                                       
                                         //returns a string that describes each of the 3 fields for the class
                                         //(including rounding both the max and remaining health to one decimal place)
                                                 
    }
 
         
}
