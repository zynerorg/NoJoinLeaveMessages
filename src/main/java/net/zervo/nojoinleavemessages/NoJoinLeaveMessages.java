package net.zervo.nojoinleavemessages;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NoJoinLeaveMessages extends JavaPlugin implements Listener {

    TextComponent nullText = Component.text(""); 

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("Join / Leave / Kick messages are now being muted :D");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.joinMessage(nullText);
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        event.quitMessage(nullText);
    }

    @EventHandler
    public void onPlayerKicked(PlayerKickEvent event) {
        event.leaveMessage(nullText);
    }
}