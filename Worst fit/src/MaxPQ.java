import java.util.PriorityQueue;

public class MaxPQ {
	
	PriorityQueue<Disk> queue;
	
	public MaxPQ(){
		queue = new PriorityQueue<Disk>();
	}
	
	public void insert(Disk d){
		queue.add(d);
	}
	
	public Disk delete(){	
		return queue.poll();
	}
	

	public Disk peek(){
		return queue.peek();
	}	

	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	
}
