/* Write your PL/SQL query statement below */


select employee_id from (select e.employee_id from employees e
union 
select s.employee_id from salaries s) unionres
minus
select employee_id from (select e.employee_id from employees e
join salaries s
on e.employee_id = s.employee_id) interres