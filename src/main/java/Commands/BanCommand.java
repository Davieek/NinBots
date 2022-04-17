package Commands;

import Manager.ConfigManager;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

/**
 * @author David (_Ninjak)
 * @project NinBots
 * @date 14.04.2022
 */
public class BanCommand extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {


        var prefix = ConfigManager.prefix;
        if (event.getMessage().getContentRaw().equalsIgnoreCase(prefix + "1")) {
            var user = event.getAuthor();
            if (user.isBot()) {
                return;
            }

            var embed = new EmbedBuilder();
            embed.setColor(Color.MAGENTA);
            embed.setTitle("NinBots");
            embed.addField("""
                    Heej, Ninyaaq właśnie wrzucił nowy film!
                    """, "", false);
            embed.setFooter("NinBots </>", "https://media.discordapp.net/attachments/904628525947043891/963728900804968468/Bez_nazwy-1.png");

            event.getGuild().getTextChannelById("941859566465986562").sendMessage("""
                    Heej @here, Ninyaaq właśnie wrzucił nowy film!
                    https://youtu.be/kFLDIuZJwaM
                    """).queue();
        }
    }
}
