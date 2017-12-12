package com.concretepage.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class UserInfo extends BaseEntity{
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;
	@Column(name="USER_TYPE")
	private int userType;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="MIDDLE_NAME")
	private String middleName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="DATE_OF_BIRTH")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfBirth;
	@Column(name="GENDER")
	private String gender;
	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;
	@Column(name="VALID_UNTIL")
	@Temporal(TemporalType.TIMESTAMP)
	private Date validUntil;
	@Column(name="FAILED_LOGIN_COUNT")
	private int failedLoginCount;
	@Column(name="IS_ACCOUNT_LOCKED")
	private int isAccountLocked;
	@Column(name="FORGOT_PASSWORD")
	private int forgotPassword;
	
}
