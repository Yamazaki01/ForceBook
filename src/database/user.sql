DROP TABLE IF EXISTS forcebook.user;

create table forcebook.user(
id int primary key not null auto_increment,
user_id varchar(20) unique,
user_pass varchar(20),
user_mail varchar(30)
);

insert into forcebook.user(
user_id,
user_pass,
user_mail
)
values(
'test',
'test',
'mail@gamil.com'
);

