package de.jurida.free.colorchat.config;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Config {

	static File file = new File("plugins//Colorchat//config.yml");
	static FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
	public static FileConfiguration getCfg() {
		return cfg;
	}
	
	public static void save() {
		try {
			cfg.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void createAndLoad() {
		if(file.exists()) {
			try {
				cfg.load(file);
			} catch (IOException | InvalidConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cfg.set("Prefix", "§5JunoChat §8| ");
			cfg.set("Permission", "chat.use");
			cfg.set("Message.InfoMessage", "true");
			cfg.set("Message.Message", "§cDu kannst nicht fabig schreiben!");
			save();
		}
	}
	
}
