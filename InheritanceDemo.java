interface Country{
	String getCountry();	
}
interface ECountry extends Country{
	String getCountryCode();
}
class Person{
	private int uid;
	private String name;
	
	public Person(){
		this.uid=0;
		this.name = "";
	}
	
	public void setUid(int uid){
		this.uid=uid;
	}
	public void setName(String name){
		this.name=name;
	}
		
	public void display(){
		System.out.print(uid+" "+name);
	}
	
}
class Student extends Person implements Country{
	private int rollNo;
	public Student(){
		super();
		this.rollNo = 0;
	}
	public void setRollNo(int rollNo){
		this.rollNo=rollNo;
	}
	public void display(){
		super.display();
		System.out.println(" "+rollNo);		
	}
	public String getCountry(){
		return "India";
	}
}
class Employee extends Person implements Country{
	private int empId;
	public Employee(){
		super();
		this.empId = 0;
	}
	public void setEmpId(int empId){
		this.empId=empId;
	}
	public void display(){
		super.display();
		System.out.println(" "+empId);		
	}
	public String getCountry(){
		return "Us";
	}
}
public class InheritanceDemo{
	public static void main(String str[]){
		System.out.println("Inheritance Demo...!");		
		Student s=new Student();
		s.setRollNo(11);
		s.setUid(98981);
		s.setName("Vicki");
		s.display();	
		System.out.println(s.getCountry());	
	
		Employee e=new Employee();
		e.setEmpId(27);
		e.setUid(98983);
		e.setName("Keyur");
		e.display();	
		System.out.println(e.getCountry());	
	}
}