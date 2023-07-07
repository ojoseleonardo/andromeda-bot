package me.andromedabot;

import me.andromedabot.security.Security;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class AndromedaBot {

    public static void main(String[] args) {
        Security security = new Security();
        JDA jda = JDABuilder.create(security.token,
                GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_PRESENCES).build();

    }


}
