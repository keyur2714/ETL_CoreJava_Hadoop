import java.util.Scanner;
import mypackage.Department;
public class ManageDept{
	public static void main(String s[]){
		Scanner in=new Scanner(System.in);	
		
		System.out.print("Enter Number Of Dept");	
		int no = in.nextInt();
		Department deptList[]=new Department[no];		

		for(int i=0;i<no;i++){		
			System.out.print("Enter Dept Id: ");
			int deptId = in.nextInt();
			System.out.print("Enter Dept Name: ");
			String deptName = in.next();
			deptList[i]=new Department();
			deptList[i].setDeptId(deptId);	
			deptList[i].setDeptName(deptName);		
		}
for(int i=0;i<no;i++){	
		System.out.println(deptList[i].getDeptId()+" 		"+deptList[i].getDeptName());
}

	}
}
