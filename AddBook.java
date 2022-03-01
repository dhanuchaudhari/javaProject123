package onlneBookshop;

import java.util.HashMap;
import java.util.Map.Entry;

public class AddBook {
	HashMap <String, bookDetail>det = new HashMap<>();
	 public void addbook()
	 {
		 bookDetail obj2 =  new bookDetail().addbook();
	     int flag=0;
		for( Entry<String, bookDetail> j : det.entrySet()) {
			if(j.getKey() == obj2.getName()){
				flag =1;
			 break;
			}
		}		
			if(flag == 0) {
				det.put(obj2.getName(),obj2);

			}
			else
			System.out.println("book is already registered");
		}
}
