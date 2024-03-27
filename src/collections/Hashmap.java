package collections;

import java.util.HashMap;

public class Hashmap {
public static void  main(String args[]) {
	
	HashMap<String,String> obj=new HashMap<String,String>();
	
	obj.put("MH","MUMBAI");
	obj.put("KN","BENGLURE");
	obj.put("KJ","SATARA");
	obj.put("DS","MUMBAI");
	obj.put("HJ","SAMSDSF");
	
	System.out.println(obj);
	System.out.println(obj.get("KN"));
	
	for(String k:obj.values()) {
		System.out.println(k);
	}
}
}
