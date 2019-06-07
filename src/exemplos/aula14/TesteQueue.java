package exemplos.aula14;

import java.util.PriorityQueue;
import java.util.Queue;

public class TesteQueue {
	public static void main(String[] args) {
		Hora hora1 = new Hora(13,30);
		Hora hora2 = new Hora(12,30);
		Hora hora3 = new Hora(12,20);
		Hora hora4 = new Hora(9,00);
		
		Queue<Hora> queue = new PriorityQueue<>();
		queue.offer(hora1);
		queue.offer(hora2);
		queue.offer(hora3);
		queue.offer(hora4);
		
		System.out.println(queue);
		
		queue.poll();
		queue.poll();
		System.out.println(queue);
	}
}
