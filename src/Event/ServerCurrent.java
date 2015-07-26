package Event;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class ServerCurrent extends Command
{

	public ServerCurrent()
	{
	    super("current");
	}


	@SuppressWarnings("deprecation")
	public void execute(CommandSender sender, String[] args)
	{
		if ((sender instanceof ProxiedPlayer))
	  {
		ProxiedPlayer player = (ProxiedPlayer)sender;
	    player.sendMessage(new TextComponent("§9Portal> §7You are currently on server: §6" + player.getServer().getInfo().getName()));
	  }
	  else
	  {
	    sender.sendMessage(ChatColor.RED + "This command can only be run by a player, you are a console.");
	  }
	}
}
