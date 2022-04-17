package Commands;

import Manager.ConfigManager;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

/**
 * @author David (_Ninjak)
 * @project NinBots
 * @date 17.04.2022
 */
public class KickCommand extends ListenerAdapter {
    private static String girl = ":dziewczyna:965100427874025502";
    private static String boy = ":chlopak:965100468076412949";
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        var prefix = ConfigManager.prefix;
        if (event.getMessage().getContentRaw().equalsIgnoreCase(prefix + "2")) {
            var user = event.getAuthor();
            if (user.isBot()) {
                return;
            }

            var embed4 = new EmbedBuilder();
            embed4.setColor(Color.MAGENTA);
            embed4.setImage("https://media.discordapp.net/attachments/963928990031183964/965109889955418153/update.png");
            embed4.setFooter("NinBots </>", "https://media.discordapp.net/attachments/904628525947043891/963728900804968468/Bez_nazwy-1.png");

            var embed5 = new EmbedBuilder();
            embed5.setColor(Color.MAGENTA);
            embed5.addField(event.getGuild().getName(), """
                    Hej, na dole znajdziesz rangi, które możesz aktualnie zdobyć.
                    Wystarczy, że będziesz klikać w emoji, a ranga zostanie dodana.
                    
                    """, false);
            embed5.setFooter("NinBots </>", "https://media.discordapp.net/attachments/904628525947043891/963728900804968468/Bez_nazwy-1.png");

            var embed = new EmbedBuilder();
            embed.setColor(Color.MAGENTA);
            embed.addField(event.getGuild().getName(), """
                    **Jakiej jesteś płci?**
                    <:dziewczyna:965100427874025502> -> <@&964202033257250826>
                    <:chlopak:965100468076412949> ->  <@&964202766442565723>
                    
                    """, false);
            embed.setFooter("NinBots </> | ❌ -> czyści wiek", "https://media.discordapp.net/attachments/904628525947043891/963728900804968468/Bez_nazwy-1.png");

            var embed2 = new EmbedBuilder();
            embed2.setColor(Color.MAGENTA);
            embed2.addField(event.getGuild().getName(), """
                    **Ile masz lat?**
                    1️⃣ -> <@&964203890948075622>
                    2️⃣ -> <@&964205671723728946>
                    3️⃣ -> <@&964205957355806790>
                    
                    """, false);
            embed2.setFooter("NinBots </> | ❌ -> czyści wiek", "https://media.discordapp.net/attachments/904628525947043891/963728900804968468/Bez_nazwy-1.png");

            var embed3 = new EmbedBuilder();
            embed3.setColor(Color.MAGENTA);
            embed3.addField(event.getGuild().getName(), """
                    **Role 4FUN.**
                    1️⃣ -> <@&963922420396355594>
                    2️⃣ -> <@&964204200517042176>
                    3️⃣ -> <@&964203855594262569>
                    4️⃣ -> <@&964201295634387024>
                    
                    """, false);
            embed3.setFooter("NinBots </> | ❌ -> czyści wiek", "https://media.discordapp.net/attachments/904628525947043891/963728900804968468/Bez_nazwy-1.png");

            event.getChannel().sendMessage(embed4.build()).queue();
            event.getChannel().sendMessage(embed5.build()).queue();
            event.getChannel().sendMessage(embed.build()).queue(message -> {
                message.addReaction(girl).queue();
                message.addReaction(boy).queue();
                message.addReaction("❌").queue();
            });
            event.getChannel().sendMessage(embed2.build()).queue(message -> {
                message.addReaction("1️⃣").queue();
                message.addReaction("2️⃣").queue();
                message.addReaction("3️⃣").queue();
                message.addReaction("❌").queue();
            });
            event.getChannel().sendMessage(embed3.build()).queue(message -> {
                message.addReaction("1️⃣").queue();
                message.addReaction("2️⃣").queue();
                message.addReaction("3️⃣").queue();
                message.addReaction("4️⃣").queue();
                message.addReaction("❌").queue();
            });
        }
    }
}
