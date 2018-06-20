package tool;

public class Utils {

	public boolean IsNumber(String num){
		try{
			Integer.parseInt(num);
			return true;
		} catch(ArithmeticException e){
			return false;
		}
	}
}
