import java.util.Scanner;
public class LinearSearch{
	public static int linearSearch(int[] list,int key){
	for(int i=0; i<list.length;i++){
		if(key==list[i]);
		return i;
		}
	return -1;
	}
public static void main(String[] args){
	int[] myList=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the " +myList.length +" values");
	for(int i=0; i<myList.length;i++)
	myList[i]=sc.nextInt();
	System.out.println("enter the search key");
	int key=sc.nextInt();
	int s =linearSearch(myList,key);
System.out.println("the search key is found at index " +s + " and at position " +(s+1));
	}
}

