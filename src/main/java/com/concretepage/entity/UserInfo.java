package com.concretepage.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@NamedQueries({
	@NamedQuery(name = "UserInfo.findById", query = "select o from UserInfo where o.id = :id"),
	@NamedQuery(name = "UserInfo.findByUserNamePassword", query = "select o from UserInfo where o.userName = :userName and o.password = :password"),
	@NamedQuery(name = "UserInfo.findByUserName", query = "select o from UserInfo where o.userName = :userName"),
	@NamedQuery(name = "UserInfo.findAll", query = "select o from UserInfo o"),
	@NamedQuery(name = "UserInfo.findByUserType", query = "select o from UserInfo o where o.UserType = :userType")
})
@Table(name="user_info")
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
