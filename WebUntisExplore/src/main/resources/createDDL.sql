CREATE TABLE USERS (
USER_ID VARCHAR(255) NOT NULL,
ACCOUNTLOCKED VARCHAR(255),
DEPARTMENT_ID VARCHAR(255),
EMAIL VARCHAR(255),
ELEMENT_TYPE VARCHAR(255),
ENABLED VARCHAR(255), 
LANGUAGECODE VARCHAR(255), 
LASTLOGINTIME VARCHAR(255), 
LASTPWDUPDATE VARCHAR(255), 
LASTUPDATE VARCHAR(255), 
LOGGEDIN VARCHAR(255), 
LOGINIP VARCHAR(255), 
MANDANT VARCHAR(255), 
MAXBOOKINGS VARCHAR(255), 
NAME VARCHAR(255), 
ORDERNO VARCHAR(255), 
PERSON_ID VARCHAR(255), 
PASSWORD VARCHAR(255), 
PERSONALNAME VARCHAR(255), 
PWCHANGEREQUIRED VARCHAR(255), 
REMOTE VARCHAR(255), 
SHAREDSECRET VARCHAR(255), 
SHAREDSECRETAPP VARCHAR(255), 
SYSTEM VARCHAR(255), 
USERGROUP_ID VARCHAR(255), 
USERKEY VARCHAR(255), 
LOGINRETRIES VARCHAR(255), 
PRIMARY KEY (USER_ID)
);
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(38), PRIMARY KEY (SEQ_NAME));
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0);
