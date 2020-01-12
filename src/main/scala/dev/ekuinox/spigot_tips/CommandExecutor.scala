package dev.ekuinox.spigot_tips

import org.bukkit.command.{Command, CommandSender, CommandExecutor => BukkitCommandExecutor}

object CommandExecutor extends BukkitCommandExecutor {
  override def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {
    if (args == null) return true
    if (args.isEmpty) {
      help()
      return true
    }

    args(0) match {
      case "create" => create()
      case "show" => show()
      case "help" => help()
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
