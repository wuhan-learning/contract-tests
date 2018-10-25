create table tb_user(
    user_name varchar(20) not null primary key,
    password varchar(256) not null,
    age int,
    email varchar(50),
    mobile varchar(11),
    remark varchar(256)
);