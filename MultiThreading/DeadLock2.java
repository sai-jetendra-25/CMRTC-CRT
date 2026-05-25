package MultiThreading;


public class DeadLock2{
	public static void main(String[] args) {
		Object alphkey =new Object ();
		Object betakey =new Object ();
		Thread Aplha = new Thread() {
			public void run ()
			{
				synchronized (betakey)
				{
					try {
						Thread.sleep(1000);
						System.out.println("Alpha sleep for 1 sec");
					}
					catch(InterruptedException e){
						e.printStackTrace();
					}
					System.out.println("Alpha woke up");
					synchronized(alphkey)
					{
						System.out.println("Apha Aquired Alpha key");
						
						try {
							Thread.sleep(1000);
							System.out.println("Beta sleep for 1 sec");
						}
						catch(InterruptedException e){
							e.printStackTrace();
						}
						System.out.println("Alpha Aquired Beta key");
					}
				}
			}
		};
 Runnable beta = ()->{
	synchronized (alphkey) {
		try {
			Thread.sleep(1000);
			System.out.println("Beta aquired Alpha key");
			System.out.println("Beta sleep for 1 sec");
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Beta Work up");
		synchronized (betakey) {
			
			try {
				Thread.sleep(1000);
				System.out.println("Beta sleep for 1 sec");
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Beta aquired Beta key");
			}
		}
};
Thread betaThread = new Thread(beta);
Aplha.start();
betaThread.start();
	}
}