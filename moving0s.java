package movingzeroes;

import java.util.*;

public class moving0s{
	
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int size=sc.nextInt();
	        int arr[]=new int[size];
	        for (int i = 0; i < size; i++) {
	            arr[i]=sc.nextInt();
	        }
	        int count=0;
	        for (int i = 0; i <size ; i++) {
	            if(arr[i]!=0){
	                arr[count++]=arr[i];
	            }
	        }
	        while(count<size){
	            arr[count++]=0;
	        }
	        System.out.println(Arrays.toString(arr));
	    }
}
