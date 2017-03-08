import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	
	public static void main(String args[]){
		
		int num, count = 0;
		int [] arr=new int[28123];
		System.out.println("Please Enter any number: ");
		Scanner s =  new Scanner(System.in);
		num = s.nextInt();
		for(int i=1; i<num;i++){
			if(num % i == 0){
				count += 1;
				for(int j=0;j<count;j++){
					arr[j]=i;
					System.out.println("And the factors are: " + arr[j]);
				}
				
			}
				
			
		}
		if(count < 3){
			System.out.println("Prime Number ");
			
		}
		
		else{
			System.out.println("Not a Prime Number ");
		}
		 
		}
	}

