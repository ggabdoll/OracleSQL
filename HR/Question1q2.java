package HR;

public class Question1q2 {
	
	--���� 1

	SELECT * FROM EMPLOYEES e2 ;
	SELECT * FROM DEPARTMENTS d; 

	SELECT e.EMPLOYEE_ID AS ���, e.DEPARTMENT_ID AS �μ���ȣ, e.SALARY AS ����,  avg(e.SALARY) AS �μ��� ��տ���
	FROM EMPLOYEES e,DEPARTMENTS d 
	WHERE e.DEPARTMENT_ID =  d.DEPARTMENT_ID ;
	--GROUP BY e.employess_id, department_id,e.SALARY  ;

	--2�� ���� 
	SELECT * 
	FROM 
	(
	SELECT RANK() over(ORDER BY SALARY DESC) AS RANKING, LAST_NAME, FIRST_NAME, SALARY 
	FROM EMPLOYEES)
	WHERE RANKING >=6 AND RANKING <=10;
	
	//WHERE�� �ȿ� AS ���� �� ���Ƿ� �����ϰ� ���� �ʵ带 TABLEȭ ���Ѽ� ���

}
