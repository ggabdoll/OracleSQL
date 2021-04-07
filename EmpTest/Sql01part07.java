package EmpTest;

public class Sql01part07 {

	SELECT name , NVL( trunc(round(salary/30, 2), 1), 0 )AS DS
    , NVL( trunc(round(SALARY/8, 2 ),1),0)AS HS
    FROM EMP_TEST; 
SELECT name,NVL(title,'인사발령전') , NVL(SALARY,0) , NVL( salary*0.15,0) AS GS FROM EMP_TEST;
SELECT NVL(GS,0)  FROM EMP_TEST;
	
}
