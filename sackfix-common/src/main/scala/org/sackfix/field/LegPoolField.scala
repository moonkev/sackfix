package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegPoolField(override val value: String) extends SfFieldString(740, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(740)LegPool=(").append(value).append(")")
}

object LegPoolField {
  val TagId = 740  
  def decode(a: Option[Any]) : Option[LegPoolField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegPoolField]
  }

  def decode(a: Any) : Option[LegPoolField] = a match {
    case v: String => Some(LegPoolField(v))
    case v: LegPoolField => Some(v)
    case _ => scala.Option.empty[LegPoolField]
  } 
}