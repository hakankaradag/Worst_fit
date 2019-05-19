import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class RandomNumberGenerator {

	public static void main(String[] args) throws IOException {
	    
		Random t = new Random();
	    Scanner sc = new Scanner(System.in);
	    int N = Integer.valueOf(args[0]);
	    System.out.println("N:" + N);
	    String fileName = "input"+N+".txt";
	    FileWriter fileWriter = new FileWriter(fileName);
	    PrintWriter printWriter = new PrintWriter(fileWriter);
	   
	    for (int i=0; i<N; i++) {
	    	printWriter.println(t.nextInt(1000000));
	    }
	    printWriter.close();
	}

}
