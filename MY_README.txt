
1) сборка проекта в jar-файл
mvn clean install
(jar-файл генерируется и копируется в каталог target/)

2) проверка работы приложения из консоли
java -jar /target/QQQ.jar
после запуска  проверить работу приложения curl-лом или postman-ном)

3) проверка работы приложения в докере
docker build -t my_app .
docker run my_app 

4) работа с контейнером докера
docker ps //список запущенных контекнеров
docker stop container_id (container_id  берется из вывода docker ps)

после запуска проверить работу приложения curl-лом или postman-ном)

6) curl
//get-запрос:
curl -G localhost:8081/user/all
 

----
инструкция для препода
1) git clone https://github.com/igorBaldynov/lab1.git
2) mvn clean install
3) docker build -t my_app .
4) docker run ......
5) проверка
curl -P localhost:8081/user/create -d JSON
curl -G localhost:8081/user/read/1
curl -P localhost:8081/user/update JSON
curl -P localhost:8081/user/delete/1 




