package net.d3add3d.d3mod.lib;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		
		config.load();
		
		Reference.PASSWORD_CONFIG = config.get("Authentication", "Pack Password", "null", "Do not touch unless you know what you are doing!").getString();
	}
}
