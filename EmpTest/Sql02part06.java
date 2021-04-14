package EmpTest;

public class Sql02part06 {
	
	--1번 문제

	SELECT name , dept_name, TO_CHAR(salary, 'L999,999,999,999')
	FROM c_emp, S_DEPT 
	WHERE name LIKE '김%'
	ORDER BY SALARY DESC ;

	--2번 문제

	SELECT dept_name, name, TO_CHAR(TRUNC(salary/30,-1),'L999,999,999,999') DP  
	FROM C_EMP , S_DEPT 
	ORDER BY dept_name, name ASC, DP DESC ; 

	--3번 문제

	SELECT sd.ID , sd.DEPT_NAME , AVG(ce.SALARY) 
	FROM  C_EMP ce ,S_DEPT sd 
	GROUP BY sd.ID ,sd.DEPT_NAME 
	ORDER BY sd.ID ;

	--4번 문제 
	SELECT s.ID, s.DEPT_NAME , AVG(c.SALARY) 
	FROM C_EMP c, S_DEPT s
	WHERE s.id = 1
	GROUP BY s.ID, s.DEPT_NAME;


}
