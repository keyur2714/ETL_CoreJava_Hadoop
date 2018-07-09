class Student{
	private int studentId; // Data Member | Instance Variable
	private String name;
	private String city;
	private String mobileNo;
	
	public Student(){
		System.out.println("Object is Created");	
		this.name = "";
		this.city = "pune";
		this.mobileNo = "";
	} 
	
	public Student(int studentId,String name,String city,String mobileNo){
		System.out.println("Object is Created");	
		this.studentId = studentId;
		this.name = name;
		this.city = city;
		this.mobileNo = mobileNo;
	}	

	public void setStudentData(){
		this.studentId = 27;
		this.name = "keyur";
		this.city = "navsari";
		this.mobileNo = "7387029671";
	}

	public void printStudentData(){
		System.out.println(this.studentId+" "+this.name+" "+this.city+" "+this.mobileNo);
	}
		
}

public class StudentClient{
	public static void main(String s[]){
		
		
		
	if(s.length > 1){
		System.out.println("Command line Input: "+s[0]);	
		System.out.println("Command line Input: "+s[1]);	
	}	
		
		Student stud1 = new Student();
										stud1.printStudentData();		
		
		stud1.setStudentData();

		stud1.printStudentData();		
	
		Student stud2 = new Student(26,"denish","surat","9898121243");
		
		stud2.printStudentData();		
		
		
	}	
}

/*
	stud1
	[
		studetId: 27
		name: keyur
		city: navsari
		mobileNo:	 7387029671
	]

	stud2
	[
		studetId: 26
		name: denish
		city: surat
		mobileNo:	 9898121243
	]
*/