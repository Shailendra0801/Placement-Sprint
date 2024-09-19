# Write your MySQL query statement below
select st.machine_id, round(avg(et.timestamp - st.timestamp), 3) as processing_time from Activity as st
join Activity as et on st.machine_id = et.machine_id
and st.process_id = et.process_id
and st.activity_type = 'start'
and et.activity_type = 'end' 
group by st.machine_id;