import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Main {
    public static void main(String[] args) throws org.telegram.telegrambots.meta.exceptions.TelegramApiException {
        // Instantiate Telegram API
        TelegramBotsLongPollingApplication botsApplication = new TelegramBotsLongPollingApplication();

        // Register our bot
        String botToken = "7283238480:AAFedZpahfkUXXZUrtxBzzEGByrLA6Kq-pw";
        botsApplication.registerBot(botToken, new PomboDoBanco());

        System.out.println("PomboDoBanco successfully started!");
    }
}