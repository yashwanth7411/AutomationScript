package threads;

class Message
{
	String msg;
	Message()
	{
		msg="No message Available";
	}
	
	void writemsg()
	{
		msg="Be Excellent";
		System.out.println("-----Message Written------");
	}
	
	void readmsg()
	{
		System.out.println("Message is: "+msg);
	}
}


class reader extends Thread
{
	Message m;
	reader(Message n)
	{
		m=n;
	}

public void run()
{
	synchronized(m)
	{
		m.readmsg();
	}
}
}

class writer extends Thread
{
	Message m;
	writer(Message n)
	{
		m=n;
	}

public void run()
{
	synchronized(m)
	{
		m.writemsg();
	}
}
}

public class Multithread {

	public static void main(String[] args) {
		Message m=new Message();
	//	m.readmsg();
	//	m.writemsg();
		reader r=new reader(m);
		writer w=new writer(m);
		
		r.start();
		w.start();

	}

}
