
with delivery_date as(
    select d.* ,
    row_number() over(partition by customer_id order by order_date) as rn 
    from Delivery d
)
select round(sum(case when order_date=customer_pref_delivery_date then 1 else 0 end)/
count(*) *100 ,2) as immediate_percentage 
from delivery_date where rn=1