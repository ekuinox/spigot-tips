package dev.ekuinox.spigot_tips

import org.bukkit.command.{Command, CommandSender, CommandExecutor => BukkitCommandExecutor}

object CommandExecutor extends BukkitCommandExecutor {
  val TIPS_ROUTE_PERMISSION = "tips"
  val CREATE_PERMISSION: String = TIPS_ROUTE_PERMISSION + ".create"
  val SHOW_PERMISSION: String = TIPS_ROUTE_PERMISSION + ".show"
  val HELP_PERMISSION: String = TIPS_ROUTE_PERMISSION + ".help"

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
