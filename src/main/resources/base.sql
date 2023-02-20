INSERT INTO roles VALUES (1, 'ROLE_ADMIN'),
                         (2, 'ROLE_USER');

INSERT INTO users VALUES (1, 21, 'admin@gmail.com', 'Nikolai', 'Vasiliev', '{bcrypt}$2a$12$7Q1U0j4UFwFyBMQf/tH7xuEpB3FTl8rLnu/RnvLy/iPGEwc5OHtd2', 'admin'),
                         (2, 32, 'user@gmail.com', 'Mikhail', 'Ivanov', '{bcrypt}$2a$12$EwwLB73OVleOFwwDuW1syev/FAroEdCiM1OCD6jv0Bh9VR2BMRrpO', 'user');

INSERT INTO users_roles VALUES (1, 1),
                               (1, 2),
                               (2, 2);
