package exam_dec_13;

public class MainClass {

	public static void main(String[] args) {
		
		Address a1 = new Address(12,"Ambashi","Akola");
		
		Student  s1 = new Student(101,"Akib","Java Full Stack",a1);
		
		Address a2 = new Address(12,"Ambashi","Akola");
		
		Faculty  f1 = new Faculty(112,"Ravi shanker",120000,a2);
		
		System.out.println("------------Student---------------");
		System.out.println(s1);
		System.out.println("------------Faculty---------------");
		System.out.println(f1);

	}

}
