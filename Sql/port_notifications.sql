create table if not exists port_notifications(
port_id bigint not null,
notification_code bigint null,
ssName varchar(255) null,
port_name_length varchar(255) null,
sent_at varchar(255) null,
notification_text varchar(255) null,
is_read varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint port_notifications_pk primary key(port_id));