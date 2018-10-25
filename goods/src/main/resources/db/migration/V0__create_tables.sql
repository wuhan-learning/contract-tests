create table tb_product(
    id varchar(36) not null primary key,
    name varchar(100) not null,
    price decimal(18, 2) not null,
    stock_balance int not null,
    description varchar(512)
);
