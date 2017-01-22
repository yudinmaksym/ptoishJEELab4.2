
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author админ
 */
public class Phantom {

   public static void main(String[] args) 
			throws InterruptedException {

      Object obj = new String("hello,world");
      final ReferenceQueue queue = new ReferenceQueue();

      PhantomReference pRef = 
		new PhantomReference(obj,queue);

      obj = null;

      new Thread(new Runnable() {
         public void run() {
           try {
             System.out.println("Awaiting for GC");

             PhantomReference pRef = 
		(PhantomReference) queue.remove(); 

             System.out.println("Referenced GC'd");

            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }).start();

        Thread.sleep(2000);

        System.out.println("Invoking GC");
        System.gc();       
    }
}

