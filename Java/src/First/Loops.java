package First;

public class Loops {

	public static void main(String[] args) {
		/* There are FOUR types of loops in JAVA they are
		1:For Loop
		1:While Loop
		1:Do While Loop
		1:For-each Loop
        */
		System.out.println("===============For Loop===========");
		for(int i=0;i<=10;i++) {
			//Initialization,Condition,increment/decrement
			System.out.println(i);
		}
		System.out.println("===============While Loop===========");
		int x=1;
		while(x<=20) {
			//This loop first condition will checks condition is true then it will execute
			System.out.println(x);
			x++;
		}
		System.out.println("=============== Do While Loop===========");
		int y=1;
		do {
			System.out.println(y);
			y++;
		}while(y<=25);
		System.out.println("===============For-each Loop===========");
		//for-each loop Array traversing technique 
		int arr[]= {20,30,40,50};
		
		for(int num:arr) {
			
			System.out.println(num+"");
			
		}
		
		
		  
	}
}


