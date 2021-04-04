package EmpTest;

public class part06 {

	CREATE TABLE emp_test(
		 	id int ,
			name varchar(50),
			income int,
			title varchar(30),
			welcome_day varchar(50),
			dept_name varchar(50)
		);

		INSERT 
		INTO emp_test
		VALUES(111, '김유신111', 1111, '대리11', '01-01-01', '영업부');

		INSERT INTO emp_test
		VALUES(222, '김유신222', 2222, '대리22', '2002-02-02', '영업부');

		INSERT INTO emp_test
		VALUES(333,  '333김유신', 3333, '33대리', '03-03-03', '영업부');

		INSERT INTO emp_test
		VALUES(444,  '444김유신', 4444, '44대리', '04-04-04', '영업부');

		INSERT 
		INTO emp_test
		VALUES(555, '이순신555', 5555, '부장', '05-05-05', '관리부');

		INSERT 
		INTO emp_test
		VALUES(666, '이순신666', 6666, NULL, '2006-06-06', '관리부');

		INSERT
		INTO emp_test
		VALUES(777, '주몽777', 7777, NULL, '07-07-07', '기획부');

		INSERT 
		INTO emp_test
		VALUES(888, '평민888', NULL, '대리', '2008-08-08', '영업부');

		INSERT 
		INTO emp_test
		VALUES(990, '한국990', 9990, NULL, '09-09-09', '기획부');

		INSERT 
		INTO emp_test ( id,  name,  title,  dept_name)
		VALUES(991, '꺽다리991', '', '영업부');

		INSERT INTO emp_test
		VALUES(992, '짠돌이992', 9992, '과장', '2009-09-09', '관리부');

		SELECT * FROM emp_test;

		COMMIT;

		SELECT * FROM emp_test WHERE title IS NULL;
		SELECT * FROM EMP_TEST WHERE INCOME IS NULL ;

		UPDATE EMP_TEST SET TITLE = '계약직' WHERE TITLE IS NULL;

		SELECT *FROM EMP_TEST et WHERE INCOME >2000;

		UPDATE EMP_TEST SET DEPT_NAME = '특판팀' WHERE INCOME >2000;

		UPDATE EMP_TEST SET INCOME = INCOME - 1000 WHERE INCOME  >2000;

		COMMIT;

		SELECT *FROM EMP_TEST WHERE WELCOME_DAY > TO_CHAR(2005-01-01); 

		SELECT *FROM EMP_TEST et WHERE WELCOME_DAY > TO_CHAR(2005-01-01) AND INCOME <6000;
}
