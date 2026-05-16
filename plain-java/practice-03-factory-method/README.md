## Практика 03 — Factory Method

Задание: применить паттерн Factory Method для создания разных объектов.

В проекте используются:

- `Notification` — общий интерфейс уведомления;
- `EmailNotification` — уведомление по email;
- `SmsNotification` — уведомление по SMS;
- `PushNotification` — push-уведомление;
- `NotificationFactory` — фабрика для создания нужного типа уведомления;
- `Main` — демонстрация работы фабрики.