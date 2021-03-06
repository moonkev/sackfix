package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegIssuerField(override val value: String) extends SfFieldString(617, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(617)LegIssuer=(").append(value).append(")")
}

object LegIssuerField {
  val TagId = 617  
  def decode(a: Option[Any]) : Option[LegIssuerField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegIssuerField]
  }

  def decode(a: Any) : Option[LegIssuerField] = a match {
    case v: String => Some(LegIssuerField(v))
    case v: LegIssuerField => Some(v)
    case _ => scala.Option.empty[LegIssuerField]
  } 
}
