package io.github.gilden00.TestPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TPCommandExecutor implements CommandExecutor{
	
	TestPlugin plugin;
	
	public TPCommandExecutor(TestPlugin plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}

	/**
	 * called by bukkit when the player types "/". Must be registered in plugin.yml
	 * @return true - nothing happens
	 * @return false - player receives a message explaining how to use the command.
	 */
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		if(cmd.getName().equalsIgnoreCase("basic")){
			plugin.getLogger().info(sender+" issued basic using the alias "+alias+".");
			return true;
		}else if(cmd.getName().equalsIgnoreCase("basic2")){
			if(!(sender instanceof Player)){
				sender.sendMessage("This command can only be issued by a player.");
			}else{
				plugin.getLogger().info(sender+" issued basic2 using the alias "+alias+".");
			}
			return true;
		}
		return false;
	}

}
