create table tb_order(
    id varchar(10) not null primary key,
    user_name varchar(20) not null,
    created_time datetime not null default current_timestamp,
    order_status int not null,
    remark varchar(256),
);

create table tb_order_item(
    item_id int not null primary key auto_increment,
    order_id varchar(10) not null references tb_order(id),
    product_id varchar(36) not null,
    quantity int not null
);