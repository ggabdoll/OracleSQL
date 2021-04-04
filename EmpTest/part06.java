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
		VALUES(111, '������111', 1111, '�븮11', '01-01-01', '������');

		INSERT INTO emp_test
		VALUES(222, '������222', 2222, '�븮22', '2002-02-02', '������');

		INSERT INTO emp_test
		VALUES(333,  '333������', 3333, '33�븮', '03-03-03', '������');

		INSERT INTO emp_test
		VALUES(444,  '444������', 4444, '44�븮', '04-04-04', '������');

		INSERT 
		INTO emp_test
		VALUES(555, '�̼���555', 5555, '����', '05-05-05', '������');

		INSERT 
		INTO emp_test
		VALUES(666, '�̼���666', 6666, NULL, '2006-06-06', '������');

		INSERT
		INTO emp_test
		VALUES(777, '�ָ�777', 7777, NULL, '07-07-07', '��ȹ��');

		INSERT 
		INTO emp_test
		VALUES(888, '���888', NULL, '�븮', '2008-08-08', '������');

		INSERT 
		INTO emp_test
		VALUES(990, '�ѱ�990', 9990, NULL, '09-09-09', '��ȹ��');

		INSERT 
		INTO emp_test ( id,  name,  title,  dept_name)
		VALUES(991, '���ٸ�991', '', '������');

		INSERT INTO emp_test
		VALUES(992, '§����992', 9992, '����', '2009-09-09', '������');

		SELECT * FROM emp_test;

		COMMIT;

		SELECT * FROM emp_test WHERE title IS NULL;
		SELECT * FROM EMP_TEST WHERE INCOME IS NULL ;

		UPDATE EMP_TEST SET TITLE = '�����' WHERE TITLE IS NULL;

		SELECT *FROM EMP_TEST et WHERE INCOME >2000;

		UPDATE EMP_TEST SET DEPT_NAME = 'Ư����' WHERE INCOME >2000;

		UPDATE EMP_TEST SET INCOME = INCOME - 1000 WHERE INCOME  >2000;

		COMMIT;

		SELECT *FROM EMP_TEST WHERE WELCOME_DAY > TO_CHAR(2005-01-01); 

		SELECT *FROM EMP_TEST et WHERE WELCOME_DAY > TO_CHAR(2005-01-01) AND INCOME <6000;
}
