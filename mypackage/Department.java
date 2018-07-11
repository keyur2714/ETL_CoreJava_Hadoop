package mypackage;

public class Department{
	private int deptId;
	private String deptName;
	
	public Department(){
		this.deptId = 0;
		this.deptName = "";
	}
	
	public void setDeptId(int deptId){
		this.deptId=deptId;
	}	
	public int getDeptId(){
		return deptId;
	}
	public void setDeptName(String deptName){
		this.deptName=deptName;
	}	
	public String getDeptName(){
		return deptName;
	}
}