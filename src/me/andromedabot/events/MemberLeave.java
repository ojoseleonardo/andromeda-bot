package me.andromedabot.events;

import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;

import static me.andromedabot.main.AndromedaBot.jda;

public class MemberLeave extends ListenerAdapter {
    @Override
    public void onGuildMemberRemove(GuildMemberRemoveEvent event) {
        String userName = event.getUser().getName();
        String serverName = event.getGuild().getName();
        String leaveChannel = "registro-de-saída";
        List<TextChannel> channels = jda.getTextChannelsByName(leaveChannel, true);

        for (TextChannel ch : channels) {
            ch.sendMessage(userName + " deixou o " + serverName + "!").queue();
        }
    }
}
