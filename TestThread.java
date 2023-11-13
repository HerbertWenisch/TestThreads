/**
  * @author (Herbert Wenisch)
 * @version (11-13-23)
 */

 public class TestThread extends Thread {
    
    private final String name;
    private final long breakTime;
    private final int infinite = 4;
            
    public TestThread(String name, long breakTime) {
        this.name = name;
        this.breakTime =  breakTime;
    }
  
    @Override
    public void run(){
      int n = 0;
      while (n < infinite){
          System.out.println("" + name);  // Namen aufsagen
          nap(breakTime); // Nickerchen
          n++;
      }
    }
    
    
    private void nap(long breakTime){
        try {
            Thread.sleep(breakTime);
        }
        catch (InterruptedException e){}
    }
}
