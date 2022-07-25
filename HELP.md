# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.2/maven-plugin/reference/html/#build-image)

CREATE TABLE Book (
id int NOT NULL,
author varchar(255),
publication_date datetime,
publisher varchar(255),
title varchar(255),
count int,
PRIMARY KEY (id)
);

INSERT INTO Book (id, author, publication_date, publisher, title, count)
VALUES (1, 'ankita', '2021-11-11', 'Penguin Random House', 'Learn SQL', 10);

INSERT INTO Book (id, author, publication_date, publisher, title, count)
VALUES (2, 'ankita1', '2021-11-11', 'Penguin Random House', 'Learn SQL', 20);

INSERT INTO Book (id, author, publication_date, publisher, title, count)
VALUES (3, 'ankita2', '2021-11-11', 'Penguin Random House', 'Learn SQL', 30);

INSERT INTO Book (id, author, publication_date, publisher, title, count)
VALUES (4, 'ankita3', '2021-11-11', 'Penguin Random House', 'Learn SQL', 40);

INSERT INTO Book (id, author, publication_date, publisher, title, count)
VALUES (5, 'ankita4', '2021-11-11', 'Penguin Random House', 'Learn SQL', 50);

SELECT author, count, publication_date, publisher, title
FROM Book
ORDER BY count DESC LIMIT 4;