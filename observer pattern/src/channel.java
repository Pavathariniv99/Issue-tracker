import java.util.ArrayList;
import java.util.List;

public class channel implements Subject {
private List<Subscriber1> subs=new ArrayList<>();
 String title;

@Override
public void subscribe(Subscriber1 sub) {
	subs.add(sub);
	
}
@Override
public void unsubscribe(Observer sub) {
	subs.remove(sub);
}
 @Override
public void notifySubscribers()
 {
	for(Observer sub : subs) 
	{
		sub.update();
	}
 }
	
 @Override
public void  upload(String title) {
	 this.title=title;
	 notifySubscribers();
 }
 
 }
 
