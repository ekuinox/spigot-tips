package dev.ekuinox.spigot_tips

import org.bukkit.command.{Command, CommandSender, CommandExecutor => BukkitCommandExecutor}

class CommandExecutor extends BukkitCommandExecutor {
  override def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {
    if (args == null) return true

    args(0) match {
      case "create" => create()
      case "show" => show()
      case "help" => help()
      case _ => help()
    }

    true
  }

  def create(): Unit = {

  }

  def show(): Unit = {

  }

  def help(): Unit = {

  }

}
