package io.github.gilden00.TestPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin{
	@Override
	public void onEnable(){
		getLogger().info("Hey, is this thing on?");
	}
	
	public void onDisable(){
		getLogger().info("So long, farewell, auf wiedersehen, goodnight!");
	}
	
	/**
	 * called by bukkit when the player types "/". Must be registered in plugin.yml
	 * @return true - nothing happens
	 * @return false - player receives a message explaining how to use the command.
	 */
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[]args){
		if(cmd.getName().equalsIgnoreCase("basic")){
			getLogger().info(sender+" issued basic using the alias "+label+".");
			return true;
		}
		return false;
	}
}
