package com.punzia.chatplugin;

//import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public final class ChatPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Bee is lovely! <3");

        //getServer().getPluginManager().registerEvents((listener:this), (plugin:this) );
        getServer().getPluginManager().registerEvents(this,  this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        //System.out.println("A player has joined the server!");
        event.setJoinMessage(ChatColor.YELLOW + "Hiii, remember to hug Bee! <3");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin quit!");
    }
}
