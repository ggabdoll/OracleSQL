package HR;

public class Question3 {
	
	--3�� ����

	SELECT EXTRACT(YEAR FROM hire_date) AS �⵵, round(avg(e.SALARY) , -1)AS ��ձ޿�
	FROM EMPLOYEES e, JOBS j2 
	WHERE j2.JOB_TITLE = 'Sales Manager'
	GROUP BY EXTRACT(YEAR from hire_date)
	ORDER BY �⵵ asc;

}
