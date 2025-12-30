
import java.util.*;
  class park{
          String type;
     String Vehicle,vehicleNum;
          int hours;
          String car,truck,bike;
 void carcharges(){
     int baseCharge=20*hours;
     System.out.println("BaseCharges"+baseCharge);
     int dis=0;
    if(hours>10){
    dis= (int)(baseCharge*0.10);
}
System.out.println("discount:"+dis);
    System.out.println("Final charge:"+(baseCharge-dis));
     }
void bikecharges(){
    int dis=0;
    int baseCharge=10*hours;
    System.out.println("BaseCharges"+baseCharge);
    if(hours>10){
     dis= (int)(baseCharge*0.10);
    }
    System.out.println("discount:"+dis);
    System.out.println("FInal charges:"+(baseCharge-dis));
    

          }
void truckcharges(){
   int baseCharge= 30*hours;
   System.out.println("BaseCharges"+baseCharge);
    if(hours>5) System.out.println("  Charge::"+(baseCharge+100));
    else System.out.println("Final charge:"+baseCharge);
          }
 }
  
public class ParkingLot {
   
    

    public static void main(String[] args) {
        park vehicle=new park();
       
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Vehicle num");
        vehicle.vehicleNum=in.nextLine();
        System.out.println("ENter vehicle type");
        vehicle .type=in.nextLine();
        System.out.println("Enter number of hours");
        vehicle.hours=in.nextInt();

        if(vehicle.type.equals("car")){
            vehicle.carcharges();
        }
        else if (vehicle.type.equals("bike")){
            vehicle.bikecharges();
        }
        else if(vehicle.type.equals("truck"));
        else System.out.println("Enter an valid stmt");




        
    }


        
    }
    

