package finalExample.atm;

public class User {
	public String name = "";
	Account acc[] = null;
	int accCount = 0;
	
	void printAccount() {
		System.out.println(name);
		for(int i = 0; i < accCount; i++) {
			acc[i].print();
		}	
	}
}
