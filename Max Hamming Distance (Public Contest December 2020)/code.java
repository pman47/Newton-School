import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();

		int[] arr = new int[26];
		int total_sum = s.length();
		for(int i = 0;i<s.length();i++){
			arr[(int)(s.charAt(i))-97]++;
		}

        // System.out.println(Arrays.toString(arr));

        // System.out.print("[");
		int count = 0;
		int diff = 0;
		for(int i = 0;i<26;i++){
			diff = total_sum - arr[i];
			if(arr[i] != 0 && diff>= arr[i]){
				count+= arr[i];
			} 
			else if(arr[i] != 0 && diff < arr[i]){
				count+=diff;
			}
            // System.out.print(count + ", ");
		}
        // System.out.println("]");
		

		System.out.println(count);
	}
}