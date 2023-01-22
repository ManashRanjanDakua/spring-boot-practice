package com.example.test.user.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//@JsonIgnoreProperties(value = {"handler","hibernateLazyIntializer","FieldHandler"})
public class UserRequest {

	@NotNull(message = "Name shouldn't be empty or blank")
	@NotBlank
	private String name;
	@Email
	@NotNull(message = "Please enter valid email")
	@NotBlank(message = "Please enter email")
	private String email;
	@Pattern(regexp = "^\\d{10}$", message = "Please enter valid mobile number")
	@NotBlank(message = "Please enter mobile numer")
	@NotNull(message = "Mobile Number should not be null")
	private String mobile;
	@NotNull(message = "Please enter gender")

	private String gender;
	@Min(18)
	@Max(60)
	private int age;
	@NotBlank
	private String nationality;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public UserRequest() {
		super();

	}

	public UserRequest(String name, String email, String mobile, String gender, int age, String nationality) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.age = age;
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "UserRequest [name=" + name + ", email=" + email + ", mobile=" + mobile + ", gender=" + gender + ", age="
				+ age + ", nationality=" + nationality + "]";
	}

}
