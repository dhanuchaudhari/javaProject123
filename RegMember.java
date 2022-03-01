package onlneBookshop;

import java.util.Scanner;

public class RegMember {
	int enr_id;
	String name;
	String dept;
	String contact_no;
	
	
	
	public int getEnr_id() {
		return enr_id;
	}

	public void setEnr_id(int enr_id) {
		this.enr_id = enr_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public RegMember(int enr_id, String name, String dept, String contact_no) {
		super();
		this.enr_id = enr_id;
		this.name = name;
		this.dept = dept;
		this.contact_no = contact_no;
	}

	void verifyMember() {
		int id = new Scanner(System.in).nextInt();
		if(enr_id == id) {
			System.out.println("Registered member ");
		}
		else {
			System.out.println("Not a Registered member ");

		}
		
		
	}
	
	RegMember(){}
		
	@Override
	public String toString() {
		return "RegMember [enr_id=" + enr_id + ", name=" + name + ", dept=" + dept + ", contact_no=" + contact_no + "]";
	}

	RegMember addMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter enrollment id ");
		int id = sc.nextInt();
		System.out.println("enter name ");
        String name = sc.next();
		System.out.println("enter department ");
        String dept = sc.next();
		System.out.println("enter contact number");
        String num = sc.next();
		
        return new RegMember(id, name,dept,num);
	}

}
