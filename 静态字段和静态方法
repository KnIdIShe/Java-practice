//静态字段和静态方法

//给Person类增加一个静态字段count和静态方法getCount，统计实例创建的个数。

public class Main {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		System.out.println(Person.getCount());
	}
}

class Person {
	public static int count = 0;
	
	public Person() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}
}
