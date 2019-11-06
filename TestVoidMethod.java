TestVoidMethod.java
public class TestVoidMethod{
	public static void main(String[] args){
	System.out.print("The grade is of 73.1 is, ");
	Rate.printGrade(73.1);
	System.out.print("The grade is of 20.6 is, ");
	Rate.printGrade(20.6);
	}
}
class Rate{
	public static void printGrade(double score){
	if(score<50.0)
	System.out.println('F');
	else
	System.out.println('A');
	}
}