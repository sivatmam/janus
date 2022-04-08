package teletact.ja006;

public class Bicycle {

   // the Bicycle class has
   // three fields
   
   private int cadence;

   
   private int gear;
   private int speed;
   {speed=100;}
   private final int id;

   private static int numberOfBicycles;
   static {numberOfBicycles=0;}
   
   // the Bicycle class has
   // one constructor
   public Bicycle(int startCadence, int startSpeed, int startGear){
      gear = startGear;
      cadence = startCadence;
      speed = startSpeed; 

      Bicycle.numberOfBicycles++;
      
      id = Bicycle.numberOfBicycles;
   }

   // the Bicycle class has
   // four methods

   public int getId(){return this.id;}

   public int getCadence(){ return this.cadence; }
   public void setCadence(int newValue){
      cadence = newValue;
   }

   public int getGear(){ return this.gear; }
   public void setGear(int newValue){
      gear = newValue;
   }

   public int getSpeed(){ return this.speed; }

   public void applyBrake(int decrement){
      speed -= decrement;
   }

   public void speedUp(int increment){
      speed += increment;
   }
    
}
