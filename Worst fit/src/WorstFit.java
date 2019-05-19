import java.util.Scanner;

public class WorstFit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		MaxPQ pq = new MaxPQ();
		int cnt = 0;
		double sum = 0.0;

		while(sc.hasNextInt()){
			int deger = sc.nextInt();
			sum += deger;
			Disk d=null;
			if(!(pq.isEmpty()) && pq.peek().getBosluk()>=deger){
				d = pq.delete();

				d.degerEkle(deger);
				
			}else{
				d=new Disk(cnt);
				cnt++;
				d.degerEkle(deger);
				
			}
			pq.insert(d);
		}

		System.out.println("file sizes sum = " + (sum/1000000) + " GB");
		System.out.println("total disks    = " + cnt);
		while(!(pq.isEmpty())){
			Disk d = pq.delete();
			System.out.println(d);

		}

	}

}
