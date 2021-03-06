package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class MDStreamIDField(override val value: String) extends SfFieldString(1500, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1500)MDStreamID=(").append(value).append(")")
}

object MDStreamIDField {
  val TagId = 1500  
  def decode(a: Option[Any]) : Option[MDStreamIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDStreamIDField]
  }

  def decode(a: Any) : Option[MDStreamIDField] = a match {
    case v: String => Some(MDStreamIDField(v))
    case v: MDStreamIDField => Some(v)
    case _ => scala.Option.empty[MDStreamIDField]
  } 
}
