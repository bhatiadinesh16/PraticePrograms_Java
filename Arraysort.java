import java.util.Arrays;

public class Arraysort {
public static void main(String args[]){
	
	int size, temp;
	int [] arr = {1,15,54,23,654,2,45,86};
	size = arr.length;
	
	for(int i=0;i<size-1;i++){
		 
		if (arr[i+1]<arr[i]){  //checking adjacent values
			temp = arr[i+1];
			arr[i+1]=arr[i]; //swapping adjacent values
			arr[i] = temp;
			i =i+1;
			
			
		}
		
		else{
			
			i=i+1;
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
