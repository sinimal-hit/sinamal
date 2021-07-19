create table user(
    id int(20) not null primary key ,
    name varchar (30) default null ,
    pwd varchar (30) default null
)engine=innodb default charset=utf8;
INSERT into user(id,name,pwd) values
(1,'doer','123456'),
(2,'张三','123456'),
(3,'李四','123456');