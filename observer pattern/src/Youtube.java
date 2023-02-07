
public class Youtube {
	public static void  main(String[] args)
	{
		channel code = new channel();
		Subscriber1 s1= new Subscriber1("pava");
		Subscriber1 s2= new Subscriber1("Sugan");
		Subscriber1 s3= new Subscriber1("ajay");
		Subscriber1 s4= new Subscriber1("sathish");
		code.subscribe(s1);
		code.subscribe(s2);
		code.subscribe(s3);
		code.subscribe(s4);
		code.unsubscribe(s2);
		
		s1.subscribechannel(code);
		s2.subscribechannel(code);
		s3.subscribechannel(code);
		s4.subscribechannel(code);
		code.upload("how to learn programming");
		
	}

}
