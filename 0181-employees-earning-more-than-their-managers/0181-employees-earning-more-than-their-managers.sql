# Write your MySQL query statement below
-- select e1.name as 'Employee' from Employee e1 
-- where e1.salary > (
--     select e2.salary from Employee e2
--     where e2.id = e1.managerId
-- );
SELECT t1.name as Employee
FROM Employee AS t1
INNER JOIN Employee AS t2 ON t1.managerId=t2.id
WHERE t1.salary > t2.salary