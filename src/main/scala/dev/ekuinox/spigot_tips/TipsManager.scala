package dev.ekuinox.spigot_tips

import scala.collection.mutable.{Map => MutableMap}

object TipsManager extends {
  private val tipsCollection = MutableMap[String, Tips]()

  def create(newTips: Tips) = {
    tipsCollection(newTips.title) = newTips
  }

  def get(title: String) = tipsCollection.get(title)

  def save(): Unit = {

  }

  def load(): Unit = {

  }

}
