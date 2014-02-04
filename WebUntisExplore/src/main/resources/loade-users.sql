LOAD DATA 
INFILE 'E:/users.txt' 
INTO TABLE USERS
FIELDS TERMINATED BY '\t'
lines terminated by '\n'
(
Mandant,
USER_ID,
Name,
UserKey,
PersonalName,
Password,
USERGROUP_ID,
EMail,
PERSON_ID,
Element_Type,
LanguageCode,
Department_ID,
MaxBookings,
LoggedIn,
LastLoginTime,
LoginIP,
Enabled,
AccountLocked,
loginretries,
System,
Remote,
LastUpdate,
OrderNo,
PwChangeRequired,
SharedSecret,
SharedSecretApp,
LastPwdUpdate
) 
;