package nimeshsir;

public class threads_2 {

	public static void main(String[] args) {
		Thread rz= Thread.currentThread();
		System.out.println("Current Thread: "+rz);
		rz.setName("Reezu");
		System.out.println("After Name changes of Current Thread: "+rz);
	}

}
