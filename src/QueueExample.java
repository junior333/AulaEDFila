import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> waitingQueue = new LinkedList<>();
		
		waitingQueue.add("Matheus");
		waitingQueue.add("Marcos");
		waitingQueue.add("Lucas");
		waitingQueue.add("João");
		waitingQueue.add("Paulo");
		
		System.out.println("Fila "+ waitingQueue);
		
		String name= waitingQueue.remove();
		System.out.println("removido da fila : "+name+" | Nova lista: "+ waitingQueue);
		
		name = waitingQueue.poll();
		System.out.println("removido da fila: "+name+" | Nova LIsta: "+ waitingQueue);
		
		System.out.println("a fila esta vazia? "+ waitingQueue.isEmpty());
		
		System.out.println("tamanho da fila: "+waitingQueue.size());
		
		String a ="aaaaaaaaaaaaa";
		if(waitingQueue.contains(a)) {
			System.out.println("fila contém "+a);
		}
		else {
			System.out.println("fila não contém: "+a);
		}
	}

}
