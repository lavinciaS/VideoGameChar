/**
 * Developed and designed a VideoGameChar class along with a driver class in Java.
 * Users can set a name for the characters, as well as specify the maximum health and current health of each character.
 *
 * @author Lavincia S.
 * @version Febuary 11, 2022
 */
import java.util.Scanner; 
public class VideoGameCharDriver{
    private String hero;
    private String villain;
 
    public VideoGameCharDriver(){
        hero = "";
        villain = "";
    }
    
    public VideoGameCharDriver(String hero, String villain){
        this.hero = hero;
        this.villain = villain;
           
        
    }
 
        
    
    
    public static void main( String[] args ){
        
       
        Scanner stdin = new Scanner( System.in );
                
        VideoGameChar hero = new VideoGameChar();
        VideoGameChar villain = new VideoGameChar();
        
        
        String name = "";
        String nameV = "";
        double maxhealth = 0.0;
        double remaininghealth =   0.0;
        
                                                                                    
        
        System.out.println("Welcome to the VideoGameChar class driver");              //welcome message 
        
        
        System.out.print("Please enter the name of the hero:  ");                   //prompt user to enter their hero
        name = stdin.next();
        System.out.println("You entered" +   ":" +  name);
        hero.setName(name);
        
        
                
        System.out.print("Please enter the name of the villain:  " );                                                                               
        nameV = stdin.next();
        System.out.println("You entered:" +     nameV);
        villain.setName(nameV);
     
        
      
        System.out.print("Please enter " +    name  +    "'s"    + "  max health " + ":" );  //hero max health
        maxhealth = stdin.nextDouble();
        System.out.println("You entered" + ":" +  maxhealth); 
        hero.setMaxHealth(maxhealth);
        
        
        
        System.out.print("Please enter " +   nameV    +"'s"+ " max health:");   //villain max health
        maxhealth = stdin.nextDouble();
        
        System.out.println("You entered" +    ":"  +  maxhealth);
        villain.setMaxHealth(maxhealth);
        
        
     
        System.out.print("Please enter  "  +    name  + "'s"     + " remaining health" + ": " );
        remaininghealth = stdin.nextDouble();
        System.out.println("You entered" + ":" +  remaininghealth);
        hero.setRemainingHealth(remaininghealth);
        
        
        System.out.print("Please enter  " + nameV +  "'s"+ " remaining health:"  );
        
        remaininghealth = stdin.nextDouble();
        
        System.out.println("You entered"  +   ":"  + remaininghealth);
        villain.setRemainingHealth(remaininghealth);
        
        
        
        
        
        System.out.println( hero.toString() );
        
        System.out.println( villain.toString() );
        
 
    
    }
 
}
 
