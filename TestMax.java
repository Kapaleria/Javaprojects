public class TestMax{
	public static void main(String[] args){
	int i=5;
	int j=2;
	int k=max(i,j);
	System.out.println("The maximum value between "+i+ " and "+j +" is "+ k);
	}

	public static int max(int a,int b){
	int result;
	if(a>b)
		result=a;
	else
		result=b;
	return result;
	}
}
