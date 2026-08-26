import java.util.Scanner;

public class MiniParkingSystem{
static int slot[] = new int[20];

public static String parkCar(int slotNumber){

 for(int count = 0; count < slot.length; count++){
 if(slot[count] == 0){
 slot[count] = slotNumber;
 return "Car  Parked At Slot " + count;
  }
} 
 return "Parking slot Full";
}


public static String unparkCar(int slotNumber){
 if(slotNumber < 0 || slotNumber >= slot.length){
return "Invalid slot number";
}

 if(slot[slotNumber] == 0){
return "That slot is already empty";
 }
 
int car = slot[slotNumber];

slot[slotNumber] = 0;

return "Car " + car + " Unparked from slot " + slotNumber;
}


public static String parkingStatus(){

String result = "";

for(int count = 0; count < slot.length; count++){

if(slot[count] == 0){
result += "Slot " + count + ": empty";
 } 
 else {
result += "Slot " + count + ": occupied by car " + slot[count] ;
 }
}

return result;

}
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
boolean isRunning = true;
while(isRunning){
	System.out.print("""
 1. park
 2. unpark
 3. parking status
 4. Exit
""");
       
 int choice = scanner.nextInt();
switch(choice) {
  case 1:
  System.out.println("Enter Slot (0 - 20)");
  int car = scanner.nextInt();
  System.out.println(parkCar(car));
   break;
 
 case 2:
 System.out.println("Enter Slot Number to unpark from (0-20)");
  int slotNumber= scanner.nextInt();
  System.out.println(unparkCar(slotNumber));
    
    break;
           
 case 3:
System.out.println(parkingStatus());
  
  break;
case 4:
 isRunning = false;
System.out.println("bye");

 break;
 
 default:

 System.out.println("Invalid, please try again.");

}
}
}
}
