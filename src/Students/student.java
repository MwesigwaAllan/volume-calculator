package Students;

public class student {
String name;
int age;
String address;

//constructor has to have the same name as the class
	public student(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
		}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
	return address;
	}
	//object intialization
	
 public static void main(String[] args) {
	 student john=new student("john", 19, "jinxhou");
	 System.out.println(john.toString());
	 System.out.println(john.name);
	 System.out.println(john.age);
	 System.out.println(john.address);
	 System.out.println(john.getName()+" //personal method");
	 System.out.println(john.getAge()+" //personal method");
	 System.out.println(john.getAddress()+" //personal method");
	 
 }

}
