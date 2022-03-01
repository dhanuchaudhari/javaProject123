package onlneBookshop;
import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;

public class MemberDetails {

		HashMap <Integer, RegMember>map = new HashMap<>();
		
		void addInList() {
			RegMember obj =  new RegMember().addMember();
	        int flag=0;
		for( Entry<Integer, RegMember> i : map.entrySet()) {
			if(i.getKey() == obj.getEnr_id()){
				flag =1;
			 break;
			}
		}		
			if(flag == 0) {
				map.put(obj.getEnr_id(),obj);

			}
			else
			System.out.println("member is already registered");
		}
		

		void Verification() {
			System.out.println("enter enrollment number for verification");
			int num = new  Scanner(System.in).nextInt();
			int flag=0;

		for( Entry<Integer, RegMember> i : map.entrySet()) {
			if(i.getKey() == num){
			 flag =1;
			 break;
			}
		}		
			if(flag == 0) {
				System.out.println("Enrollment no. is NOt registered");
			}
			else
			System.out.println("Enrollment no. is registered");
		}

		
}
		

 

