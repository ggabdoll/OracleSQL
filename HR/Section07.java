package HR;

public class Section07 {
	
	--Section 07

	--01번

	SELECT EXTRACT(MONTH FROM e.HIRE_DATE) || '월'AS 월
	FROM EMPLOYEES e, DEPARTMENTS d 
	GROUP BY EXTRACT(MONTH FROM e.HIRE_DATE)
	ORDER BY EXTRACT(MONTH FROM e.HIRE_DATE) ; 
	
	--02번
	SELECT d2.DEPARTMENT_NAME, e2.FIRST_NAME, A.max_sal
	FROM EMPLOYEES e2, DEPARTMENTS d2, 
			(SELect d.DEPARTMENT_NAME AS Dept_NAME, MAX(e.SALARY) AS max_sal 
	      	FROM EMPLOYEES e,DEPARTMENTS d 
			WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID
			GROUP BY d.DEPARTMENT_NAME
			)  A
	WHERE e2.SALARY = A.max_sal
	AND d2.DEPARTMENT_NAME = A.Dept_NAME
	AND e2.DEPARTMENT_ID = d2.DEPARTMENT_ID ;
	
	--03번
	SELECT d.DEPARTMENT_NAME AS 부서명, MAX(e.SALARY) AS 최대급여, MIN(e.SALARY) AS 최소급여, TRUNC(AVG(e.SALARY),0) AS 평균급여 
	FROM EMPLOYEES e, DEPARTMENTS d 
	WHERE d.DEPARTMENT_ID = e.DEPARTMENT_ID
	GROUP BY d.DEPARTMENT_NAME 
	HAVING TRUNC(AVG(e.SALARY), 0) > (
										SELECT TRUNC(AVG(e2.SALARY), 0)
										FROM EMPLOYEES e2, DEPARTMENTS d2
										WHERE d2.DEPARTMENT_NAME = 'IT' AND d2.DEPARTMENT_ID = e2.DEPARTMENT_ID
										)
			AND TRUNC(AVG(e.SALARY), 0) < (
											SELECT TRUNC(AVG(e3.SALARY), 0)
											FROM EMPLOYEES e3, DEPARTMENTS d3
											WHERE d3.DEPARTMENT_NAME = 'Sales' AND d3.DEPARTMENT_ID = e3.DEPARTMENT_ID 
											)
	;
		
	
	--04번

	SELECT 
	       NVL(D.DEPARTMENT_NAME, '<신생부서>') AS DEPARTMENT_NAME , COUNT(*)
	  FROM EMPLOYEES E LEFT JOIN DEPARTMENTS D
	  ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
	 GROUP BY D.DEPARTMENT_NAME
	HAVING COUNT(*) = 1
	 ORDER BY D.DEPARTMENT_NAME 
	;

}
