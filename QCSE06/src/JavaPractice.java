import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JavaPractice {

	public static void main(String[] args) {
/*		ArrayList list=new ArrayList();
		list.add(10);
		list.add(10);
		System.out.println(list.size());
	Object[] ary = list.toArray();
	System.out.println(ary[0]);
	ArrayList list1=new ArrayList();
	list1.add(10);
	list1.add(20);
	
	System.out.println(list.equals(list1));
	
	list.add(1, list1);
	for (int i=0; i<list.size(); i++)
	{
		System.out.println(list.get(i));
	}
		ArrayList<Integer> list2 =new ArrayList<>();	
		
	
	Scanner sc= new Scanner(System.in);
	Random ran=new Random(1000);
	int a=ran.nextInt();
	
	*/
	
	ArrayList list3=new ArrayList();
	list3.add(10);
	list3.add(20);
	list3.add(30);
	ArrayList list4=new ArrayList();
	list4.add(30);
	list4.add(40);
	list4.add(50);
	list3.addAll(list4);
//list3.add(list4);
//	list3.remove(list4);
	list3.removeAll(list4);
	list3.add(null);
	
	list3.add(null);
	
	System.out.println(list3);
	
}
}
