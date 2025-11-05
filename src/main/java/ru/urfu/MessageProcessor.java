package ru.urfu;

/**
 * Обработчик сообщений
 * Подходит для использования в любом боте
 * @author MihailSap
 */
public interface MessageProcessor {

    /**
     * Обработать сообщение
     */
    String processMessage(String messageFromUser);
}
