DROP TABLE IF EXISTS BUSINESS_ACCOUNT_INFO;
DROP TABLE IF EXISTS BANK_ACCOUNT;
DROP TABLE IF EXISTS ACCOUNT_TYPE;
DROP SEQUENCE IF EXISTS account_number_sequence;

CREATE SEQUENCE account_number_sequence
    START WITH 1000000001
    INCREMENT BY 1;


CREATE TABLE ACCOUNT_TYPE(ACCOUNT_TYPE_ID LONG PRIMARY KEY , ACCOUNT_TYPE VARCHAR);


CREATE TABLE BANK_ACCOUNT(BANK_ACCOUNT_ID INTEGER PRIMARY KEY , ACCOUNT_NUMBER LONG SEQUENCE account_number_sequence,
                          ACCOUNT_NAME VARCHAR2, MOBILE_PHONE_NUMBER VARCHAR, ACCOUNT_TYPE_ID INTEGER REFERENCES ACCOUNT_TYPE(ACCOUNT_TYPE_ID) , BALANCE DOUBLE);

CREATE TABLE BUSINESS_ACCOUNT_INFO(BUSINESS_ACCOUNT_INFO_ID INTEGER PRIMARY KEY, ACCOUNT_NUMBER INTEGER REFERENCES BANK_ACCOUNT(ACCOUNT_NUMBER),
                                   TRADE_LICENSE_NUMBER LONG, TAX_IDENTIFICATION_NUMBER LONG);

INSERT INTO ACCOUNT_TYPE(ACCOUNT_TYPE_ID, ACCOUNT_TYPE) VALUES (1, 'PERSONAL');
INSERT INTO ACCOUNT_TYPE(ACCOUNT_TYPE_ID, ACCOUNT_TYPE) VALUES (2, 'BUSINESS');
INSERT INTO BANK_ACCOUNT(BANK_ACCOUNT_ID, ACCOUNT_NUMBER, ACCOUNT_NAME, MOBILE_PHONE_NUMBER, ACCOUNT_TYPE_ID, BALANCE) VALUES (1,NEXT VALUE FOR account_number_sequence, 'Karim','+8801711111', 1, 100000 );
INSERT INTO BANK_ACCOUNT(BANK_ACCOUNT_ID, ACCOUNT_NUMBER, ACCOUNT_NAME, MOBILE_PHONE_NUMBER, ACCOUNT_TYPE_ID, BALANCE) VALUES (2,NEXT VALUE FOR account_number_sequence, 'Rahim','+8801711112', 2, 200000 );
INSERT INTO BUSINESS_ACCOUNT_INFO(BUSINESS_ACCOUNT_INFO_ID, ACCOUNT_NUMBER, TRADE_LICENSE_NUMBER, TAX_IDENTIFICATION_NUMBER) VALUES (1, 1000000001, 12345666, 1234566);

commit;