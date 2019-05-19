import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class IntegerSorter {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int deger = sc.nextInt();
			list.add(deger);
		}
		Collections.sort(list, Collections.reverseOrder());
		for(Integer i:list){
			System.out.println(i);
		}
	} 
}