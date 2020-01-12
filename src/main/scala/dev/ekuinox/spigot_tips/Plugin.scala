package dev.ekuinox.spigot_tips

import org.bukkit.plugin.java.JavaPlugin
import java.io.File

class Plugin extends JavaPlugin {
  val tipsManager = new TipsManager(new File(getDataFolder, "tips.yml"))

  override def onEnable(): Unit = {
    super.onEnable()
    getCommand("tips").setExecutor(new CommandExecutor(tipsManager))
  }
}
