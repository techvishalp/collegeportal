package collegeportal.beans;

public class Parent {
	private String id,name,email,gender,languages,city,address,picname,phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parent(String id,String name,  String gender, String languages, String city,
			String phone) {
		super();
		this.id = id;
		this.name=name;
		this.gender = gender;
		this.languages = languages;
		this.city = city;
		this.phone=phone;
		
		
		this.phone = phone;
	}

	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	public String getPicname() {
		return picname;
	}

	public void setPicname(String picname) {
		this.picname = picname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
