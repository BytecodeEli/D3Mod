package net.d3add3d.d3mod.lib;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		
		config.load();
		
		Reference.PASSWORD_CONFIG = config.get("Authentication", "Pack Password", "null", "Do not touch unless you know what you are doing!").getString();
		Reference.DEBUG = config.get("Debug", "Debug mode", 0, "Only for testing pruposes ;)").getInt();
		Reference.HONORTHECAT = config.get("Misc", "Honor Columbus(my cat)", 1).getInt();
		
		config.save();
	}
}
