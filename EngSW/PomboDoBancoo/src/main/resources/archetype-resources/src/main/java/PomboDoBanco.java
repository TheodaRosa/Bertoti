package $org.example;

/**
 * Hello world!
 *
 */
import et.telebof.BotClient;

public class PomboDoBanco {
    static final String TOKEN = "7283238480:AAFedZpahfkUXXZUrtxBzzEGByrLA6Kq-pw";

    public static void main(String[] args) {
        final BotClient bot = new BotClient(TOKEN);

        // Listening for /start command
        bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
            context.reply("Welcome!").exec();
        });

        // Listening for any text
        bot.onMessage(filter -> filter.text(), (context, message) -> {
            context.reply(message.text).exec();
        });

        bot.run(); // finally run the bot
    }
}
