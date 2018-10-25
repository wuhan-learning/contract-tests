insert into tb_order (id, user_name, created_time, order_status, remark)
values
('1811110001', 'james', '2018-11-11 12:06:00', 0, '请用顺丰快递');

insert into tb_order_item (order_id, product_id, quantity)
values
('1811110001', 'b6ba8d2d-b471-4810-8e91-5b8185989219', 1),
('1811110001', '4fe32455-8d94-4ca3-bdcf-eef17ae1811d', 1),
('1811110001', 'dc89f217-71c4-42ea-adc6-e4ab02a7e9f0', 3);