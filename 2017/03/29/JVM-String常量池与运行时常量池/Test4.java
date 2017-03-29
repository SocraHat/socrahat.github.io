import java.util.*;

public class Test4{
	public static void main(String[] args){
		String str = "laji";
		String str2 = new String("laji");
		String str3 = null;
		
		System.out.println(str==str2);// 运行后结果为false
		str3 = str2.intern();
		System.out.println(str==str3);// 运行后结果为false
	}
}