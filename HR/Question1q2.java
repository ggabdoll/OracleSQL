package HR;

public class Question1q2 {
	
	--문제 1

	SELECT * FROM EMPLOYEES e2 ;
	SELECT * FROM DEPARTMENTS d; 

	SELECT e.EMPLOYEE_ID AS 사번, e.DEPARTMENT_ID AS 부서번호, e.SALARY AS 연봉,  avg(e.SALARY) AS 부서의 평균연봉
	FROM EMPLOYEES e,DEPARTMENTS d 
	WHERE e.DEPARTMENT_ID =  d.DEPARTMENT_ID ;
	--GROUP BY e.employess_id, department_id,e.SALARY  ;

	--2번 문제 
	SELECT * 
	FROM 
	(
	SELECT RANK() over(ORDER BY SALARY DESC) AS RANKING, LAST_NAME, FIRST_NAME, SALARY 
	FROM EMPLOYEES)
	WHERE RANKING >=6 AND RANKING <=10;
	
	//WHERE절 안에 AS 명을 못 쓰므로 선택하고 싶은 필드를 TABLE화 시켜서 출력

}
