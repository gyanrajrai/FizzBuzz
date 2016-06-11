package advancejava;

public class FizzBuzz {

	public static void main(String[] args) {
		//boolean fizzOrBuz =true;
		//String f="fizz";
		//String b="Buzz";

		for(int i=1;i<100;i++){
			//define boolean that keep track of ur condiotion
			
			 
			       
			            boolean fizzOrBuzz = false;
			            if (i % 3 == 0) {
			                System.out.print("Fizz");
			                fizzOrBuzz = true;
			            }
			            if (i % 5 == 0) {
			                System.out.print("Buzz");
			                fizzOrBuzz = true;
			            }

			            if (fizzOrBuzz) {
			              System.out.println();
			         } 
			           else {
			               System.out.println(String.valueOf(i));
			           }
			        }
			    
				
//f6 next line ma janx code execution
			//f8 break
			

		//	fizzOrBuz=true;

		}
	
	        }

	        
	    
   

	


