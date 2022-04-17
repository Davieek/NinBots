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
public class HelpCommand extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        var prefix = ConfigManager.prefix;
        if (event.getMessage().getContentRaw().equalsIgnoreCase(prefix + "help") |
         event.getMessage().getContentRaw().equalsIgnoreCase(prefix + "pomoc")
        ) {
            var user = event.getAuthor();
            if (user.isBot()) {
                return;
            }

            var embed = new EmbedBuilder();
            embed.setColor(Color.MAGENTA);
            embed.setTitle("NinBots");
            embed.addField("Komendy:", String.format("""
                    **%skiss <@użytkownik>** -> Całujesz oznaczonego użytkownika.
                    **%skill <@użytkownik>** -> Zabijasz oznaczonego użytkownika.
                    **%sprzytul <@użytkownik>** -> Przytulasz oznaczonego użytkownika.
                    **%sprzywitaj <@użytkownik>** -> Przywitaj oznaczonego użytkownika.
                    **%spropozycja <propozycja>** -> Wysyłasz propozycje.
                    **%szglos <@użytkownik> <powód>** -> Zgłaszasz oznaczonego użytkownika.
                    **%sinfo <@użytkownik>** -> Pokazuje informacje na temat oznaczonego użytkownika.
                    **%sauthor** -> Pokazuje informacje na temat bota.
                    **%sban <@użytkownik> <powód>** -> Banuje oznaczonego użytkownika na serwerze.
                    **%skick <@użytkownik> <powód>** -> Kickujesz oznaczonego użytkownika z serwera.
                    **%sogl <wiadomosc>** -> Wysyłasz ogłoszenie.
                    **%sclear <1-100>** -> czyści wiadomości.
                    **%sclear <@użytkownik>** -> Usuwa wiadomości od danego użytkownika
                    
                    """,
                            prefix,
                            prefix,
                            prefix,
                            prefix,
                            prefix,
                            prefix,
                            prefix,
                            prefix,
                            prefix,
                            prefix,
                            prefix,
                            prefix,
                            prefix

                    ),
                    false);


            embed.setFooter("NinBots </>", "https://media.discordapp.net/attachments/904628525947043891/963728900804968468/Bez_nazwy-1.png");
            embed.setThumbnail("https://media.discordapp.net/attachments/904628525947043891/963728900804968468/Bez_nazwy-1.png");


            event.getChannel().sendMessage(embed.build()).queue();
        }
    }
}
