package singleton;

public class Demo {

	private static Demo aaw;

	private Demo() {
	}

	public static Demo getInstance() {

		// create object if it's not already created
		if (aaw == null) {
			aaw = new Demo();
		}

		// returns the singleton object
		return aaw;
	}

	
public void getConnection() {
		System.out.println("You are now connected to the database.");
	}

	

class Main {
	public static void main(String[] args) {
		Demo db1;
		// refers to the only object of Database
		db1 = Demo.getInstance();
		db1.getConnection();
		
	}
}
}

