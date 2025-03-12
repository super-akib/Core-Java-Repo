package exam_24_01_2024;

public class VehiclDemo 
{
   public static void main(String args[])
   {
	   Car car = new Car("BMW","A2",4,"Petrol");
	   car.displayInfo();
	   car.startEngine();
	   car.activateAirbags();
   }
}
