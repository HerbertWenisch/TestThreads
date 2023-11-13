public class Main {
    
      public void test(){
        TestThread tick = new TestThread("tick", 100);
        TestThread tack = new TestThread("tack", 200);
        tick.start();
        tack.start();
    }
    
    public static void main() {
        Main main = new Main();
        main.test();
    }
    
}

