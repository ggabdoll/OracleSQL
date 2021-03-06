package EmpTest;

public class SQL02part08 {
	
	--2번 문제

	SELECT c.NAME, s.DEPT_NAME, c.SALARY, sg.GRADE
	FROM C_EMP c, S_DEPT s, SAL_GRADE sg
	WHERE SALARY BETWEEN sg.LOSAL AND sg.HISAL
	GROUP BY c.NAME , s.DEPT_NAME ,sg.GRADE,SALARY 
	HAVING c.SALARY < AVG(c.SALARY) ;

	SELECT c.NAME, s.DEPT_NAME, c.SALARY, sg.GRADE
	FROM C_EMP c, S_DEPT s, SAL_GRADE sg 
	WHERE SALARY BETWEEN sg.LOSAL AND sg.HISAL AND (SELECT avg(SALARY) a FROM C_EMP) > c.SALARY 
	 
	GROUP BY c.NAME , s.DEPT_NAME ,sg.GRADE,SALARY;






	SELECT sum(SALARY) FROM C_EMP;



	SELECT *
	FROM C_EMP c, S_DEPT s, SAL_GRADE sg;

	--3번 문제

	SELECT c.NAME, s.DEPT_NAME, c.SALARY, sg.GRADE 
	FROM C_EMP c, S_DEPT s, SAL_GRADE sg 
	WHERE sg.GRADE = (SELECT sg.GRADE FROM SAL_GRADE sg,C_EMP ce 
	WHERE ce.NAME = '홍길동' AND ce.SALARY BETWEEN sg.LOSAL AND sg.HISAL)
	AND (SALARY >= sg.LOSAL AND SALARY <= sg.HISAL)
	AND  c.DEPT_ID = s.ID
	GROUP BY c.NAME, s.DEPT_NAME, c.SALARY, sg.GRADE ;

}
