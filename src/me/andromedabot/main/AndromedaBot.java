package me.andromedabot.main;

import me.andromedabot.events.MemberJoin;
import me.andromedabot.commands.Ping;
import me.andromedabot.events.MemberLeave;
import me.andromedabot.security.Security;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.EnumSet;

public class AndromedaBot {

    public static JDA jda;

    public static void main(String[] args) throws InterruptedException {
        Security security = new Security();
        jda = JDABuilder.create(security.token, EnumSet.allOf(GatewayIntent.class)).build();

        // A única coisa que você precisa fazer é instanciar o JDA, chamar awaitReady(), da instância você pode obter todos os canais (MessageChannels, TextChannels, VoiceChannels, seja chamando
        //get[Text]Channels()
        //get[Text]ChannelById(id=..)
        //get[Text]ChannelsByName(name, ignore case))
        jda.awaitReady();

        //commands
        jda.addEventListener(new Ping());

        //events
        jda.addEventListener(new MemberJoin());
        jda.addEventListener(new MemberLeave());


    }


}
