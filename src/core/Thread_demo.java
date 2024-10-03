package core;

public class Thread_demo {

	public static void main(String[] args) throws Exception {
		
		Runnable s=()->
			{for(int i=0;i<5;i++) {
				System.out.println("Thean sudare");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				}
			};
		Runnable m=()->
			{for(int j=0;j<5;j++)
				{
				System.out.println("Sean Rolden");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				}
			}
		;
		Thread t1=new Thread(s);
		Thread t2=new Thread(m);
		
		t1.start();
		
		Thread.sleep(500);
		t2.start();
		t1.join();
		t2.join();
		t1.setName("Vivek");;
		System.out.println(t1.getName());
		System.out.println("Good");
		
		
		
	}

}
