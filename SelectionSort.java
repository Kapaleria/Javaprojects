public class SelectionSort{
	
	public static void selectionSort(double[] list){
	     for(int i=0;i<list.length-1;i++){

		double currentMin=list[i];
		int currentMinIndex=i;
		
		for(int j=i+1;j<list.length;j++){
		if(currentMin>list[j]){
			currentMin=list[j];
			currentMinIndex=j;
			}
		}
		//swap list[i] with list[currentMinIndex] if necessary
		if(currentMinIndex!=i){
		list[currentMinIndex]=list[i];
		list[i]=currentMin;
	}
}
}
	public static void main(String[] args){
	
	double[] list={1,2.4,5,2.9,5.8};
	SelectionSort.selectionSort(list);
	
	}
}