package onlneBookshop;

import java.util.Scanner;

public class bookDetail {
	int price;
	String name;
    int year;
	
	public bookDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public bookDetail(int price, String name, int year) {
		super();
		this.price = price;
		this.name = name;
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "addbook [price=" + price + ", name=" + name + ", year=" + year+ "]";
	}

	public bookDetail addbook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter price ");
		int price = sc.nextInt();
		System.out.println("enter name ");
        String name = sc.next();
		System.out.println("enter year ");
        int year = sc.nextInt();
		
		
        return new bookDetail(price,name,year);
	}
}
    
	
	



