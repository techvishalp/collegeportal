package collegeportal.beans;

public class Student_bean {
	
	private String loginid ,password ,name,email,phone;

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Student_bean(String loginid, String password, String name, String email, String phone) {
		super();
		this.loginid = loginid;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Student_bean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
