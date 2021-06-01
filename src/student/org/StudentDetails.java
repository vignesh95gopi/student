package student.org;
import fuel.org.com.FuelPrice;
public class StudentDetails extends FuelPrice{
	public void stuName() {
		System.out.println("vignesh");
		
	}
	public void stuClass() {
	     System.out.println("5th");
		
	}
	public void stuSection() {
		System.out.println("B");
	}
	public static void main(String[] args) {
	StudentDetails s = new StudentDetails();
	s.stuName();
	s.stuClass();
	s.stuSection();
	s.twoWheeler();
	s.fourWheeler();
	s.diselPrice();
	s.petrolPrice();
	
	
	
		}
}
