package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class PeggedRefPriceField(override val value: Float) extends SfFieldFloat(1095, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1095)PeggedRefPrice=(").append(value).append(")")
}

object PeggedRefPriceField {
  val TagId = 1095  
  def apply(value: String) = try {
    new PeggedRefPriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PeggedRefPrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PeggedRefPriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PeggedRefPriceField]
  }

  def decode(a: Any) : Option[PeggedRefPriceField] = a match {
    case v: String => Some(PeggedRefPriceField(v))
    case v: Float => Some(PeggedRefPriceField(v))
    case v: Double => Some(PeggedRefPriceField(v.toFloat))
    case v: Int => Some(PeggedRefPriceField(v.toFloat))
    case v: PeggedRefPriceField => Some(v)
    case _ => scala.Option.empty[PeggedRefPriceField]
  } 
}