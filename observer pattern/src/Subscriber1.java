import java.nio.channels.Channel;

public class Subscriber1 implements Observer {
	private String name;
	private channel channel;
	
	public Subscriber1(String name) {
		super();
		this.name = name;
		this.channel = channel;
	}
	@Override
	public void update()
	{
		System.out.println(" hey " + name +" video uploaded:"+channel.title);
	}
	@Override
	public void subscribechannel(channel ch)
	{
		channel=ch;
	}
}
