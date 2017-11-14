package org.dummy.emp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class Emp {

	public Emp() {

	}

	public Emp(String name, String emailId, long phone) {
		// this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;

	}

	@Id
	@GeneratedValue
	@Column(name = "EMP_ID")
	private int id;
	@Column(name = "EMP_NAME", length = 125, nullable = false)
	private String name;
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "Phone_NO", length = 10, nullable = false)
	private long phone;
	@Column(name = "BASIC_SALARY")
	private double basicSalary;
	@Column(name = "DA")
	private float dearnessAllowance;
	@Column(name = "HRA")
	private float houseRentAllowance;
	@Column(name = "PF")
	private float providentFund;
	@Column(name = "TF")
	private float transFund;
	@Transient()
	private float netSalary;

	/*
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public float getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}

	public float getTransFund() {
		return transFund;
	}

	public void setTransFund(float transFund) {
		this.transFund = transFund;
	}

}
