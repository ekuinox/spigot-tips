package dev.ekuinox.spigot_tips

import org.bukkit.configuration.file.YamlConfiguration
import java.io.File

class TipsManager(configFile: File) {
  private val config = YamlConfiguration.loadConfiguration(configFile)

  def create(newTips: Tips) = {
    config.set(newTips.title, newTips.body)
    save()
  }

  def get(title: String): Option[Tips] = {
    config.getString(title) match {
      case null => None
      case body: String => Some(Tips(title, body))
    }
  }

  def save() = config.save(configFile)
}
