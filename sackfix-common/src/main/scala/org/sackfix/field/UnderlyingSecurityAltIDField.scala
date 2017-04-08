package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingSecurityAltIDField(override val value: String) extends SfFieldString(458, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(458)UnderlyingSecurityAltID=(").append(value).append(")")
}

object UnderlyingSecurityAltIDField {
  val TagId = 458  
  def decode(a: Option[Any]) : Option[UnderlyingSecurityAltIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingSecurityAltIDField]
  }

  def decode(a: Any) : Option[UnderlyingSecurityAltIDField] = a match {
    case v: String => Some(UnderlyingSecurityAltIDField(v))
    case v: UnderlyingSecurityAltIDField => Some(v)
    case _ => scala.Option.empty[UnderlyingSecurityAltIDField]
  } 
}