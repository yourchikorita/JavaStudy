package step7;
import java.util.Vector;

class ST{	
	int num;
	String name;
}
class St_manager{
	static int count = 0;
	static Vector<ST> list = new Vector<ST>();
}


public class Static2 {

	public static void main(String[] args) {
		ST st = new ST();
		st.num = 10001;
		st.name = "김철수";
		St_manager.list.add(st);
		st = new ST();
		st.num = 10002;
		st.name ="최영희";
		St_manager.list.add(st);
		// 위 내용을 그려보시요



	}

}
