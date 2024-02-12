-- The management decided to collect feedback from their guest after 5 days from vacating the resort.
-- Write a query to display the guest name, phone number, resort id and Feedback_Date of all the guests who booked resorts.
-- Sort the records based on the guest name in desc order.

-- (Hint: use todate column to find the Feedback_Date. Use the Guest and Booking table to retrieve records.)

select g.guest_name, g.phone_number, b.resort_id, b.todate as Feedback_Date
from guest g
join booking b
on g.guest_id = b.guest_id
order by g.guest_name desc;





