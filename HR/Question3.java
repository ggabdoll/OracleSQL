package HR;

public class Question3 {
	
	--3번 문제

	SELECT EXTRACT(YEAR FROM hire_date) AS 년도, round(avg(e.SALARY) , -1)AS 평균급여
	FROM EMPLOYEES e, JOBS j2 
	WHERE j2.JOB_TITLE = 'Sales Manager'
	GROUP BY EXTRACT(YEAR from hire_date)
	ORDER BY 년도 asc;

}
