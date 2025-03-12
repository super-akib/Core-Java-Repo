package exam_24_01_2024;

public class Car extends Vehicle  implements Engine,SafetyFeatures
{
	int numDoors;
    String fuelType;
	
    public Car(String brand, String model,int numDoors,String fuelType) 
    {
		super(brand, model);
		this.numDoors = numDoors;
		this.fuelType = fuelType;
	}

	@Override
	public void displayInfo() 
	{
		 System.out.println("Brand:"+this.brand);
		 System.out.println("Model of Car:"+this.model);
		 System.out.println("Number of Doors:"+this.numDoors);
		 System.out.println("Fuel Type:"+this.fuelType);
		 
	}

	@Override
	public void activateAirbags() 
	{
		System.out.println("Car AirBag System is Activated...");
		
	}

	@Override
	public void startEngine() 
	{
		System.out.println("Car Engine is Starte..");
	}
	
   
}
