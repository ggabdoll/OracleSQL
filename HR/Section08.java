package HR;

public class Section08 {
	
	--Section 08

	--01번

	SELECT d.DEPARTMENT_NAME AS 부서명, TO_CHAR(e.HIRE_DATE, 'MON', 'NLS_DATE_LANGUAGE=ENGLISH') AS HIRE_DATE, count(*)
	FROM EMPLOYEES e, DEPARTMENTS d 
	WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID
	GROUP BY d.DEPARTMENT_NAME, TO_CHAR(e.HIRE_DATE, 'MON', 'NLS_DATE_LANGUAGE=ENGLISH')
	HAVING COUNT(*) >= 5
	ORDER BY d.DEPARTMENT_NAME ASC;

	--02번

	SELECT 
	       NVL(C.COUNTRY_NAME, '<부서없음>') AS 국가명, NVL(L.CITY, '<부서없음>') AS 도시명, COUNT(*) 직원수
	  FROM EMPLOYEES E LEFT JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID 
	                   LEFT JOIN LOCATIONS L ON D.LOCATION_ID = L.LOCATION_ID
	                   LEFT JOIN COUNTRIES C ON L.COUNTRY_ID = C.COUNTRY_ID 
	 GROUP BY COUNTRY_NAME, CITY
	 ORDER BY COUNTRY_NAME ASC, CITY ASC
	;  
	
	--03번

	SELECT e2.EMPLOYEE_ID 직원아이디, e2.FIRST_NAME 이름, A.급여, A.부서평균
	FROM EMPLOYEES e2, DEPARTMENTS d2, 
			(SELect d.DEPARTMENT_NAME AS Dept_NAME, MAX(e.SALARY) AS 급여, AVG(e.SALARY) AS 부서평균 
	      	FROM EMPLOYEES e,DEPARTMENTS d 
			WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID
			GROUP BY d.DEPARTMENT_NAME
			)  A
	WHERE e2.SALARY = A.급여
	AND d2.DEPARTMENT_NAME = A.Dept_NAME
	AND e2.DEPARTMENT_ID = d2.DEPARTMENT_ID ;
	
	--04번

	CREATE TABLE SALGRADE(
	GRADE number(2) PRIMARY KEY,
	LOSAL number(5) NOT NULL,
	HISAL number(5) NOT null
	);

	INSERT INTO SALGRADE VALUES(1,1000,5000);
	INSERT INTO SALGRADE VALUES(2,5001,10000);
	INSERT INTO SALGRADE VALUES(3,10001,20000);
	INSERT INTO SALGRADE VALUES(4,20001,30000);

	SELECT *
	FROM SALGRADE ;

	SELECT sg.GRADE 급여등급, count(*)
	FROM EMPLOYEES e, SALGRADE sg
	WHERE e.SALARY BETWEEN sg.LOSAL AND sg.HISAL 
	GROUP BY sg.GRADE
	ORDER BY GRADE asc;

}
