class ExceptionDemo{
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
		}
		System.out.println("Good Bye...!");
	}
}