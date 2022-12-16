package cau5;

public class DemoCau5 {
	static Singleton demoSingleton;

	public static void main(String[] args) {

		demoSingleton = Singleton.getInstance();

		if (demoSingleton == null) {
			System.out.println("singleton dang null");
		} else
			System.out.println(" singleton khac null");

	}
}