CREATE DATABASE "TrafficLights"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Russian_Russia.1251'
    LC_CTYPE = 'Russian_Russia.1251'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;


CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE questions (
    id SERIAL PRIMARY KEY,
    text VARCHAR(255)
);

CREATE TABLE answers (
    id SERIAL PRIMARY KEY,
    question_id INTEGER REFERENCES questions(id),
    text VARCHAR(255),
    is_correct BOOLEAN
);

CREATE TABLE results (
    user_id INTEGER REFERENCES users(id),
    question_id INTEGER REFERENCES questions(id),
    answer_id INTEGER REFERENCES answers(id),
    PRIMARY KEY (user_id, question_id)
);

INSERT INTO questions (text)
VALUES
	('Какой цвет светофора обозначает команду «Движение разрешено»?'),
	('Какой цвет светофора обозначает команду «Приготовиться к движению»?'),
	('Какой цвет светофора обозначает команду «Движение запрещено»?');

INSERT INTO answers (question_id, text, is_correct)
VALUES
	(1, 'Красный', false),
	(1, 'Зеленый', true),
	(1, 'Жёлтый', false),
	(2, 'Красный', false),
	(2, 'Зеленый', false),
	(2, 'Жёлтый', true),
	(3, 'Красный', true),
	(3, 'Зеленый', false),
	(3, 'Жёлтый', false);

INSERT INTO users (id, name)
VALUES
	(1, 'Иван');

INSERT INTO results (user_id, question_id, answer_id)
VALUES
	(1, 1, 2),
	(1, 2, 3),
	(1, 3, 1);

SELECT * FROM answers;
SELECT * FROM questions;
SELECT * FROM results;
SELECT * FROM users;

SELECT q.text AS question_text, a.text AS answer_text, a.is_correct
FROM questions q
JOIN answers a
ON q.id = a.question_id;

SELECT q.text AS question, a.text AS answer, a.is_correct, r.user_id, r.question_id
FROM questions q
JOIN answers a ON q.id = a.question_id
LEFT JOIN results r ON a.id = r.answer_id;