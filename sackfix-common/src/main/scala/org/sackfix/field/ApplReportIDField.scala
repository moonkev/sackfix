package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class ApplReportIDField(override val value: String) extends SfFieldString(1356, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1356)ApplReportID=(").append(value).append(")")
}

object ApplReportIDField {
  val TagId = 1356  
  def decode(a: Option[Any]) : Option[ApplReportIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ApplReportIDField]
  }

  def decode(a: Any) : Option[ApplReportIDField] = a match {
    case v: String => Some(ApplReportIDField(v))
    case v: ApplReportIDField => Some(v)
    case _ => scala.Option.empty[ApplReportIDField]
  } 
}
