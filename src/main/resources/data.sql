--create table person
--(
--    id integer not null,
--    name varchar(255) null,
--    location varchar(255),
--    birth_date timestamp,
--    primary key(id)
--);
--create table course
--(
--    id integer not null,
--    name varchar(255) null
--);


INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(10001,  'Ranga', 'Hyderabad',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(10002,  'James', 'New York',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(10003,  'Pieter', 'Amsterdam',sysdate());

INSERT INTO COURSE (ID, NAME, created_Date, last_updated_date)
VALUES(10001, 'JPA', sysdate(), sysdate());
INSERT INTO COURSE (ID, NAME, created_Date, last_updated_date)
VALUES(10002, 'JPA2', sysdate(), sysdate());
INSERT INTO COURSE (ID, NAME, created_Date, last_updated_date)
VALUES(10003, 'JPA3', sysdate(), sysdate());

INSERT INTO STUDENT (ID, NAME, PASSPORT_ID)
VALUES(20001, 'Brian', 40001);
INSERT INTO STUDENT (ID, NAME, PASSPORT_ID)
VALUES(20002, 'Adam', 40002);
INSERT INTO STUDENT (ID, NAME, PASSPORT_ID)
VALUES(20003, 'Jane', 40003);

INSERT INTO PASSPORT (ID, NUMBER)
VALUES(40001, 'E123456');
INSERT INTO PASSPORT (ID, NUMBER)
VALUES(40002, 'E111111');
INSERT INTO PASSPORT (ID, NUMBER)
VALUES(40003, 'E222222');

INSERT INTO REVIEW (ID, RATING, DESCRIPTION)
VALUES(50001, '5', 'Great Course1');
INSERT INTO REVIEW (ID, RATING, DESCRIPTION)
VALUES(50002, '4', 'Great Course2');
INSERT INTO REVIEW (ID, RATING, DESCRIPTION)
VALUES(50003, '3', 'Great Course3');