DROP DATABASE IF EXISTS forcebook;

create database forcebook;


DROP TABLE IF EXISTS forcebook.user;

create table forcebook.user(
id int primary key not null auto_increment,
user_id varchar(30) unique,
user_pass varchar(30),
user_open_nickname varchar(128),
user_mail varchar(30) unique
);

insert into forcebook.user(
user_id,
user_pass,
user_open_nickname,
user_mail
)
values(
'test',
'test',
'testnickname',
'mail@gamil.com'
);

insert into forcebook.user(
user_id,
user_pass,
user_open_nickname,
user_mail
)
values(
'test1',
'test',
'testnickname',
'mail+1@gamil.com'
);

insert into forcebook.user(
user_id,
user_pass,
user_open_nickname,
user_mail
)
values(
'test2',
'test',
'testnickname',
'mail+2@gamil.com'
);



DROP TABLE IF EXISTS forcebook.friend;

create table forcebook.friend(
friend_id int primary key not null auto_increment,
foller_u_id int,# フォロー側
follerwer_u_id int,#フォローワー側
friend_flg int #1 友達, 5 申請, 9 拒否
);

insert into forcebook.friend(
foller_u_id,
follerwer_u_id,
friend_flg
)
values(
1,
2,
1
);

insert into forcebook.friend(
foller_u_id,
follerwer_u_id,
friend_flg
)
values(
2,
1,
5
);

insert into forcebook.friend(
foller_u_id,
follerwer_u_id,
friend_flg
)
values(
3,
1,
5
);




