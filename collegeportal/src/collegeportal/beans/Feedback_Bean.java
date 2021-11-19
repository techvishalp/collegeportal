package collegeportal.beans;

public class Feedback_Bean {
	
	public Feedback_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback_Bean(String fname, String emailid, String phone, String feedback, String rating, String cmbcity) {
		super();
		this.fname = fname;
		this.emailid = emailid;
		this.phone = phone;
		this.feedback = feedback;
		this.rating = rating;
		this.cmbcity = cmbcity;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getCmbcity() {
		return cmbcity;
	}

	public void setCmbcity(String cmbcity) {
		this.cmbcity = cmbcity;
	}

	private String fname,emailid,phone,feedback,rating,cmbcity;

}
