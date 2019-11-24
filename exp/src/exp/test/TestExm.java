package exp.test;

import java.util.ArrayList;
import java.util.List;

public class TestExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1=new ArrayList<Integer>();
		l1.add(6);
		l1.add(7);
		l1.add(5);
		l1.add(4);
		
		for (int i = 0; i < l1.size(); i++) {
			System.out.println("element="+l1.get(i));
		}
	}

}
