
public class disk {
public static void main(String[] args){
	Thread t1 = new Thread(new Reader("1"));
	Thread t2 = new Thread(new Reader("2"));
	Thread t3 = new Thread(new Reader("3"));
	t1.start();
	t2.start();
	t3.start();
}
}
