package exam_dec_13;

public class MainClass1 {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("Akib",1102,"mohd@gmail.com");
		Customer c2 = new Customer(c1);
		
		System.out.println("-----------------Orignal-Copy-No change-------");
		System.out.println(c1);
		System.out.println(c2);
		c2.changeEmail("akib@gmail.com");
		Customer c3 = new Customer(c2);
		
		System.out.println("-----------------Orignal-Copy-No change-------");
		System.out.println(c1);
		System.out.println(c3);
	}

}
