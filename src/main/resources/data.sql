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
VALUES(10001, 'Ranga', 'Hyderabad',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(10002, 'James', 'New York',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(10003, 'Pieter', 'Amsterdam',sysdate());

INSERT INTO COURSE (ID, NAME, created_Date, last_updated_date)
VALUES(10001, 'JPA in 50 Steps', sysdate(), sysdate());
INSERT INTO COURSE (ID, NAME, created_Date, last_updated_date)
VALUES(10002, 'Spring in 50 Steps', sysdate(), sysdate());
INSERT INTO COURSE (ID, NAME, created_Date, last_updated_date)
VALUES(10003, 'Spring Boot in 100 Steps', sysdate(), sysdate());

INSERT INTO PASSPORT (ID, NUMBER)
VALUES(40001, 'E123456');
INSERT INTO PASSPORT (ID, NUMBER)
VALUES(40002, 'E111111');
INSERT INTO PASSPORT (ID, NUMBER)
VALUES(40003, 'E222222');

INSERT INTO STUDENT (ID, NAME, PASSPORT_ID)
VALUES(20001, 'Brian', 40001);
INSERT INTO STUDENT (ID, NAME, PASSPORT_ID)
VALUES(20002, 'Adam', 40002);
INSERT INTO STUDENT (ID, NAME, PASSPORT_ID)
VALUES(20003, 'Jane', 40003);

INSERT INTO REVIEW (ID, RATING, DESCRIPTION, COURSE_ID)
VALUES(50001, '5', 'Great Course', 10001);
INSERT INTO REVIEW (ID, RATING, DESCRIPTION, COURSE_ID)
VALUES(50002, '4', 'Wonderful Course', 10002);
INSERT INTO REVIEW (ID, RATING, DESCRIPTION, COURSE_ID)
VALUES(50003, '3', 'Awesome Course', 10003);