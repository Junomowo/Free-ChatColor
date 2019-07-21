package de.jurida.free.colorchat.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.jurida.free.colorchat.config.StyleCSS;

public class ChatListener implements Listener{
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
		
		if(player.hasPermission(StyleCSS.getPermission())) {
			String msg = event.getMessage().replace("&", "§");
			event.setMessage(msg);
		} else {
			if(StyleCSS.getSendMessage().equals("true")) {
				player.sendMessage(StyleCSS.getMessage());
			}
		}
	}
}
