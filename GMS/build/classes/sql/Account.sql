select *from tab;

CREATE SEQUENCE account_seq START WITH 1000;
DROP SEQUENCE account_seq;

CREATE TABLE account(
 account_seq DECIMAL CONSTRAINT account_pk_account_seq PRIMARY KEY,
 money DECIMAL,
 account_num VARCHAR2(20),
 account_type VARCHAR2(20),
 create_date  DATE,
 limit DECIMAL
);


INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
)
VALUES(
	account_seq.nextval,2000,'123-456-789','일반 통장', SYSDATE,0
);


INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
)
VALUES(
	account_seq.nextval,1000,'113-546-872','일반 통장', SYSDATE,0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
)
VALUES(
	account_seq.nextval,1000,'212-154-452','일반 통장', SYSDATE,0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
)
VALUES(
	account_seq.nextval,1000,'465-751-451','일반 통장', SYSDATE,0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
)
VALUES(
	account_seq.nextval,1000,'454-785-312','일반 통장', SYSDATE,0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
)
VALUES(
	account_seq.nextval,1000,'454-432-452','일반 통장', SYSDATE,0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
)
VALUES(
	account_seq.nextval,1000,'778-513-642','일반 통장', SYSDATE,0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
)
VALUES(
	account_seq.nextval,1000,'542-231-351','일반 통장', SYSDATE,0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
)
VALUES(
	account_seq.nextval,1000,'464-233-123','일반 통장', SYSDATE,0
);
INSERT INTO account(
	account_seq,money,account_num,account_type,create_date,limit
)
VALUES(
	account_seq.nextval,1000,'654-872-312','일반 통장', SYSDATE,0
);
SELECT *FROM account;
DROP TABLE account;
