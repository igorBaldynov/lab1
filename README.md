Технологии разработки программного обеспечения.
Лабораторная работа №1: создание микросервиса на Spring Boot с базой данных.
Студент группы MAC_2131, Балдынов Игорь Олегович.
Знакомство с проектированием многослойной архитектуры Web-API (веб-приложений, микро-сервисов).



Инструкция по сборке запуску приложения:

Клонирование из github, сборка и запуск проекта

1) Клонирование:
git clone -b master https://github.com/igorBaldynov/lab1/tree/master

2) Сборка в помощью maven:
cd lab1/
mvn clean install

3) Создание docker-контейнера:
docker build -t baldynov_app .

4) Запуск контейнера с приложением:
docker run -p 8081:8081 baldynov_app

5) Проверка:

5.1) С помощью curl (из консоли)
curl -P localhost:8081/user/create -d JSON;
curl -G localhost:8081/user/read/1;
curl -P localhost:8081/user/update JSON;
curl -P localhost:8081/user/delete/1;

5.2) C помощью postman (интерфейс)
