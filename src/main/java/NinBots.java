
import Commands.AuthorCommand;
import Commands.BanCommand;
import Commands.HelpCommand;
import Commands.KickCommand;
import Listeners.ReactionAddListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author _Ninjak
 * @project NinBots
 * @date 12.04.2022
 */

public class NinBots extends ListenerAdapter {
    public NinBots() {

    }

    public static String prefix = "n?";




    public static void main(String[] args) throws Exception {




        JDA jda = JDABuilder.createDefault("OTA0NTkzMzEwNjgzOTE4MzQ2.YX9yKw.7nLUWTZtfUmY6spLXL8q0z-kZ1E").build();
        jda.getPresence().setActivity(Activity.playing("🔥 | Heej jestem w trakcie tworzenie wróć później."));

        jda.addEventListener(new HelpCommand());
        jda.addEventListener(new AuthorCommand());
        jda.addEventListener(new BanCommand());
        jda.addEventListener(new KickCommand());
        jda.addEventListener(new ReactionAddListener());

    }
}
