package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class ResponseDestinationField(override val value: String) extends SfFieldString(726, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(726)ResponseDestination=(").append(value).append(")")
}

object ResponseDestinationField {
  val TagId = 726  
  def decode(a: Option[Any]) : Option[ResponseDestinationField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ResponseDestinationField]
  }

  def decode(a: Any) : Option[ResponseDestinationField] = a match {
    case v: String => Some(ResponseDestinationField(v))
    case v: ResponseDestinationField => Some(v)
    case _ => scala.Option.empty[ResponseDestinationField]
  } 
}