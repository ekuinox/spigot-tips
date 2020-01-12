package dev.ekuinox.spigot_tips

object TipsManager extends {
  private val tipsCollection = Map[String, Tips]()

  load()

  def create(newTips: Tips) = tipsCollection.updated(newTips.title, newTips)

  def get(title: String) = tipsCollection.get(title)

  def save(): Unit = {

  }

  def load(): Unit = {

  }

}
