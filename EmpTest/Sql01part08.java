package EmpTest;

public class Sql01part08 {

	SELECT name || ' ´Ô ' || title || 'ÀÌ¸ç ' ||'¿¬ºÀÀº' || salary || '¿ø' AS NTS FROM EMP_TEST ORDER BY TITLE;

	SELECT name, dept_name, salary FROM EMP_TEST et ORDER BY SALARY;
	SELECT salary, welcome_day, name FROM EMP_TEST  ORDER BY SALARY DESC, WELCOME_DAY ASC;

	
}
