-- salaries 테이블에서 직원 번호와 한 직원의 평균 급여를 중복없이 출력해보세요.

SELECT DISTINCT emp_no,
                (SELECT AVG(salary)
                 FROM salaries
                 WHERE emp_no = s.emp_no) as avg_salary
FROM salaries s;