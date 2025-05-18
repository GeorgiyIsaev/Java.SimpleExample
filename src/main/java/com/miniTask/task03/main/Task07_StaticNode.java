package com.miniTask.task03.main;

//| 7 | Nested vs. Inner | Перенесите Node из
// задачи 1 внутрь MiniList как private static class.
// В комментарии объясните, почему здесь
// нужен static, а не non-static inner. |
public class Task07_StaticNode {
    ///  НОДА static так MiniList не нуждается в доступе к экземпляру Node
    ///  Обратные ссылки на класс MiniList ну нужна,
    ///  так как занимает лишнюю память
}
