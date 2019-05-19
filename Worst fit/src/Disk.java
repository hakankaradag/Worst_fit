import java.util.ArrayList;
import java.util.List;

public class Disk implements Comparable<Disk>{

	private int id;
	private int sum;
	private int bosluk;
	private List<Integer> list; 

	public Disk(int id){
		this.id = id;
		sum = 0;
		bosluk = 1000000;
		list = new ArrayList<Integer>();
	}

	public void degerEkle(int deger){
		list.add(deger);
		sum = sum + deger;
		bosluk = bosluk - deger;
	}
	
	public int compareTo(Disk d){
		if(this.bosluk == d.bosluk){
			return 0;
		}else if(this.bosluk > d.bosluk){
			return -1;
		}
		return 1;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getBosluk() {
		return bosluk;
	}

	public void setBosluk(int bosluk) {
		this.bosluk = bosluk;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public String toString() {
		String st = "" + id + " " + bosluk + ":";
		for(int i=0;i<list.size();i++){
			st += " " + list.get(i);
		}
		return st;
	}
}
