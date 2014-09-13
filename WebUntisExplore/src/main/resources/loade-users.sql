TRUNCATE table USERS;
LOAD DATA 
INFILE 'P:/Data/eclipse/GIT/GitRepoDR/WebUntisExplore/WebUntisExplore/src/main/files/users-2014-09-13-09-59-vorImportNeue.txt' 
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