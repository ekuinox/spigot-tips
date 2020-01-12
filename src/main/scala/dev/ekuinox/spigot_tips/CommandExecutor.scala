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

  def create(sender: CommandSender, args: Array[String]): Unit = {
    if (!sender.hasPermission(CREATE_PERMISSION)) return
    if (args.length < 3) return

    val newTips = Tips(args(1), args(2))

    TipsManager.create(newTips)

    sender.sendMessage(s"${newTips.title}に${newTips.body}を登録しました")

  }

  def show(sender: CommandSender, args: Array[String]): Unit = {
    if (!sender.hasPermission(SHOW_PERMISSION)) return
    if (args.length < 2) return

    val message = TipsManager.get(args(1)) match {
      case Some(tips) => s"${tips.body}"
      case None => s"${args(1)}に対応するTipsが見つかりませんでした"
    }

    sender.sendMessage(message)

  }

  def help(sender: CommandSender, args: Array[String]): Unit = {

  }

}
