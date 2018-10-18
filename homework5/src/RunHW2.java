
public class RunHW2 {
	
	
	public static void main(String args[])
	{
		CarStrategy obj1 = new CarStrategy();
		obj1.setExtendedDescription("This is BMW X5 was built in 2017 and has rating of 4.5");
		Car car_obj1 = new Car("BMW", "X5", 2017, 60000, 4.5);
		car_obj1.setDescription("This is BMW");
		car_obj1.setCarStrategy(obj1);
		car_obj1.getDescription();
		
		CarStrategy obj2 = new CarStrategy();
		obj2.setExtendedDescription("This is Mercedes E350 was built in 2016 and has rating of 4.44");
		Car car_obj2 = new Car("Mercedes", "E350", 2016, 50000, 4.44);
		car_obj2.setDescription("This is Mercedes");
		car_obj2.setCarStrategy(obj2);
		car_obj2.getDescription();
		
		CarStrategy obj3 = new CarStrategy();
		obj3.setExtendedDescription("This is Ford F350 was built in 2018 and has rating of 4.3");
		Car car_obj3 = new Car("Ford", "F350", 2018, 65000, 4.3);
		car_obj3.setDescription("This is Ford");
		car_obj3.setCarStrategy(obj3);
		car_obj3.getDescription();

	}
	
}
