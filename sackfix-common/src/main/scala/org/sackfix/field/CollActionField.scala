package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class CollActionField(override val value: Int) extends SfFieldInt(944, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(944)CollAction=(").append(value).append(")").append(CollActionField.fixDescriptionByValue.getOrElse(value,""))
}

object CollActionField {
  val TagId = 944 
  val Retain=0
  val Add=1
  val Remove=2
  lazy val fixDescriptionByValue = Map(0->"RETAIN",1->"ADD",
    2->"REMOVE")
 
  def apply(value: String) = try {
    new CollActionField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CollAction("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CollActionField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CollActionField]
  }

  def decode(a: Any) : Option[CollActionField] = a match {
    case v: String => Some(CollActionField(v))
    case v: Int => Some(CollActionField(v))
    case v: CollActionField => Some(v)
    case _ => scala.Option.empty[CollActionField]
  } 
}
