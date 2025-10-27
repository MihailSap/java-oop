package ru.urfu;

/**
 * Обработчик сообщений
 * Интерфейс предоставляет метод для обработки сообщения
 * Подходит для использования в любом боте
 * @author MihailSap
 */
public interface MessageProcessorI {

    /**
     * Обработать сообщение
     * @param messageFromUser сообщение, полученное от пользователя
     * @return сообщение, обработанное нужным образом
     */
    String processMessage(String messageFromUser);
}
