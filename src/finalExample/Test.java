package finalExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Member {
	private int custno; // 회원번호
	private String custname; // 회원성명
	private String phone; // 회원전화
	private String address; // 통신사
	private String joindate; // 가입일자
	private String grade; // 고객등급
	private String city; // 거주도시

	public Member() {
	}

	public Member(int custno, String custname, String phone, String address, String joindate, String grade,
			String city) {
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.joindate = joindate;
		this.grade = grade;
		this.city = city;
	}

	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

class Money {
	int custno; // 회원번호
	int saleno; // 판매번호
	int pcost; // 단가
	int amount; // 수량
	int price; // 가격(매출)
	String pcode; // 상품코드
	String sdate; // 판매일자

	public Money() {
	}

	public Money(int custno, int saleno, int pcost, int amount, int price, String pcode, String sdate) {
		this.custno = custno;
		this.saleno = saleno;
		this.pcost = pcost;
		this.amount = amount;
		this.price = price;
		this.pcode = pcode;
		this.sdate = sdate;
	}

	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public int getSaleno() {
		return saleno;
	}

	public void setSaleno(int saleno) {
		this.saleno = saleno;
	}

	public int getPcost() {
		return pcost;
	}

	public void setPcost(int pcost) {
		this.pcost = pcost;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

}

class Manager {
	ArrayList<Member> memberList = new ArrayList<Member>();
	ArrayList<Money> moneyList = new ArrayList<Money>();

	void init() {
		memberList.add(new Member(100001, "김행복", "010-1111-2222", "SK", "20151202", "A", "01"));
		memberList.add(new Member(100002, "이축복", "010-1111-3333", "SK", "20151206", "B", "01"));
		memberList.add(new Member(100003, "장믿음", "010-1111-4444", "SK", "20151001", "B", "30"));
		memberList.add(new Member(100004, "최사랑", "010-1111-5555", "SK", "20151113", "A", "30"));
		memberList.add(new Member(100005, "진평화", "010-1111-6666", "SK", "20151225", "B", "60"));
		memberList.add(new Member(100006, "차공단", "010-1111-7777", "SK", "20151211", "C", "60"));

		moneyList.add(new Money(100001, 20160001, 500, 5, 2500, "A001", "20160101"));
		moneyList.add(new Money(100001, 20160002, 1000, 4, 4000, "A002", "20160101"));
		moneyList.add(new Money(100001, 20160003, 500, 3, 1500, "A008", "20160101"));
		moneyList.add(new Money(100002, 20160004, 2000, 1, 2000, "A004", "20160102"));
		moneyList.add(new Money(100002, 20160005, 500, 1, 500, "A001", "20160103"));
		moneyList.add(new Money(100003, 20160006, 1500, 2, 3000, "A003", "20160103"));
		moneyList.add(new Money(100004, 20160007, 500, 2, 1000, "A001", "20160104"));
		moneyList.add(new Money(100004, 20160008, 300, 1, 300, "A005", "20160104"));
		moneyList.add(new Money(100004, 20160009, 600, 1, 600, "A006", "20160104"));
		moneyList.add(new Money(100004, 20160010, 3000, 1, 3000, "A007", "20160106"));


		String[][] arr = new String[memberList.size()][3];
		int idx = 0;
		int check = 0;
		for (int i = 0; i < memberList.size(); i++) {
			for (int j = 0; j <  moneyList.size(); j++) {
				if (memberList.get(i).getCustno() == moneyList.get(j).getCustno()) {
					arr[idx][0] = memberList.get(i).getCustno()+"";
					arr[idx][1] = memberList.get(i).getCustname();
					arr[idx][2] += moneyList.get(j).getPrice()+"/";
				}
			}
			idx += 1;
		}
		
		String[] testArr = new String[4];
		for (int i = 0; i < 4; i++) {
			int sum = 0;
			String test = arr[i][2];
			String a = arr[i][2].substring(4);
			testArr = a.split("/");
			for (int j = 0; j < testArr.length; j++) {
				sum +=Integer.parseInt(testArr[j]);
			}
			arr[i][2] = String.valueOf(sum);
		}
		
		//정렬
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(arr[i][2].compareTo(arr[j][2]) >0) {
					String temp = arr[i][2];
					String temp1 = arr[i][1];
					String temp0 = arr[i][0];
					arr[i][2]=  arr[j][2];
					arr[i][1]= arr[j][1];
					arr[i][0]= arr[j][0];
					arr[j][2] = temp;
					arr[j][1] = temp1;
					arr[j][0] = temp0;
				}
			}
			
		}
		//show
		for (int i = 0; i < 4; i++) {
			System.out.println(arr[i][0] +"," + arr[i][1]+"," + arr[i][2]);
		}
		
	}
}

public class Test {

	public static void main(String[] args) {
		Manager mg = new Manager();
		mg.init();

		/*
		 * [문제] 아 래와 같이 출력 매출(price) 의 합계 + 내림차순
		 * 
		 * 100001 김행복 8000 --------------------------------
		 *  100004 최사랑 4900
		 * -------------------------------- 
		 * 100003 장믿음 3000
		 * -------------------------------- 
		 * 100002 이축복 2500
		 * --------------------------------
		 */

	}

}
