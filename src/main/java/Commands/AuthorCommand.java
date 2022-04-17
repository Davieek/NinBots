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
public class AuthorCommand extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        var prefix = ConfigManager.prefix;
        if (event.getMessage().getContentRaw().equalsIgnoreCase(prefix + "author")) {
            var user = event.getAuthor();
            if (user.isBot()) {
                return;
            }


            var embed = new EmbedBuilder();
            embed.setColor(Color.MAGENTA);
            embed.setTitle("NinBots");
            embed.addField("Author:", "_Ninjak", false);
            embed.addField("BotVersion:", "1.0", false);
            embed.setThumbnail("https://media.discordapp.net/attachments/907141583156183140/963976304460447884/ninjakpfp.png?width=702&height=671");



            event.getChannel().sendMessage(embed.build()).queue();
        }
    }
}
