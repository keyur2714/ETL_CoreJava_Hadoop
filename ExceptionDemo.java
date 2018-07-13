class MyException extends Exception{
	private String errCode;
	private String errMessage;
	public MyException(){
		this.errCode = "100";
		this.errMessage = "String is Invalid";
	}
	public String toString(){	
		return errCode+" "+errMessage;
	}
}
public class ExceptionDemo{
	public static void main(String str[]){
		try{
			String s = "keyur";
			int len = s.length();
			System.out.println(len);
			String x="123";
			int no = Integer.parseInt(x);
			System.out.println(no + 1);
			int p=10/0;
			System.out.println(p);
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(NumberFormatException ex){
			System.out.println("Number is not Valid");	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Always Executed");
		}
		System.out.println("Good Bye...!");
		try{
			String input = "vinit";
			for(int i=0;i<input.length();i++){
				if(input.charAt(i) == 'K'){
				throw new MyException();
				}	
			}
		}catch(MyException e){
			System.out.println(e);
		}
	}
}