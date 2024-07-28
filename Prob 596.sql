# Write your MySQL query statement below
select class From Courses 
group by 
class having count(distinct student) >= 5;