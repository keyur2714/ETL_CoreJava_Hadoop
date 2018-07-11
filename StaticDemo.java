import java.util.Date;
class StaticDemo{
	private int x;
	private static int cnt=0;
	public StaticDemo(){
		System.out.println("Inside Constructor");		
		cnt++;
		this.x = cnt;
	}
	
	public static int getCount(){
		return cnt;	
	}
	public void display(){
		System.out.println("Inside Instance Method::"+x);
	}
	{
	System.out.println("Every time called when obj is created");
	}
	static{
		System.out.println("Always First...");
	}
	public static void main(String str[]){
		int n=5;
		StaticDemo s[]=new StaticDemo[n]; //Declaration		
		for(int i=0;i<n;i++){
			s[i] = new StaticDemo();
			s[i].display();	
		}
		System.out.println("Number of Objects Created..."+StaticDemo.getCount());			
		Date today=new Date();
		System.out.println(today);
	}			
}