package First;

public class Conditionals {
	int d;
	int e;
      public int  PrinAll(int d,int e) {
		return d+e;
		
	}

	public static void main(String[] args) {
		/*Conditional Statements
		 * if
		 * if-else
		 * if-else-if Ladder
		 * nested-if
		 * Switch-case Statements
		 * */
		/*Jumps
		 * brake
		 * continue
		 * return*/
		int x=20;
		int y=30;
		System.out.println("=========if==============");
		if(x<y) {
			System.out.println("x is Less than y");
		}
        System.out.println("===============if-else=============");
        if(x>y) {
        	System.out.println("x is greater than y");
        }else {
        	System.out.println("y is greater than x");
        }
        System.out.println("=============if-else-if");
        if(x>y) {
        	System.out.println("x is greater than y");
        }else if(x==y) {
        	System.out.println("Both are equal");
        	
        }else {
        	System.out.println("x is less than y");
        }
        System.out.println("===========Nested if===========");
        if(y>x) {//this condition true then only enter the loop
        	if(x>y) {
        		System.out.println("x is less than y");
        	}else {
        		System.out.println("Second is false");
        	}
        }else {
        	System.out.println("all are wrong");
        }
        System.out.println("Jumps============");
        
        for(int z=0;z<=20;z++) {
        	if(z==10) {
        		continue;
        		
        	}
        	System.out.println(z);
        }
        for(int w=0;w<10;w++) {
        	if(w==4) {
        		break;
        	}
        	System.out.println(w);
        }
        System.out.println("==========Switch=========");
        int A=3;
        switch(A) {
        case 1:
        	System.out.println("Hello");
        	break;
        case 2:
        	System.out.println("Well");
        	break;
        case 3:
        	System.out.println("Java ");
        	break;
        case 4:
        	System.out.println("Come");
        	break;
        case 5:
        	System.out.println("C++");
        	break;
        }
        
        System.out.println("===========return=========");
        /*return is a key word it is a return type of the method if method is return something 
        we should use this keyword if method is not return anything there is no mandatory to use it understanding 
        		purpose we can use it */
        Conditionals cnd=new Conditionals();
        System.out.println(cnd.PrinAll(3,3));
        
	}

}
