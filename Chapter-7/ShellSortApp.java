
public class ShellSortApp {
	public static void main(String[] args) {
		int maxSize = 10;
		shellSort arr;
		arr = new shellSort(maxSize);
		
		for(int j=0; j<maxSize; j++) {
			long n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		} 
		
		arr.display(); 
		arr.shellSort(); 
		arr.display();
	} // end main()
}

