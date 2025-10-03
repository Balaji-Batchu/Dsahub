# Write your MySQL query statement below
select a.name, IFNULL(sum(b.distance), 0) as travelled_distance
from users a
left join rides b
on a.id = b.user_id
group by b.user_id
order by sum(b.distance) desc, a.name asc;