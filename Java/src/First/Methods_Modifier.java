package First;
class Inst{
	String name;
	String Data;
	public void PrintData(String name) {
		this.Data=name;
	}
	
}
/*Abstract methods are methods we can create "Abstract key word "
 first create the abstract all abstract methods we cannot implement in main create new class extends the all property
 that defined in main class now we can implement the class properties*/
//Here the abstract class 
abstract class first_abst{
	abstract void printInfo();
}//create a child class of this class
 
	
class second extends first_abst{
	  void printInfo() {
		  int x=5;
		  int y=10;
		  System.out.println("X + Y ="+x+y);
	  }

public class Methods_Modifier {
	static void  Hello() {//static method Declare
		System.out.println("Static method called");
	}
	//Static Methods & Instance Methods

	public static void main(String[] args) {
		/*Static Methods we can all it without creating any object for the class */
		Hello();
		System.out.println("=========================");
		//Instance Method can be called in the same class or another class in same package or different package
		//create object for a instance method to call particular method
		Inst obj=new Inst();
		obj.PrintData("This Is First Data");
		System.out.println(obj.Data);
		System.out.println("===============Abstract Method");
		//abstract method are use key word and define it 
		//create a object for abstract class
		first_abst obj2=new second();
		obj2.printInfo();
	}

}
}
