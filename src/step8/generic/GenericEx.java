package step8.generic;

class MyVector<T> {
	private Object arr[] = null;
	private int count = 0;
	void add(T data) {
		if(count == 0) {
			arr = new Object[1];
		}else {
			Object[] temp = arr;
			arr = new Object[count + 1];
			for(int i = 0; i < count; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}
		arr[count] = data;
		count += 1;
	}
	int size() {
		return count;
	}
	T get(int index) {
		return (T)arr[index]; // 형변환 
	}
}

class User{
	String name;
	void print_name() {
		System.out.println(name);
	}
}


public class GenericEx {

	public static void main(String[] args) {
		MyVector<User> vec = new MyVector<>();
		User temp = new User();
		temp.name = "철수";
		vec.add(temp);
		temp = new User();
		temp.name = "민수";
		vec.add(temp);
		for(int i = 0; i < vec.size(); i++) {
			vec.get(i).print_name();
		}


	}

}
