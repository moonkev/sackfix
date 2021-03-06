package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class BidSpotRateField(override val value: Float) extends SfFieldFloat(188, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(188)BidSpotRate=(").append(value).append(")")
}

object BidSpotRateField {
  val TagId = 188  
  def apply(value: String) = try {
    new BidSpotRateField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new BidSpotRate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[BidSpotRateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BidSpotRateField]
  }

  def decode(a: Any) : Option[BidSpotRateField] = a match {
    case v: String => Some(BidSpotRateField(v))
    case v: Float => Some(BidSpotRateField(v))
    case v: Double => Some(BidSpotRateField(v.toFloat))
    case v: Int => Some(BidSpotRateField(v.toFloat))
    case v: BidSpotRateField => Some(v)
    case _ => scala.Option.empty[BidSpotRateField]
  } 
}
