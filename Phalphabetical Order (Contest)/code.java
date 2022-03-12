import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        String s = "eklpyqrbgjdwtcaxznsifvhmou";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<26;i++){
            map.put(s.charAt(i),i);
        }


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for(int i=0;i<n;i++) a[i]=sc.next();

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                int same = 0;
                while((same<a[j].length() && same<a[j+1].length()) && (a[j].charAt(same)==a[j+1].charAt(same))) same++;
                if(same == a[j+1].length() && (a[j].length() > a[j+1].length())){
                    String tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }else if(same<a[j].length() && same<a[j+1].length() && map.get(a[j].charAt(same))>map.get(a[j+1].charAt(same))){
                    String tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

	}
}