//Ενα απλο κωδικα που δημιουργει 2 Νηματα και αυτα τα 2 νηματα δημιουργουν 10 νηματα .Το ενα νημα που δημιοργει 10 παιδια 
// εχω βαλει να κανει μια μαθηματικη πρξει να βρει πολλαπλασια του i.Πχ το 1ο Νημα βρισκει 1*1 1*2 1*3  εως και 20΄
//τον 2ο Νημα με 10 νηματα που δημιουργει ειναι κενο προς αναπτηξη .
public class Main {
  
	public static void main(String[] args) {
		Thread11 thread1= new Thread11();
		Thread22 thread2 =new Thread22();
		
		thread1.start();
		thread2.start();
        
	
	}
	

}
class Thread11 extends Thread {
	
	
	public void run() {
	   int numofthreads=10;
	   MicroThread1 threads[]=new MicroThread1[numofthreads];
		for(int i=0;i<numofthreads;i++) {
			threads[i]=new MicroThread1(i);
			//threads[i].start();δεν κανω εδω αρχη διοτη θελω τα νηματα να αρχιζουν με σειρα να εκτυπωσουν πολλαπλασεια του 
			// i+1 και να αρχιζει το αλλο νημα 
			
		}
		 for (int i = 0; i < numofthreads; ++i) {
	            try {
	            	threads[i].start();
	                threads[i].join();
	            }
	             catch (InterruptedException e) {}
	        }
		
		
	}
	
}

class Thread22 extends Thread{
	
	

	
	
	
	public void run() {
		 int numofthreads=10;
		   MicroThread2 threads[]=new MicroThread2[numofthreads];
			for(int i=0;i<numofthreads;i++) {
				threads[i]=new MicroThread2();
				threads[i].start();
			}
			  for (int i = 0; i < numofthreads; ++i) {
		            try {
		                threads[i].join();
		            }
		             catch (InterruptedException e) {}
		        }
			
		
	}
}


class MicroThread1 extends Thread{
	private int counter=0;
	
    public MicroThread1(int id){
    	counter=id;
    }
    
	public void run() {
		counter+=1;
		
		 System.out.println("Πολλαπλάσιο "+counter );
		for(int i=1;i<=20;i++) {
			
			System.out.println(i*counter +"\n");
			//System.out.println(i);
			//System.out.println(counter);
		}
	
	}
		
       
        
      
		
		
	
	
}

class MicroThread2 extends Thread{
	
}