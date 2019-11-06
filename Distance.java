//multi-dimensional arrays

public class Distance{
	public static void main(String[] args){
		System.out.println("This program displays distances between two places");
		System.out.println("Chicago" + " " +"Boston"+ " " + "Atlanta" +" "+"Kampala");
		String[][]  cityDistance={
			
			{"Chicago"," 0"," 50"," 150"," 19990"},
			{" Boston"," 50"," 0"," 1353"," 35287"},
			{" Atlanta"," 354"," 654556"," 0"," 455464"},
			{" Kampala"," 54352"," 434754"," 85456"," 0"}
				};
	for(int row=0;row<cityDistance.length;row++){
		for (int col=0;col<cityDistance[row].length;col++){
		System.out.print(cityDistance[row][col] +" ");
				}
		System.out.println();
			}

		}
}