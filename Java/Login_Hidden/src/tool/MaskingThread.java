package tool;

/**
 * This class attempts to erase characters echoed to the console.
 */

class MaskingThread extends Thread 
{
   private volatile boolean stop; // volatile stores the variable in the computers main memory
    // volatile allows us actually stop the thread.

    /*
    Synchronization in Java is possible by using Java keywords synchronized and volatile and locks.
   In Java, we can not have synchronized variable. Using synchronized keyword with a variable is illegal and will result in compilation error. 
   Instead of using the synchronized variable in Java, you can use the java volatile variable, 
   which will instruct JVM threads to read the value of volatile variable from main memory and don’t cache it locally.
   If a variable is not shared between multiple threads then there is no need to use the volatile keyword.
    */ 
   private char echochar = '*';

  /**
   *@param prompt The prompt displayed to the user
   */
   public MaskingThread(String prompt) 
   {
      System.out.print(prompt);
   }

  /**
   * Begin masking until asked to stop.
   */
   public void run() 
   {

      int priority = Thread.currentThread().getPriority();
      Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

      try 
      {
         stop = true;
         while(stop) 
         {
           System.out.print("\010" + echochar);
           try 
           {
              Thread.currentThread();
              // attempt masking at this rate
              Thread.sleep(1);
           }
           catch (InterruptedException iex) 
           {
              Thread.currentThread().interrupt();
              return;
           }
         }
      } 
      finally 
      { // restore the original priority
         Thread.currentThread().setPriority(priority);
      }
   }

  /**
   * Instruct the thread to stop masking.
   */
   public void stopMasking() 
   {
      this.stop = false;
   }
}