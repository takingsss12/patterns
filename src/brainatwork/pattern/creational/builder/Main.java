package brainatwork.pattern.creational.builder;
//
public class Main {
	public static void main(String[] argv){
		 User u1 = new User.UserBuilder("Jhon", "Doe")
		    .age(1520)
		    .phone("1234567")
		    .address("Fake address 1234")
		    .build();
		 
		 System.out.println(u1.toString());
	}
}
