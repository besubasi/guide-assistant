--liquibase formatted sql

INSERT INTO account."user"
(is_active, created_at, id, updated_at, created_by, email, "name", phone_number, surname, updated_by, user_name, password)
VALUES (true, current_timestamp, -1, current_timestamp, 'initial', 'besubasi@gmail.com', 'Bekir',
        '905543078004', 'SUBAŞI', 'initial', 'bsubasi','123');
