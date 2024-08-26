import et.telebof.BotClient;

public class Chococatbot {
    static final String TOKEN = "7283238480:AAFedZpahfkUXXZUrtxBzzEGByrLA6Kq-pw";

    public static void main(String[] args) {
        final BotClient bot = new BotClient(TOKEN);

        // Listening for /start command
        bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
            context.reply("Olá!").exec();
        });
        // Listening for /start command
        bot.onMessage(filter -> filter.commands("hw"), (context, message) -> {
            context.reply("Hello World!").exec();
        });
        bot.onMessage(filter -> filter.commands("books"), (context, message) -> {
            
        });

        // Listening for any text
        bot.onMessage(filter -> filter.text(), (context, message) -> {
            context.reply(message.text).exec();
        });

        bot.run(); // finally run the bot
    }
}