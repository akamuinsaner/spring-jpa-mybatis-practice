create table if not exists `user` (
    `id` int unsigned auto_increment,
    `name` varchar(8) not null,
    `age` int not null,
    `gender` int,
    `address_id` int,
    primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists `address` (
    `id` int unsigned AUTO_INCREMENT,
    `street` varchar(45),
    `city` varchar(45),
    primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists `pet` (
    `id` int unsigned AUTO_INCREMENT,
    `name` varchar(45),
    `user_id` int,
    primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists `sys_user_role` (
    `id` int unsigned auto_increment,
    `user_id` int,
    `role_id` int,
    primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists `role` (
    `id` int unsigned auto_increment,
    `name` varchar(50),
    primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
#
# DROP TABLE IF EXISTS user;
#
# CREATE TABLE user
# (
#     id BIGINT(20) NOT NULL COMMENT '主键ID',
#     name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
#     age INT(11) NULL DEFAULT NULL COMMENT '年龄',
#     email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
#     PRIMARY KEY (id)
# )ENGINE=InnoDB DEFAULT CHARSET=utf8;