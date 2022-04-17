package Listeners;

import net.dv8tion.jda.api.entities.Emote;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * @author David (_Ninjak)
 * @project NinBots
 * @date 17.04.2022
 */
public class ReactionAddListener extends ListenerAdapter {


    @Override
    public void onGuildMessageReactionAdd(GuildMessageReactionAddEvent event) {
        if (event.getChannel() != event.getGuild().getTextChannelById("965329640052887582")) {
            return;
        }

        if (event.getMessageId().equalsIgnoreCase("965330460546854962")) {
            if (event.getReactionEmote().getName().equalsIgnoreCase("❌")) {
                var role = event.getGuild().getRoleById("964202766442565723");
                var role2 = event.getGuild().getRoleById("964202033257250826");

                event.getGuild().removeRoleFromMember(event.getUserId(), role).queue();
                event.getGuild().removeRoleFromMember(event.getUserId(), role2).queue();

                event.getReaction().removeReaction(event.getUser()).queue();
            }else
            if (event.getReactionEmote().getId().equalsIgnoreCase("965100427874025502")) {

                if (event.getGuild().getMemberById(event.getUserId()).getRoles().contains(event.getGuild().getRoleById("964202766442565723"))) {
                    event.getReaction().removeReaction(event.getUser()).queue();
                    return;
                }

                var role = event.getGuild().getRoleById("964202033257250826");
                event.getGuild().addRoleToMember(event.getUserId(),role).queue();
                event.getReaction().removeReaction(event.getUser()).queue();
            }else
            if (event.getReactionEmote().getId().equalsIgnoreCase("965100468076412949")) {

                if (event.getGuild().getMemberById(event.getUserId()).getRoles().contains(event.getGuild().getRoleById("964202033257250826"))) {
                    event.getReaction().removeReaction(event.getUser()).queue();
                    return;
                }

                var role = event.getGuild().getRoleById("964202766442565723");
                event.getGuild().addRoleToMember(event.getUserId(),role).queue();
                event.getReaction().removeReaction(event.getUser()).queue();
            } else {
                return;
            }

        }

    }
}
