package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoComplexEventDatesField(override val value: Int) extends SfNumInGroup(1491, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1491)NoComplexEventDates=(").append(value).append(")")
}

object NoComplexEventDatesField {
  val TagId = 1491  
  def apply(value: String) = try {
    new NoComplexEventDatesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoComplexEventDates("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoComplexEventDatesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoComplexEventDatesField]
  }

  def decode(a: Any) : Option[NoComplexEventDatesField] = a match {
    case v: String => Some(NoComplexEventDatesField(v))
    case v: Int => Some(NoComplexEventDatesField(v))
    case v: NoComplexEventDatesField => Some(v)
    case _ => scala.Option.empty[NoComplexEventDatesField]
  } 
}
