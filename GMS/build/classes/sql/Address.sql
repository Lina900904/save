select *from tab;

--  TAB : address
--addr_seq(DECIMAL, pk)
--zipcode
--province 경기도
--city 서울시, 안양시
--gugun 강남구, 가평구
--doro 백범로 15번길
CREATE SEQUENCE address_seq START WITH 1000;
DROP SEQUENCE address_seq;  


CREATE TABLE address(
 address_seq DECIMAL CONSTRAINT address_pk_address_seq PRIMARY KEY,
 zipcode VARCHAR2(20),
 province VARCHAR2(20),
 city VARCHAR2(20),
 gugun VARCHAR2(20),
 doro VARCHAR2(20)
);

INSERT INTO address(
address_seq,zipcode,province,city,gugun,doro
) VALUES(
address_seq.nextval,'12345','','서울시','강남구','백범로 15번길'
);

INSERT INTO address(
address_seq,zipcode,province,city,gugun,doro
) VALUES(
address_seq.nextval,'57945','','인천시','계양구','안남로 26번길'
);

INSERT INTO address(
address_seq,zipcode,province,city,gugun,doro
) VALUES(
address_seq.nextval,'57867','','서울시','구로구','구로길 20번길'
);

INSERT INTO address(
address_seq,zipcode,province,city,gugun,doro
) VALUES(
address_seq.nextval,'76868','','대전시','서구','서구로 50번길'
);

INSERT INTO address(
address_seq,zipcode,province,city,gugun,doro
) VALUES(
address_seq.nextval,'55678','','대구시','중구','중구로 88번길'
);

INSERT INTO address(
address_seq,zipcode,province,city,gugun,doro
) VALUES(
address_seq.nextval,'86744','','부산시','사하구','사하로 70번길'
);

INSERT INTO address(
address_seq,zipcode,province,city,gugun,doro
) VALUES(
address_seq.nextval,'54696','','인천시','남동구','남동로 60번길'
);
INSERT INTO address(
address_seq,zipcode,province,city,gugun,doro
) VALUES(
address_seq.nextval,'45677','','대전시','유성구','유성로 89번길'
);

INSERT INTO address(
address_seq,zipcode,province,city,gugun,doro
) VALUES(
address_seq.nextval,'65642','','광주시','대덕구','대덕로 12번길'
);

INSERT INTO address(
address_seq,zipcode,province,city,gugun,doro
) VALUES(
address_seq.nextval,'99512','','대전시','남구','남구로 45번길'
);

INSERT INTO address(
address_seq,zipcode,province,city,gugun,doro
) VALUES(
address_seq.nextval,'78541','','인천시','부평구','부평로 80번길'
);


SELECT *FROM address;
DROP TABLE address;     

