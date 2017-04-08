package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20170404
  */
case class WorkingIndicatorField(override val value: Boolean) extends SfFieldBoolean(636, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(636)WorkingIndicator=(").append({if (value) "Y" else "N"}).append(")")
}

object WorkingIndicatorField {
  val TagId = 636  
  def apply(value: String) = try {
    new WorkingIndicatorField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("WorkingIndicator.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new WorkingIndicator("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[WorkingIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[WorkingIndicatorField]
  }

  def decode(a: Any) : Option[WorkingIndicatorField] = a match {
    case v: String => Some(WorkingIndicatorField(v))
    case v: Boolean => Some(WorkingIndicatorField(v))
    case v: WorkingIndicatorField => Some(v)
    case _ => scala.Option.empty[WorkingIndicatorField]
  } 
}