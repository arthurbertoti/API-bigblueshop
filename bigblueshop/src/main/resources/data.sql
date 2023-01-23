INSERT INTO User(name, email, phone, password) VALUES('Viewer', 'viewer@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, email, phone, password) VALUES('Admin', 'admin@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');

INSERT INTO PROFILE (id, name) VALUES(1, 'ROLE_VIEWER');
INSERT INTO PROFILE (id, name) VALUES(2, 'ROLE_ADMIN');

INSERT INTO USER_PROFILES(user_id, profiles_id) VALUES(1, 1);
INSERT INTO USER_PROFILES(user_id, profiles_id) VALUES(2, 2);

INSERT INTO CATEGORY(name, description) VALUES('Categoria 1', 'primeira categoria');
INSERT INTO CATEGORY(name, description) VALUES('Categoria 2', 'segunda categoria');
INSERT INTO CATEGORY(name, description) VALUES('Categoria 3', 'terceiro categoria');

INSERT INTO PRODUCT(name, description, barcode, category_id) VALUES('Produto', 'Primeiro produto', '1', 1);
INSERT INTO PRODUCT(name, description, barcode, category_id) VALUES('Produto 2', 'segundo produto', '12', 2);
INSERT INTO PRODUCT(name, description, barcode, category_id) VALUES('Produto 3', 'terceiro produto', '123', 3);
