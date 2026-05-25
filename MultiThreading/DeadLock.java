package MultiThreading;



public class DeadLock {
    public static void main(String[] args) {
        Object alphaKey=new Object();
        Object betaKey=new Object();
         Thread Alpha =new Thread()
         {
            public void run(){
                synchronized (betaKey) {
                    System.out.println("Alpha Aquired Beta Key");
                    try{
                    System.out.println("Alpha sleeps for 3 sec");
                    Thread.sleep(3000);
                    }
                
                     catch (InterruptedException e) {
                    e.printStackTrace();

                }
                  System.out.println("Alpha woke up");
                  synchronized (alphaKey) {
                      try {
                          System.out.println("Alpha Acquired Alpha key");
                          Thread.sleep(3000);

                      }
                       catch (InterruptedException e) {
                        e.printStackTrace();
                      }
                      
                  }
            
            

               }
            }
        };
        Runnable beta =() ->{
            synchronized (alphaKey) {
                try {
                    System.out.println("Beta Aquired Alpha Key");
                    System.out.println("Bata sleep for 3 sec");
                    Thread.sleep(3000);
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                 System.out.println("Beta woke up");
                  synchronized (betaKey) {
                      System.out.println("Bate Acquired Beta key");
                      try {
                        System.out.println("Beta sleep for 3 sec");
                        Thread.sleep(3000);

                      }
                       catch (InterruptedException e) {
                        e.printStackTrace();
                      }
                      
                  }

                
            }
        };
        Thread betaThread=new Thread(beta);
        Alpha.start();
        betaThread.start();
    }
}
    
    
    

