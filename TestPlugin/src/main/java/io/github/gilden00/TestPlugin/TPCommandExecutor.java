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
	 * @return true - Command syntax was correct.
	 * @return false - player receives a message explaining how to use the command.
	 */
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		//Basic
		if(cmd.getName().equalsIgnoreCase("basic")){
			return doBasic(sender, alias, args);
		}
		//Basic2
		else if(cmd.getName().equalsIgnoreCase("basic2")){
			return doBasic2(sender, alias, args);
		}
		return false;
	}
	
	/**
	 * This is a demo command.
	 * @param sender - What issued the command.
	 * @param alias - The alias of the command name.
	 * @param args - Returns false if args.length > 0
	 * @return True - Syntax was correct.
	 */
	public boolean doBasic(CommandSender sender, String alias, String[] args){
		if(args.length == 0){
			plugin.getLogger().info(sender+" issued basic using the alias "+alias+".");
			return true;
		}
		return false;
	}
	
	/**
	 * This is a demo command that can only be issued by a player.
	 * @param sender - What issued the command.
	 * @param alias - The alias of the command name.
	 * @param args - Returns false if args.length > 0
	 * @return True - Syntax was correct.
	 */
	public boolean doBasic2(CommandSender sender, String alias, String[] args){
		if(args.length == 0){
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
