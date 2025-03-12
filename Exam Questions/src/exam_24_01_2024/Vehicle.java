package exam_24_01_2024;

public abstract class Vehicle
{
    String brand;
    String model;
    public abstract void displayInfo();
	
    public Vehicle(String brand, String model)
	{
		super();
		this.brand = brand;
		this.model = model;
	}
    
}
