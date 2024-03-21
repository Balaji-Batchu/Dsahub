/* Write your PL/SQL query statement below */
select name Employee from employee a where salary > (select salary from employee where id = a.managerId)