
class Arithmetic {//This is the example of overloading and it says that any class can have
					//multiple methods with the same name but parameter list must be different
					//and return type could be same or could be different...
	
	void add(int i, int j) {
		
		System.out.println(i + j);
	}
	
	void add( int i, int j, int k) {
		
		System.out.println(i + j + j);
	}
	
	void add(int i, int j, double d) {
		
		System.out.println(i + j + d);
	}
}

public class Inheritance {
	
	public static void main(String[] args) {
		
		Arithmetic arithmetic = new Arithmetic();
		
		arithmetic.add(10, 20);
		arithmetic.add(20, 50, 50.50);
		
	}
}

//class Car {//This is the example of overriding...
//
//	void steering() {//this is overridden method
//		System.out.println("inside steering() of Car");
//	}
//}
//class Polo extends Car {
//
//	void abs() {
//		System.out.println("inisde abs()");
//	}
//	//This steering() is overriding method...
//	void steering() {//Here I am overriding and in overriding, one must keep the overridden 
//						//method signature same in the child class 
//		System.out.println("inside steering of Polo");
//	}
//}
//public class Inheritance {
//	
//	public static void main(String[] args) {
//		
//		Polo polo = new Polo();
//		
//		polo.steering();    polo.abs();
//		
//	}
//}


//class Car {
//
//	void steering() {
//		System.out.println("inside steering()");
//	}
//}
//class Polo extends Car {
//
//	void abs() {
//		System.out.println("inisde abs()");
//	}
//}
//public class Inheritance {
//	
//	public static void main(String[] args) {
//		
//		Car car1 = new Car();   car1.steering();
//		
//		Polo polo1 = new Polo();   polo1.abs();     polo1.steering();
//		
//		Car car2 = new Polo();   car2.steering();    //This is illegal "car2.abs();"
//		
//	}
//}

//class Car {
//	
//	int i = 4;
//	
//	void steering() {
//		System.out.println(i);
//	}	
//}
//
//class Polo extends Car {
//	
//	void abs() {
//		
//		System.out.println(i);//Here variables also inherited from the parent class in the 
//								//child class since I am using the variable "i" of parent class
//								//in the method of child class...
//	}
//}
//
//public class Inheritance {
//	
//	public static void main(String[] args) {
//			
//		
//	}
//}

//class Car {
//
//	void steering() {
//		System.out.println("inside steering()");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//		System.out.println("inisde abs()");
//	}
//}
//
//class Verna extends Polo {
//	
//	void climateControl() {
//		System.out.println("inside climateControl()...");
//	}
//}
//
//public class Inheritance {
//	
//	public static void main(String[] args) {
//		
//		Car car1 = new Car();
//		
//		Polo polo1 = new Polo();
//		Car car2 = new Polo();
//		
//		Verna verna = new Verna();
//		Car car3 = new Verna();
//		Polo polo2 = new Verna();
//		
//	}
//}



//class Car {
//
//	void steering() {
//		System.out.println("inside steering()");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//		System.out.println("inisde abs()");
//	}
//}
//
//class Verna extends Polo {
//	
//	void climateControl() {
//		System.out.println("inside climateControl()...");
//	}
//}
//
//public class Inheritance {
//	
//	public static void main(String[] args) {
//		
//		Car car = new Car();  car.steering();
//		Polo polo = new Polo();    polo.steering();   polo.abs();
//		Verna verna = new Verna();  verna.steering();  verna.abs();  verna.climateControl();
//		
//	}
//}

//class Car {
//
//	void steering() {
//		System.out.println("inside steering()");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//		System.out.println("inisde abs()");
//	}
//}
//
//
//
//public class Inheritance {
//	
//	public static void main(String[] args) {
//		
//		Car car1 = new Car();
//		Polo polo = new Polo();
//		
//		Car car2 = new Polo();//Here I am trying to hold the object of child class in the
//								//reference variable of parent class which is possible only and 
//								//only if there is inheritance involved....  
//		
//		//Polo polo2 = new Car();//This is illegal since I am trying to hold the object of parent 
//								//class in the reference variable of child class...
//	}
//}


//
//class Car {
//
//	void steering() {
//		System.out.println("inside steering()");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//		System.out.println("inisde abs()");
//	}
//}
//
//class Verna extends Car {
//
//	void climateControl() {
//		System.out.println("inside climateControl()");
//	}
//}
//
//public class Inheritance {
//	
//	public static void main(String[] args) {
//		
//		Car car = new Car();    car.steering();   
//		Polo polo = new Polo();   polo.abs();   polo.abs();  polo.steering();
//		Verna verna = new Verna();    verna.climateControl();   verna.steering();
//	}
//}



//
//class Car {
//
//	void steering() {
//		System.out.println("inside steering()");
//	}
//}
//
//class Polo {
//
//	void abs() {
//		System.out.println("inisde abs()");
//	}
//}
//
//class Verna {
//
//	void climateControl() {
//		System.out.println("inside climateControl()");
//	}
//}
//
//public class Inheritance {
//	
//	public static void main(String[] args) {
//		
//		Car car = new Car();    car.steering();
//		Polo polo = new Polo();   polo.abs();
//		Verna verna = new Verna();    verna.climateControl();
//	}
//
//}
