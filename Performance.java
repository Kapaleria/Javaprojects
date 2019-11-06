
//this program prompts the user to enter the number of students, the student's names 
//and their scores and prints student's names in decreasing order of their scores .
import java.util.Scanner;

class Performance{
	public static void main(String[] args){
		Scanner irene=new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		 int num=irene.nextInt();

		String[] names =new String[num];
		System.out.println("Enter the names of the "+ num +" students: ");
		
		for(int i=0;i<num;i++){
		 names[i]=irene.next();
		}
	
		System.out.println("Enter the scores for each student:");
		double[] score=new double[num];
		for(int i=0;i<num;i++){
		score[i]=irene.nextDouble();
		}
		descendingOrder(names,score);
		for(String s:names){
		System.out.println(s);

		}
		
		//sort a string and integer array in descending order
		public static void descendingOrder(String[] name, int[] marks){
			for(int i=0;i<marks.length;i++){
			int max=marks[i];
			int maxIndex=i;
			String temp;
			//find the min

			for(int j=i+1;j<marks.length;j++){
			if(marks[j]>max)
				max=marks[j];
				maxIndex=j;
						}
			
					}
			if(maxIndex !=i){
				//swap string array
				temp=name[i];
				name[i]=name[maxIndex];
				name[maxIndex]=temp;
				
				//swap int array
				marks[maxIndex]=marks[i];
				marks[i]=max;
				}
			
		}
		
	}
}