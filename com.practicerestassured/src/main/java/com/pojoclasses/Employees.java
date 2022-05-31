package com.pojoclasses;

public class Employees {

	private int id;
	private String firstName;
	private String job;
	private String[] skills;
	public CompanyDetails company;

	public Employees(int id, String name, String job, String[] skills, String companyName, String email) {
		super();
		this.id = id;
		this.firstName = name;
		this.job = job;
		this.skills = skills;
		this.company = new CompanyDetails(companyName, email);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public CompanyDetails getCompany() {
		return company;
	}

	public void setCompany(CompanyDetails company) {
		this.company = company;
	}

}
