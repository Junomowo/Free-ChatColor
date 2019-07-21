package de.jurida.free.colorchat.config;

public class StyleCSS {
	
	static String Prefix;
	static String Permission;
	static String sendMessage;
	static String Message;
	
	public static String getPrefix() {
		return Prefix;
	}
	
	public static String getPermission() {
		return Permission;
	}
	
	public static String getSendMessage() {
		return sendMessage;
	}
	
	public static String getMessage() {
		return Message;
	}
	
	public static void intitStrings() {
		Prefix = Config.getCfg().getString("Prefix");
		Permission = Config.getCfg().getString("Permission");
		sendMessage = Config.getCfg().getString("Message.InfoMessage");
		Message = Config.getCfg().getString("Message.Message");
	}

}
