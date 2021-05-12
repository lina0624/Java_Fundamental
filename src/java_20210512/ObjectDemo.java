package java_20210512;

class Test{
	String name;
	int age;
	Test(String name, int age){
		this.name = name;
		this.age = age;
		
	}

	Test(){
		
	}
@Override
	public String toString() {
		return  name +  age ;
	}

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		t1.name = "박리나";
		t1.age = 10;
		Test t3 = t2;
		System.out.println(t1==t2);
		System.out.println(t2==t3);
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t3));
		
		System.err.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		System.out.println(t1);
	}
}
