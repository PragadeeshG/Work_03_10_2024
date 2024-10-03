create table if not exists user_notification(
notification_code bigint not null,
user_id varchar(255) null,
sent_at varchar(255) null,
notification_text varchar(255) null,
is_read varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint user_notification_pk primary key(notification_code));