package brainatwork.pattern.creational.builder;

public class User {
	private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional

	/**
	 * The User constructor is private, which means that this class can not be
	 * directly instantiated from the client code.
	 */
	
	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", phone=" + phone + ", address=" + address
				+ "]";
	}

	/**
	 * The class is immutable. All attributes are final and they are set on the
	 * constructor. Additionally, we only provide getters for them.
	 */
	
	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;

		/**
		 * The builder constructor only receives the required attributes and
		 * this attributes are the only ones that are defined final on the
		 * builder to ensure that their values are set on the constructor.
		 */
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			User user = new User(this);
			if (user.getAge() > 120) { // a simple control on age attribute
				throw new IllegalStateException("Age out of range"); // thread-safe
			}
			return user;
		}
		
//      example of not thread-safe code:
//		public User build() {
//			 if (age > 120) {
//			   throw new IllegalStateException(age out of range); // bad, not thread-safe
//			 }
//			 // This is the window of opportunity for a second thread to modify the value of age
//			 return new User(this);
//		}
//		The reason for this is that, since the builder is not thread-safe, if we check the parameters before actually
//		creating the object their values can be changed by another thread between the time the parameters are checked 
//		and the time they are copied. This period of time is known as the window of vulnerability.

	}
}
