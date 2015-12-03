package io.github.gilden00.TestPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin{
	@Override
	public void onEnable(){
		getLogger().info("Hey, is this thing on?");
		
		// This will throw a NullPointerException if you don't have the command defined in your plugin.yml file!
		this.getCommand("basic").setExecutor(new TPCommandExecutor(this));
		this.getCommand("basic2").setExecutor(new TPCommandExecutor(this));
	}
	
	public void onDisable(){
		getLogger().info("So long, farewell, auf wiedersehen, goodnight!");
	}
}
