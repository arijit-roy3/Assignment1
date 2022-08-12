package AccessModifier2;
import java.util.Scanner;
import AccessModifier.AccessModifiers;
public class AccessModifiers2 extends AccessModifiers{
	public static void main(String[] args) {
		Test obj1 = new Test();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the name");
		String name=scanner.nextLine();
		System.out.println("Please Enter the age");
		int age=obj1.y=scanner.nextInt();
		System.out.println("Please Enter the marks");
		int marks =obj1.x=scanner.nextInt();
		obj1.checkAge(age);		
		obj1.displayName(name);
		obj1.checkMarks(marks);		
		
		}
}
