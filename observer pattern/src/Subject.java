
public interface Subject {

	void subscribe(Subscriber1 sub);

	void unsubscribe(Observer sub);

	void notifySubscribers();

	void upload(String title);

}