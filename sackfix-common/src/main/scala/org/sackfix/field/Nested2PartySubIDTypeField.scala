package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class Nested2PartySubIDTypeField(override val value: Int) extends SfFieldInt(807, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(807)Nested2PartySubIDType=(").append(value).append(")")
}

object Nested2PartySubIDTypeField {
  val TagId = 807  
  def apply(value: String) = try {
    new Nested2PartySubIDTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new Nested2PartySubIDType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[Nested2PartySubIDTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[Nested2PartySubIDTypeField]
  }

  def decode(a: Any) : Option[Nested2PartySubIDTypeField] = a match {
    case v: String => Some(Nested2PartySubIDTypeField(v))
    case v: Int => Some(Nested2PartySubIDTypeField(v))
    case v: Nested2PartySubIDTypeField => Some(v)
    case _ => scala.Option.empty[Nested2PartySubIDTypeField]
  } 
}
