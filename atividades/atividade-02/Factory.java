/**
 * This creates the buffer and the producer and consumer threads.
 *
 * @author Gagne, Galvin, Silberschatz
 * Operating System Concepts with Java - Sixth Edition
 * Copyright John Wiley & Sons - 2003.
 */
public class Factory
{
	public static void main(String args[]) {
		System.out.println("_____________________________");
		System.out.println("Aluno: Gabriel Sales");
		System.out.println("_____________________________");
        System.out.println("Programa: Produtor-Consumidor");
        System.out.println("_____________________________");
		
		Buffer server = new BoundedBuffer();

      		// now create the producer and consumer threads
      		Thread producerThread = new Thread(new Producer(server));
      		Thread consumerThread = new Thread(new Consumer(server));
      
      		producerThread.start();
      		consumerThread.start();               
	}
}
