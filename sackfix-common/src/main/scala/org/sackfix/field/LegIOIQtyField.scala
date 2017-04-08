package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegIOIQtyField(override val value: String) extends SfFieldString(682, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(682)LegIOIQty=(").append(value).append(")")
}

object LegIOIQtyField {
  val TagId = 682  
  def decode(a: Option[Any]) : Option[LegIOIQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegIOIQtyField]
  }

  def decode(a: Any) : Option[LegIOIQtyField] = a match {
    case v: String => Some(LegIOIQtyField(v))
    case v: LegIOIQtyField => Some(v)
    case _ => scala.Option.empty[LegIOIQtyField]
  } 
}