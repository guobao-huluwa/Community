CREATE TABLE notification
(
  id BIGINT AUTO_INCREMENT primary key ,
  notifier bigint not null ,
  receiver bigint not null ,
  outerId bigint not null ,
  type INT not null ,
  gmt_create  bigint not null ,
  status int DEFAULT 0 NOT NULL
);