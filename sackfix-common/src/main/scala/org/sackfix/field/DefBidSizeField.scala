package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class DefBidSizeField(override val value: Float) extends SfFieldFloat(293, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(293)DefBidSize=(").append(value).append(")")
}

object DefBidSizeField {
  val TagId = 293  
  def apply(value: String) = try {
    new DefBidSizeField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DefBidSize("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DefBidSizeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DefBidSizeField]
  }

  def decode(a: Any) : Option[DefBidSizeField] = a match {
    case v: String => Some(DefBidSizeField(v))
    case v: Float => Some(DefBidSizeField(v))
    case v: Double => Some(DefBidSizeField(v.toFloat))
    case v: Int => Some(DefBidSizeField(v.toFloat))
    case v: DefBidSizeField => Some(v)
    case _ => scala.Option.empty[DefBidSizeField]
  } 
}