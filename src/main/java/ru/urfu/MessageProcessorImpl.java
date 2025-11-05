package ru.urfu;

/**
 * Реализация обработчика сообщений
 * @author MihailSap
 */
public class MessageProcessorImpl implements MessageProcessor {

    @Override
    public String processMessage(String messageFromUser) {
        return String.format("Ваше сообщение: '%s'", messageFromUser);
    }
}
