package dev.ekuinox.spigot_tips

import org.bukkit.plugin.java.JavaPlugin

class Plugin extends JavaPlugin {
  override def onEnable(): Unit = {
    super.onEnable()
    getCommand("tips").setExecutor(CommandExecutor)
  }
}
