import java.util.Scanner;
public class DescendingOrder{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of students: ");
		final int STUDENTS=sc.nextInt();
		
		String[] names=new String[STUDENTS];
		double[] scores=new double[STUDENTS];

		System.out.println("Enter the score of each student:");
		for(int i=0;i<STUDENTS;i++){
		System.out.println("Student " + (i+1) + " :");
		names[i]=sc.next();
		System.out.print("Score:");
		scores[i]=sc.nextDouble();
		}

		sortDecreasing(names,scores);
		for(String s:names){
		System.out.println(s);
		}

	}
	public  static void sortDecreasing(String[] st, double[] mark){
	for(int i=0;i<mark.length;i++){
		double max=mark[i];
		int maxIndex=i;
		String temp;
		
		for(int j=i+1;i<mark.length;i++){
			if(mark[j]>max){
			max=mark[j];
			maxIndex=j;
			}
	}
		if(maxIndex!=i){
			temp=st[i];
			st[i]=st[maxIndex];
			st[maxIndex]=temp;


		//swap int array
			mark[maxIndex]=mark[i];
			mark[i]=max;
			}
	}
}
}