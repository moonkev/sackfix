package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingSettlMethodField(override val value: String) extends SfFieldString(1039, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1039)UnderlyingSettlMethod=(").append(value).append(")")
}

object UnderlyingSettlMethodField {
  val TagId = 1039  
  def decode(a: Option[Any]) : Option[UnderlyingSettlMethodField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingSettlMethodField]
  }

  def decode(a: Any) : Option[UnderlyingSettlMethodField] = a match {
    case v: String => Some(UnderlyingSettlMethodField(v))
    case v: UnderlyingSettlMethodField => Some(v)
    case _ => scala.Option.empty[UnderlyingSettlMethodField]
  } 
}