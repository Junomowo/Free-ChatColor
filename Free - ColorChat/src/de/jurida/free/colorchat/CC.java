package de.jurida.free.colorchat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.jurida.free.colorchat.config.Config;
import de.jurida.free.colorchat.config.StyleCSS;
import de.jurida.free.colorchat.listener.ChatListener;

public class CC extends JavaPlugin{
	
	@Override
	public void onEnable() {
		Config.createAndLoad();
		StyleCSS.intitStrings();
		Bukkit.getPluginManager().registerEvents(new ChatListener(), this);
	}

}
