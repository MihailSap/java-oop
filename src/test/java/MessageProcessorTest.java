import org.junit.jupiter.api.Test;
import ru.urfu.MessageProcessorI;
import ru.urfu.MessageProcessorImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тесты для реализации обработчика сообщений: {@link MessageProcessorImpl}
 * @author MihailSap
 */
public class MessageProcessorTest {

    /**
     * Обработчик сообщений
     */
    private final MessageProcessorI messageProcessor = new MessageProcessorImpl();

    /**
     * Тест на обработку правильного сообщения
     */
    @Test
    void defaultMessageTest(){
        String messageFromUser = "Привет!";
        String processedMessage = messageProcessor.processMessage(messageFromUser);
        String expectedMessage = "Ваше сообщение: 'Привет!'";
        assertEquals(expectedMessage, processedMessage);
    }

    /**
     * Тест на обработку пустого сообщения
     */
    @Test
    void emptyMessageTest(){
        String messageFromUser = "";
        String processedMessage = messageProcessor.processMessage(messageFromUser);
        String expectedMessage = "Ваше сообщение: ''";
        assertEquals(expectedMessage, processedMessage);
    }
}
