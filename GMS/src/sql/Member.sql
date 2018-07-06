select *from tab;



CREATE TABLE member(
	userid VARCHAR2(20) CONSTRAINT member_pk_userid PRIMARY KEY,
	password VARCHAR2(20),
	name VARCHAR2(20),
	ssn VARCHAR2(20),
	cregidate DATE,
	phone VARCHAR2(20),
	email VARCHAR2(20),
	profile VARCHAR2(20),
	access_num VARCHAR2(20),
	credit_rating DECIMAL,
	address_seq DECIMAL,
	account_seq DECIMAL
);
ALTER TABLE member ADD CONSTRAINT address_fk_address_seq
FOREIGN KEY(address_seq) REFERENCES address(address_seq);

ALTER TABLE member ADD CONSTRAINT account_fk_account_seq
FOREIGN KEY(account_seq) REFERENCES account(account_seq);
 
DESC member;


--userid,password,name,ssn,cregidate,phone,email,profile,access_num,credit_rating,addr_seq,account_seq

INSERT INTO member(
userid,password,name,ssn,cregidate,
phone,email,profile,access_num,credit_rating,
address_seq,account_seq

) VALUES(
'kim','1234','김유신','900904',SYSDATE,
'010-3891-1697','seul1990@test.com','kim.jpg','',5,
1000,1000
);

INSERT INTO member(
userid,password,name,ssn,cregidate,
phone,email,profile,access_num,credit_rating,
address_seq,account_seq

) VALUES(
'lee','1123','이순신','880012',SYSDATE,
'010-1234-4567','sunsini0@test.com','lee.jpg','',5,
1001,1001
);

INSERT INTO member(
userid,password,name,ssn,cregidate,
phone,email,profile,access_num,credit_rating,
address_seq,account_seq

) VALUES(
'gong','2131','공삼이','821122',SYSDATE,
'010-4651-1320','gong@test.com','gong.jpg','',5,
1002,1002
);

INSERT INTO member(
userid,password,name,ssn,cregidate,
phone,email,profile,access_num,credit_rating,
address_seq,account_seq

) VALUES(
'gongsa','4562','공사이','465111',SYSDATE,
'010-7981-4878','gongsa@test.com','gongsa.jpg','',5,
1003,1003
);
INSERT INTO member(
userid,password,name,ssn,cregidate,
phone,email,profile,access_num,credit_rating,
address_seq,account_seq

) VALUES(
'gongoi','1123','공오이','880012',SYSDATE,
'010-4792-1123','gongoi@test.com','gongoi.jpg','',5,
1004,1004
);
INSERT INTO member(
userid,password,name,ssn,cregidate,
phone,email,profile,access_num,credit_rating,
address_seq,account_seq

) VALUES(
'ori','1112','오리','451122',SYSDATE,
'010-6542-7852','ori@test.com','ori.jpg','',5,
1005,1005
);
INSERT INTO member(
userid,password,name,ssn,cregidate,
phone,email,profile,access_num,credit_rating,
address_seq,account_seq

) VALUES(
'mal','5412','말미잘','851313',SYSDATE,
'010-4628-7425','mal@test.com','mal.jpg','',5,
1006,1006
);
INSERT INTO member(
userid,password,name,ssn,cregidate,
phone,email,profile,access_num,credit_rating,
address_seq,account_seq

) VALUES(
'kang','875','강아지','56511',SYSDATE,
'010-1562-4522','kang@test.com','kang.jpg','',5,
1007,1007
);
INSERT INTO member(
userid,password,name,ssn,cregidate,
phone,email,profile,access_num,credit_rating,
address_seq,account_seq

) VALUES(
'go','7852','고양이','215522',SYSDATE,
'010-4212-9875','go@test.com','go.jpg','',5,
1008,1008
);
INSERT INTO member(
userid,password,name,ssn,cregidate,
phone,email,profile,access_num,credit_rating,
address_seq,account_seq

) VALUES(
'na','8522','나비','465122',SYSDATE,
'010-1231-4682','na@test.com','na.jpg','',5,
1009,1009
);


SELECT *FROM member;
DROP TABLE member;


--join 조인
SELECT userid, name, account_num, city
FROM member m, account ac, address ad
WHERE m.account_seq=ac.account_seq
AND m.address_seq = ad.address_seq
AND m.userid= 'kim'
;

SELECT *FROM member, account
WHERE member.account_seq=account.account_seq
AND member.userid = 'lee'
;
