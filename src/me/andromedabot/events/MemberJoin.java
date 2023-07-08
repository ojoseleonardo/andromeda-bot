package me.andromedabot.events;

import me.andromedabot.main.AndromedaBot;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static me.andromedabot.main.AndromedaBot.jda;

public class MemberJoin extends ListenerAdapter {
    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {
        String userName = event.getUser().getName();
        String serverName = event.getGuild().getName();
        String joinChannel = "bem-vindo";
        List<TextChannel> channels = jda.getTextChannelsByName(joinChannel, true);

        for (TextChannel ch : channels) {
            ch.sendMessage(userName + " entrou no " + serverName + "!").queue();
        }


    }
}
