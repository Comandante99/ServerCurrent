package Bungee;

import net.md_5.bungee.api.plugin.Plugin;
import Event.ServerCurrent;

public class Main extends Plugin
{
	public void onEnable()
	  {
		   getProxy().getPluginManager().registerCommand(this, new ServerCurrent());
	  }
	  
		  
}
