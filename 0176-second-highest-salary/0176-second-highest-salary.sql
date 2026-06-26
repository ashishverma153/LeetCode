# Write your MySQL query statement below
select max(salary) as secondhighestSalary
from employee
where salary < (select MAX(Salary) from employee)