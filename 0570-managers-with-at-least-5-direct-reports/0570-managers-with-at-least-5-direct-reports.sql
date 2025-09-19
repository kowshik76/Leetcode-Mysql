select e.name
from Employee e
join Employee e2
on e.id=e2.managerid
group by e2.managerid
having count(*) >=5