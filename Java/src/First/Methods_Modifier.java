package First;
class Inst{
	String name;
	String Data;
	public void PrintData(String name) {
		this.Data=name;
	}
	
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
	}

}
