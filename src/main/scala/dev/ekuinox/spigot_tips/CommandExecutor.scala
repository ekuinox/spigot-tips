package dev.ekuinox.spigot_tips

import org.bukkit.command.{Command, CommandSender, CommandExecutor => BukkitCommandExecutor}

object CommandExecutor extends BukkitCommandExecutor {
  override def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {
    if (args == null) return true
    if (args.isEmpty) {
      help(sender, args)
      return true
    }

    args(0) match {
      case "create" => create(sender, args)
      case "show" => show(sender, args)
      case "help" => help(sender, args)
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
