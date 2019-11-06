public class AnalyzeNumbers{
	public static void main(String[] args){
	double[] numbers=new double[10];
	double sum=0;
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter the "+ numbers.length +" values");
	for(int i=0;i<numbers.length ;i++){
	numbers[i]=sc.nextDouble();
		sum+=numbers[i];
	}
	int[] number={1,2,3,4,5,6,7,8,9,0,};
	for(int u :number)
	System.out.println(u);
	double average=sum/10;
	int count=0;
	for(int i=0;i<numbers.length;i++)
	if(numbers[i]>average)
		count++;

	System.out.println("Average is " +average);
	System.out.println("Number of elements above the average are " +count);
}
}