##  Мини‑задачи к блоку «Продвинутая логика» (этап 2)

| № | Тема | Задание | 
| --- | --- | --- | 
| 1 | Интерфейсы 2.0 | Сделайте интерфейс Printer с print(String). Добавьте default void println(String s){ print(s+"\n"); }. Реализуйте в классе ConsolePrinter. | 
| 2 | Статические фабрики | Создайте class ShapeFactory с static Figure ofSquare(double side) и ofRectangle(w,h). Запретите new ShapeFactory() через private конструктор. | 
| 3 | Неизменяемые коллекции | Метод unmodifiableGrades(Map<String,Integer>) возвращает read‑only карту. Проверьте, что put() бросает исключение. | 
| 4 | LinkedList vs ArrayList | Измерьте (System.nanoTime) время вставки 10 000 элементов в начало ArrayList и LinkedList, выведите результаты. | 
| 5 | equals / hashCode | Переопределите эти методы в Task(id,name), чтобы new Task(1,"a").equals(new Task(1,"b")) было true. Покройте тестом. | 
| 6 | Checked vs Unchecked | Напишите метод FileUtils.readText(Path p) – он бросает IOException (checked). Вызовите его из main, отловите и выведите сообщение. | 
| 7 | enum + switch | Расширьте enum TaskStatus значением BLOCKED. Метод canStart(TaskStatus) возвращает true только для NEW. Используйте switch. | 
| 8 | JUnit 5 — параметризованный тест | Протестируйте canStart() из п.7 на всех значениях TaskStatus с @CsvSource. | 
| 9 | Interface Segregation | Интерфейс SmartPrinter разделите на Printable (только print) и Scannable (scan). Класс SimplePrinter реализует только Printable. | 
| 10 | Dependency Injection (лайт) | Класс OrderService принимает в конструкторе PaymentGateway gateway. В main создайте OrderService и передайте туда new PaypalGateway(). | 
