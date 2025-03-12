package Day3_Nov3;

public class MarkSheet {

	public static void main(String[] args) {
		float eng,phy,math,chem,bio,hindi,total,avg;
		eng = Float.parseFloat(args[0]);
		phy = Float.parseFloat(args[1]);
		math= Float.parseFloat(args[2]);
		chem= Float.parseFloat(args[3]);
		bio= Float.parseFloat(args[4]);
		hindi= Float.parseFloat(args[5]);
		total = eng + phy + math +chem + bio+ hindi;
		avg = total/6;
		if(avg>=80 && avg<=100) {
			System.out.println("Student Pass A grade:"+avg);
		}else if(avg<=70 && avg>=60) {
			System.out.println("Student Pass B grade:"+avg);		
		}else System.out.println("Student Fail C grade:"+avg);
	}

}
