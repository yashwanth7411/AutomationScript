package threads;

class task{
	task()
	{
		for(int i=0;i<10;i++)
		{try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("----task-----");
		}
	}
}


class mythread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("---My Thread---"+i);
		}
		
	}
}

class Yourthread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("--Your Thread---"+i);
		}
		
	}
}

class Ourthread implements Runnable
{
	public void run()
	{
		for(int i=1;i<10;i++)
		{try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("---Our Thread----"+i);
		}
		
	}
}


public class ThreadDemo {
	public static void main(String[] args) throws Throwable {
		mythread mt=new mythread();
		mt.start();
		mt.join();
		Yourthread yt=new Yourthread();
		yt.start();
		
		Runnable r=new Ourthread();
		Thread ot=new Thread(r);
		ot.start();
		
		yt.setPriority(Thread.MAX_PRIORITY);
		mt.setPriority(Thread.MIN_PRIORITY);
		ot.setPriority(Thread.NORM_PRIORITY);
		
		System.out.println("Priority of mythread"+mt.getName());
		System.out.println("Priority of yourthread"+yt.getName());
		System.out.println("Priority of ourthread"+ot.getName());
		
	//	task t=new task();
	//	t.task();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MainThread started");
		
		for(int i=1;i<5;i++)
		{
			System.out.println("------Main----"+i);
		}
		
		System.out.println("MainThread Ended"); 
	}

}
