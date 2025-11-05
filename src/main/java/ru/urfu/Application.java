package ru.urfu;

/**
 * Класс для запуска приложения
 */
public class Application {

    public static void main(String[] args) {
        MessageProcessor messageProcessor = new MessageProcessorImpl();

        String telegramBotName = System.getenv("telegram_botName");
        String telegramToken = System.getenv("telegram_token");
        new TelegramBot(telegramBotName, telegramToken, messageProcessor)
                .start();

        String discordToken = System.getenv("discord_token");
        new DiscordBot(discordToken, messageProcessor)
                .start();

        /*
         тут может быть сколько угодно чат платформ
         и все должны работать одинаково
        */
    }

}
