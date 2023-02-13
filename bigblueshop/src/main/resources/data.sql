INSERT INTO User(name, function, email, phone, password) VALUES('Vitor', 'Colaborador', 'vitor@email.com', '5551154791748', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Antonio', 'Subgerente', 'antonio@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Ana', 'Gerente', 'ana@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');

INSERT INTO PROFILE (id, name) VALUES(1, 'ROLE_VIEWER');
INSERT INTO PROFILE (id, name) VALUES(2, 'ROLE_ADMIN');

INSERT INTO USER_PROFILES(user_id, profiles_id) VALUES(1, 2);
INSERT INTO USER_PROFILES(user_id, profiles_id) VALUES(2, 1);
INSERT INTO USER_PROFILES(user_id, profiles_id) VALUES(3, 1);

INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 1', '000001', 'primeira categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 2', '000012', 'segunda categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 3', '000123', 'terceiro categoria');

INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto', 'Primeiro produto', 'https://images.pexels.com/photos/2529148/pexels-photo-2529148.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 237.94, 1000, '000001', 1);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 2', 'segundo produto', 'https://images.pexels.com/photos/8038334/pexels-photo-8038334.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 860.99, 300, '000012', 2);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 3', 'terceiro produto', 'https://images.pexels.com/photos/1566435/pexels-photo-1566435.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 523.87, 2500, '000123', 3);

INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000001', 'Alberto Franco', '2023-02-09 11:00:00', '1000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000012', 'Bernardo Conte', '2023-02-10 12:00:00',  '2000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000123', 'Caciano Gretto', '2023-02-11 13:00:00',  '3000');


/*

INSERT INTO User(name, function, email, phone, password) VALUES('Vitor', 'Colaborador', 'vitor@email.com', '5551154791748', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Antonio', 'Subgerente', 'antonio@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Ana', 'Gerente', 'ana@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Vitor', 'Colaborador', 'vitor@email.com', '5551154791748', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Antonio', 'Subgerente', 'antonio@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Ana', 'Gerente', 'ana@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Vitor', 'Colaborador', 'vitor@email.com', '5551154791748', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Antonio', 'Subgerente', 'antonio@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Ana', 'Gerente', 'ana@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Vitor', 'Colaborador', 'vitor@email.com', '5551154791748', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Antonio', 'Subgerente', 'antonio@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Ana', 'Gerente', 'ana@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Vitor', 'Colaborador', 'vitor@email.com', '5551154791748', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Antonio', 'Subgerente', 'antonio@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Ana', 'Gerente', 'ana@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Vitor', 'Colaborador', 'vitor@email.com', '5551154791748', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Antonio', 'Subgerente', 'antonio@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Ana', 'Gerente', 'ana@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Vitor', 'Colaborador', 'vitor@email.com', '5551154791748', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Antonio', 'Subgerente', 'antonio@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Ana', 'Gerente', 'ana@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Vitor', 'Colaborador', 'vitor@email.com', '5551154791748', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Antonio', 'Subgerente', 'antonio@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Ana', 'Gerente', 'ana@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Vitor', 'Colaborador', 'vitor@email.com', '5551154791748', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Antonio', 'Subgerente', 'antonio@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Ana', 'Gerente', 'ana@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Vitor', 'Colaborador', 'vitor@email.com', '5551154791748', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Antonio', 'Subgerente', 'antonio@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Ana', 'Gerente', 'ana@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Vitor', 'Colaborador', 'vitor@email.com', '5551154791748', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Antonio', 'Subgerente', 'antonio@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Ana', 'Gerente', 'ana@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Vitor', 'Colaborador', 'vitor@email.com', '5551154791748', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Antonio', 'Subgerente', 'antonio@email.com', '5551123456789', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');
INSERT INTO User(name, function, email, phone, password) VALUES('Ana', 'Gerente', 'ana@email.com', '5551987654321', '$2a$10$AiGn.2FPpnU7rhU9bjIjh.sttWnH8/NR9idM56ma7p5bn8yfXIPcq');








INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 1', '000001', 'primeira categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 2', '000012', 'segunda categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 3', '000123', 'terceiro categoria');

INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto', 'Primeiro produto', 'https://images.pexels.com/photos/2529148/pexels-photo-2529148.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 237.94, 1000, '000001', 1);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 2', 'segundo produto', 'https://images.pexels.com/photos/8038334/pexels-photo-8038334.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 860.99, 300, '000012', 2);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 3', 'terceiro produto', 'https://images.pexels.com/photos/1566435/pexels-photo-1566435.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 523.87, 2500, '000123', 3);

INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000001', 'Alberto Franco', '2023-02-09 11:00:00', '1000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000012', 'Bernardo Conte', '2023-02-10 12:00:00',  '2000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000123', 'Caciano Gretto', '2023-02-11 13:00:00',  '3000');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 1', '000001', 'primeira categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 2', '000012', 'segunda categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 3', '000123', 'terceiro categoria');

INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto', 'Primeiro produto', 'https://images.pexels.com/photos/2529148/pexels-photo-2529148.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 237.94, 1000, '000001', 1);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 2', 'segundo produto', 'https://images.pexels.com/photos/8038334/pexels-photo-8038334.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 860.99, 300, '000012', 2);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 3', 'terceiro produto', 'https://images.pexels.com/photos/1566435/pexels-photo-1566435.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 523.87, 2500, '000123', 3);

INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000001', 'Alberto Franco', '2023-02-09 11:00:00', '1000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000012', 'Bernardo Conte', '2023-02-10 12:00:00',  '2000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000123', 'Caciano Gretto', '2023-02-11 13:00:00',  '3000');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 1', '000001', 'primeira categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 2', '000012', 'segunda categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 3', '000123', 'terceiro categoria');

INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto', 'Primeiro produto', 'https://images.pexels.com/photos/2529148/pexels-photo-2529148.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 237.94, 1000, '000001', 1);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 2', 'segundo produto', 'https://images.pexels.com/photos/8038334/pexels-photo-8038334.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 860.99, 300, '000012', 2);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 3', 'terceiro produto', 'https://images.pexels.com/photos/1566435/pexels-photo-1566435.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 523.87, 2500, '000123', 3);

INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000001', 'Alberto Franco', '2023-02-09 11:00:00', '1000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000012', 'Bernardo Conte', '2023-02-10 12:00:00',  '2000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000123', 'Caciano Gretto', '2023-02-11 13:00:00',  '3000');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 1', '000001', 'primeira categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 2', '000012', 'segunda categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 3', '000123', 'terceiro categoria');

INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto', 'Primeiro produto', 'https://images.pexels.com/photos/2529148/pexels-photo-2529148.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 237.94, 1000, '000001', 1);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 2', 'segundo produto', 'https://images.pexels.com/photos/8038334/pexels-photo-8038334.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 860.99, 300, '000012', 2);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 3', 'terceiro produto', 'https://images.pexels.com/photos/1566435/pexels-photo-1566435.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 523.87, 2500, '000123', 3);

INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000001', 'Alberto Franco', '2023-02-09 11:00:00', '1000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000012', 'Bernardo Conte', '2023-02-10 12:00:00',  '2000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000123', 'Caciano Gretto', '2023-02-11 13:00:00',  '3000');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 1', '000001', 'primeira categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 2', '000012', 'segunda categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 3', '000123', 'terceiro categoria');

INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto', 'Primeiro produto', 'https://images.pexels.com/photos/2529148/pexels-photo-2529148.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 237.94, 1000, '000001', 1);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 2', 'segundo produto', 'https://images.pexels.com/photos/8038334/pexels-photo-8038334.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 860.99, 300, '000012', 2);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 3', 'terceiro produto', 'https://images.pexels.com/photos/1566435/pexels-photo-1566435.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 523.87, 2500, '000123', 3);

INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000001', 'Alberto Franco', '2023-02-09 11:00:00', '1000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000012', 'Bernardo Conte', '2023-02-10 12:00:00',  '2000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000123', 'Caciano Gretto', '2023-02-11 13:00:00',  '3000');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 1', '000001', 'primeira categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 2', '000012', 'segunda categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 3', '000123', 'terceiro categoria');

INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto', 'Primeiro produto', 'https://images.pexels.com/photos/2529148/pexels-photo-2529148.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 237.94, 1000, '000001', 1);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 2', 'segundo produto', 'https://images.pexels.com/photos/8038334/pexels-photo-8038334.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 860.99, 300, '000012', 2);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 3', 'terceiro produto', 'https://images.pexels.com/photos/1566435/pexels-photo-1566435.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 523.87, 2500, '000123', 3);

INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000001', 'Alberto Franco', '2023-02-09 11:00:00', '1000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000012', 'Bernardo Conte', '2023-02-10 12:00:00',  '2000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000123', 'Caciano Gretto', '2023-02-11 13:00:00',  '3000');

INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 1', '000001', 'primeira categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 2', '000012', 'segunda categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 3', '000123', 'terceiro categoria');

INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto', 'Primeiro produto', 'https://images.pexels.com/photos/2529148/pexels-photo-2529148.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 237.94, 1000, '000001', 1);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 2', 'segundo produto', 'https://images.pexels.com/photos/8038334/pexels-photo-8038334.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 860.99, 300, '000012', 2);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 3', 'terceiro produto', 'https://images.pexels.com/photos/1566435/pexels-photo-1566435.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 523.87, 2500, '000123', 3);

INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000001', 'Alberto Franco', '2023-02-09 11:00:00', '1000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000012', 'Bernardo Conte', '2023-02-10 12:00:00',  '2000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000123', 'Caciano Gretto', '2023-02-11 13:00:00',  '3000');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 1', '000001', 'primeira categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 2', '000012', 'segunda categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 3', '000123', 'terceiro categoria');

INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto', 'Primeiro produto', 'https://images.pexels.com/photos/2529148/pexels-photo-2529148.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 237.94, 1000, '000001', 1);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 2', 'segundo produto', 'https://images.pexels.com/photos/8038334/pexels-photo-8038334.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 860.99, 300, '000012', 2);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 3', 'terceiro produto', 'https://images.pexels.com/photos/1566435/pexels-photo-1566435.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 523.87, 2500, '000123', 3);

INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000001', 'Alberto Franco', '2023-02-09 11:00:00', '1000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000012', 'Bernardo Conte', '2023-02-10 12:00:00',  '2000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000123', 'Caciano Gretto', '2023-02-11 13:00:00',  '3000');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 1', '000001', 'primeira categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 2', '000012', 'segunda categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 3', '000123', 'terceiro categoria');

INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto', 'Primeiro produto', 'https://images.pexels.com/photos/2529148/pexels-photo-2529148.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 237.94, 1000, '000001', 1);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 2', 'segundo produto', 'https://images.pexels.com/photos/8038334/pexels-photo-8038334.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 860.99, 300, '000012', 2);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 3', 'terceiro produto', 'https://images.pexels.com/photos/1566435/pexels-photo-1566435.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 523.87, 2500, '000123', 3);

INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000001', 'Alberto Franco', '2023-02-09 11:00:00', '1000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000012', 'Bernardo Conte', '2023-02-10 12:00:00',  '2000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000123', 'Caciano Gretto', '2023-02-11 13:00:00',  '3000');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 1', '000001', 'primeira categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 2', '000012', 'segunda categoria');
INSERT INTO CATEGORY(name, code, description) VALUES('Categoria 3', '000123', 'terceiro categoria');

INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto', 'Primeiro produto', 'https://images.pexels.com/photos/2529148/pexels-photo-2529148.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 237.94, 1000, '000001', 1);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 2', 'segundo produto', 'https://images.pexels.com/photos/8038334/pexels-photo-8038334.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 860.99, 300, '000012', 2);
INSERT INTO PRODUCT(name, description, image_url, price, storage, barcode, category_id) VALUES('Produto 3', 'terceiro produto', 'https://images.pexels.com/photos/1566435/pexels-photo-1566435.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1', 523.87, 2500, '000123', 3);

INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000001', 'Alberto Franco', '2023-02-09 11:00:00', '1000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000012', 'Bernardo Conte', '2023-02-10 12:00:00',  '2000');
INSERT INTO ORDERS(number, client, date, amount) VALUES ('000000123', 'Caciano Gretto', '2023-02-11 13:00:00',  '3000');


*/