package de.weg.WebUntis.db;


import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: users
 *
 */
@Entity
@Table(name = "users")
public class Users implements Serializable {

	
	private String Mandant;
	@Id
	@GeneratedValue
	private String USER_ID;
	private String Name;
	private String UserKey;
	private String PersonalName;
	private String Password;
	private String USERGROUP_ID;
	private String EMail;
	private String PERSON_ID;
	private String Element_Type;
	private String LanguageCode;
	private String Department_ID;
	private String MaxBookings;
	private String LoggedIn;
	private String LastLoginTime;
	private String LoginIP;
	private String Enabled;
	private String AccountLocked;
	private String loginretries;
	private String System;
	private String Remote;
	private String LastUpdate;
	private String OrderNo;
	private String PwChangeRequired;
	private String SharedSecret;
	private String SharedSecretApp;
	private String LastPwdUpdate;

	private static final long serialVersionUID = 1L;

	public Users() {
		super();
	}   
	public String getMandant() {
		return this.Mandant;
	}

	public void setMandant(String Mandant) {
		this.Mandant = Mandant;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUserKey() {
		return UserKey;
	}
	public void setUserKey(String userKey) {
		UserKey = userKey;
	}
	public String getPersonalName() {
		return PersonalName;
	}
	public void setPersonalName(String personalName) {
		PersonalName = personalName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUSERGROUP_ID() {
		return USERGROUP_ID;
	}
	public void setUSERGROUP_ID(String uSERGROUP_ID) {
		USERGROUP_ID = uSERGROUP_ID;
	}
	public String getEMail() {
		return EMail;
	}
	public void setEMail(String eMail) {
		EMail = eMail;
	}
	public String getPERSON_ID() {
		return PERSON_ID;
	}
	public void setPERSON_ID(String pERSON_ID) {
		PERSON_ID = pERSON_ID;
	}
	public String getElement_Type() {
		return Element_Type;
	}
	public void setElement_Type(String element_Type) {
		Element_Type = element_Type;
	}
	public String getLanguageCode() {
		return LanguageCode;
	}
	public void setLanguageCode(String languageCode) {
		LanguageCode = languageCode;
	}
	public String getDepartment_ID() {
		return Department_ID;
	}
	public void setDepartment_ID(String department_ID) {
		Department_ID = department_ID;
	}
	public String getMaxBookings() {
		return MaxBookings;
	}
	public void setMaxBookings(String maxBookings) {
		MaxBookings = maxBookings;
	}
	public String getLoggedIn() {
		return LoggedIn;
	}
	public void setLoggedIn(String loggedIn) {
		LoggedIn = loggedIn;
	}
	public String getLastLoginTime() {
		return LastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		LastLoginTime = lastLoginTime;
	}
	public String getLoginIP() {
		return LoginIP;
	}
	public void setLoginIP(String loginIP) {
		LoginIP = loginIP;
	}
	public String getEnabled() {
		return Enabled;
	}
	public void setEnabled(String enabled) {
		Enabled = enabled;
	}
	public String getAccountLocked() {
		return AccountLocked;
	}
	public void setAccountLocked(String accountLocked) {
		AccountLocked = accountLocked;
	}
	public String getLoginretries() {
		return loginretries;
	}
	public void setLoginretries(String loginretries) {
		this.loginretries = loginretries;
	}
	public String getSystem() {
		return System;
	}
	public void setSystem(String system) {
		System = system;
	}
	public String getRemote() {
		return Remote;
	}
	public void setRemote(String remote) {
		Remote = remote;
	}
	public String getLastUpdate() {
		return LastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		LastUpdate = lastUpdate;
	}
	public String getOrderNo() {
		return OrderNo;
	}
	public void setOrderNo(String orderNo) {
		OrderNo = orderNo;
	}
	public String getPwChangeRequired() {
		return PwChangeRequired;
	}
	public void setPwChangeRequired(String pwChangeRequired) {
		PwChangeRequired = pwChangeRequired;
	}
	public String getSharedSecret() {
		return SharedSecret;
	}
	public void setSharedSecret(String sharedSecret) {
		SharedSecret = sharedSecret;
	}
	public String getSharedSecretApp() {
		return SharedSecretApp;
	}
	public void setSharedSecretApp(String sharedSecretApp) {
		SharedSecretApp = sharedSecretApp;
	}
	public String getLastPwdUpdate() {
		return LastPwdUpdate;
	}
	public void setLastPwdUpdate(String lastPwdUpdate) {
		LastPwdUpdate = lastPwdUpdate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
}
