package dev.ekuinox.spigot_tips

import org.bukkit.plugin.java.JavaPlugin
import java.io.File

class Plugin extends JavaPlugin {
  override def onEnable(): Unit = {
    super.onEnable()
    getCommand("tips").setExecutor(CommandExecutor)
  }
}

object Plugin {
  val tipsFile = new File("")
}
