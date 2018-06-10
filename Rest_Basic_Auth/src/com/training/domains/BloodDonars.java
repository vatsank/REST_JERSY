package com.training.domains;

public class BloodDonars {

	
	private long mobileNumber;
	private String donarName;
	private String bloodGroup;
	private int age;
	private String gender;
	
	
	public BloodDonars(long mobileNumber, String donarName, String bloodGroup, int age, String gender) {
		super();
		this.mobileNumber = mobileNumber;
		this.donarName = donarName;
		this.bloodGroup = bloodGroup;
		this.age = age;
		this.gender = gender;
	}


	public BloodDonars() {
		super();

	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getDonarName() {
		return donarName;
	}


	public void setDonarName(String donarName) {
		this.donarName = donarName;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "BloodDonars [mobileNumber=" + mobileNumber + ", donarName=" + donarName + ", bloodGroup=" + bloodGroup
				+ ", age=" + age + ", gender=" + gender + "]";
	}

	
}
