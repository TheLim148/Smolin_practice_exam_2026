# Экзамен по РПМ 2026

Репозиторий содержит решения практических заданий по Java и Spring Boot.

Проект разделён на две основные части:

- `plain-java` — обычные Java-практики без Spring Boot;
- `spring-boot` — практики на Spring Boot с Maven, REST API, JPA, Security, Thymeleaf и Swagger UI.

## Список заданий

1. Создать простой Java-класс с методами для вычислений и демонстрацией инкапсуляции.
2. Реализовать паттерн Singleton для логирования сообщений.
3. Применить паттерн Factory Method для создания разных объектов.
4. Создать List и Map, добавить несколько элементов и вывести их на экран.
5. Обработать исключения с try-catch и создать собственное простое исключение.
6. Прочитать и записать текстовый файл с BufferedReader / BufferedWriter.
7. Создать поток через Thread и Runnable, вывести сообщение из потока.
8. Написать REST-контроллер с методом GET, возвращающим список объектов.
9. Настроить `@Autowired` для внедрения сервиса в контроллер Spring Boot.
10. Создать сущность и репозиторий JPA, добавить и вывести несколько записей в БД.
11. Написать unit-тест для метода сложения чисел в классе.
12. Сериализовать объект в JSON и десериализовать обратно.
13. Настроить Spring Security для ограничения доступа к одному endpoint.
14. Создать асинхронный метод с `@Async`, выводящий сообщение через 2 секунды.
15. Настроить `@Scheduled` для вывода сообщения каждые 5 секунд.
16. Использовать `application.properties` для настройки порта и имени приложения.
17. Применить Strategy: создать интерфейс и 2 реализации с разными способами обработки данных.
18. Создать простой MVC-контроллер с моделью и представлением через Thymeleaf.
19. Создать Observer-паттерн: один объект уведомляет другой об изменении состояния.
20. Настроить Swagger UI для REST API и проверить отображение документации.

## Структура репозитория

```text
.
├── README.md
├── LICENSE
├── .gitignore
├── plain-java/
│   ├── README.md
│   ├── practice-01-encapsulation/
│   ├── practice-02-singleton-logger/
│   ├── practice-03-factory-method/
│   ├── practice-04-list-map/
│   ├── practice-05-exceptions/
│   ├── practice-06-buffered-reader-writer/
│   ├── practice-07-thread-runnable/
│   ├── practice-11-unit-test/
│   ├── practice-12-json-serialization/
│   ├── practice-17-strategy/
│   └── practice-19-observer/
└── spring-boot/
    ├── practice-08-rest-controller/
    ├── practice-09-autowired-service/
    ├── practice-10-jpa-entity-repository/
    ├── practice-13-spring-security/
    ├── practice-14-async/
    ├── practice-15-scheduled/
    ├── practice-16-application-properties/
    ├── practice-18-mvc-thymeleaf/
    └── practice-20-swagger-ui/
```

## Требования

Для запуска всех практик нужны:

- JDK 21 или новее;
- Maven;
- Bash.

Проверка установленных версий:

```bash
java -version
javac -version
mvn -version
```


## Запуск Maven-практик в plain-java

Практики 11 и 12 используют Maven, потому что там есть внешние зависимости:

- практика 11 использует JUnit;
- практика 12 использует Jackson.

Практика 11:

```bash
cd plain-java/practice-11-unit-test
mvn test
```

Практика 12:

```bash
cd plain-java/practice-12-json-serialization
mvn compile exec:java -Dexec.mainClass="ru.example.practice12.Main"
```

## Запуск Spring Boot практик

Spring Boot-практики запускаются через Maven:

```bash
cd spring-boot/practice-08-rest-controller
mvn spring-boot:run
```

После запуска приложение обычно доступно по адресу:

```text
http://localhost:8080
```

Остановить приложение можно сочетанием клавиш:

```text
Ctrl+C
```

## Проверка Spring Boot практик

Примеры проверки через `curl`:

```bash
curl http://localhost:8080/products
curl http://localhost:8080/message
curl http://localhost:8080/config
```

Для Swagger UI:

```text
http://localhost:8080/swagger-ui/index.html
```

Для H2 Console в практике 10:

```text
http://localhost:8080/h2-console
```

Параметры подключения к H2:

```text
JDBC URL: jdbc:h2:mem:practice10
User Name: sa
Password:
```

Пароль оставляется пустым.