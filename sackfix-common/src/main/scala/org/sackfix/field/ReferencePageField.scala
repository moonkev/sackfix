package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class ReferencePageField(override val value: String) extends SfFieldString(1448, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1448)ReferencePage=(").append(value).append(")")
}

object ReferencePageField {
  val TagId = 1448  
  def decode(a: Option[Any]) : Option[ReferencePageField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ReferencePageField]
  }

  def decode(a: Any) : Option[ReferencePageField] = a match {
    case v: String => Some(ReferencePageField(v))
    case v: ReferencePageField => Some(v)
    case _ => scala.Option.empty[ReferencePageField]
  } 
}