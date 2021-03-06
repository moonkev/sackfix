package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class SideValue2Field(override val value: Float) extends SfFieldFloat(397, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(397)SideValue2=(").append(value).append(")")
}

object SideValue2Field {
  val TagId = 397  
  def apply(value: String) = try {
    new SideValue2Field(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SideValue2("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SideValue2Field] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SideValue2Field]
  }

  def decode(a: Any) : Option[SideValue2Field] = a match {
    case v: String => Some(SideValue2Field(v))
    case v: Float => Some(SideValue2Field(v))
    case v: Double => Some(SideValue2Field(v.toFloat))
    case v: Int => Some(SideValue2Field(v.toFloat))
    case v: SideValue2Field => Some(v)
    case _ => scala.Option.empty[SideValue2Field]
  } 
}
