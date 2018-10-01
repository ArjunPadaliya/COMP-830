
public class Car {
	
	String make;
	String model;
	int year;
	String description;
	int price;
	double rating;
	CarStrategy carStrategy_obj = null;
	
	public Car(String make, String model, int year, int price, double rating)
	{
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.rating = rating;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public void getDescription()
	{
		System.out.println(this.description);
		if (carStrategy_obj != null) {
			System.out.println(carStrategy_obj.getExtendedDescrption());
		}
	}
	
	public void setCarStrategy(CarStrategy obj)
	{
		this.carStrategy_obj = obj;
	}

}
