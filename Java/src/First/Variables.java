package First;
class Demo{
	public String name;
	
	int x=20;
	//x is global variable we can create object then only it is accessible
	
	 public Demo(){
		 //name is the instance variable we can access it with the help of object
		this.name="Java is better than c++";
	}
}

public class Variables {
	//Static variable global variable we can access it without create object
	
        public static String str2="well Come";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Three types of variables 
	   /* 1 Local Variable 
	    * 2 Static Variable
	    * 3 Instance Variable
	    * 4 Global Variable*/
		//Lets create Local variable
		String str1="Hello";
		/* str1 is the local variable this variable block level scope */
		System.out.println(str1);
		System.out.println(str2);
		//creating object or global variable
		Demo d=new Demo();
		System.out.println( "The value of global variable is :"+d.x);
		System.out.println("The Inctance variable value is :"+d.name);
	}

}
