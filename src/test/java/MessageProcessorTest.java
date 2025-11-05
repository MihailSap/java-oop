import org.junit.jupiter.api.Test;
import ru.urfu.MessageProcessor;
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
    private final MessageProcessor messageProcessor = new MessageProcessorImpl();

    /**
     * Тест на обработку правильного сообщения
     */
    @Test
    void defaultMessageTest(){
        String processedMessage = messageProcessor.processMessage("Привет!");
        assertEquals("Ваше сообщение: 'Привет!'", processedMessage);
    }

    /**
     * Тест на обработку пустого сообщения
     */
    @Test
    void emptyMessageTest(){
        String processedMessage = messageProcessor.processMessage("");
        assertEquals("Ваше сообщение: ''", processedMessage);
    }
}
