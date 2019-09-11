package cn.me.stumbler

import scala.beans.BeanProperty
import scala.collection.mutable
import scala.text.DocGroup
import scala.util.Random
import scala.util.control.Breaks._
import scala.actors.Actor
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

/**
  * @Classname DemoScala
  * @Description TODO
  * @Date 2019/8/21 16:55
  * @Created by yuhousheng
  */
object DemoScala {
  def main(args: Array[String]): Unit = {
    /*MsgActor.start()
    val ab = new ArrayBuffer[Map[String,Int]]()
    val fileNames=Array("c:/users/31883/desktop/draft1.sql","c:/users/31883/desktop/draft2.sql","c:/users/31883/desktop/draft3.sql")
    for (fName <- fileNames ) {
      val resultFuture = MsgActor!!Msg(fName)
      val result = resultFuture.apply().asInstanceOf[Map[String,Int]]
      ab+=result
    }*/


//    ab.flatten.groupBy(_._1).mapValues(x => {x.reduce(x._2+x._2)}).foreach(println)
  }
}


case class Msg(fileName:String)
object MsgActor extends Actor {
  def act = {
    loop {
      react {
        case Msg(fileName) => {
          val content: String = Source.fromFile(fileName).mkString
          val wordCountMap: Map[String, Int] = content.split("\r\n").flatMap(_.split(" ")).groupBy(x => x).map(x => (x._1,x._2.length))
          sender ! wordCountMap
        }
      }
    }
  }
}