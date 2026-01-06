
package p1;

public class Student {

	private String name,rollnum,email;

	private long mobile;

	public Student(String name, String rollnum, String email,

			long mobile) {

		this.name = name;

		this.rollnum = rollnum;

		this.email = email;

		this.mobile = mobile;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getRollnum() {

		return rollnum;

	}

	public void setRollnum(String rollnum) {

		this.rollnum = rollnum;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	public long getMobile() {

		return mobile;

	}

	public void setMobile(long mobile) {

		this.mobile = mobile;

	}

	@Override

	public String toString() {

		return "Student [name=" + name + ", rollnum=" +

	rollnum + ", email=" + email + ", mobile=" + mobile + "]";

	}

}