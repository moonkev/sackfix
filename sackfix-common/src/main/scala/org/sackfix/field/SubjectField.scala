package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class SubjectField(override val value: String) extends SfFieldString(147, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(147)Subject=(").append(value).append(")")
}

object SubjectField {
  val TagId = 147  
  def decode(a: Option[Any]) : Option[SubjectField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SubjectField]
  }

  def decode(a: Any) : Option[SubjectField] = a match {
    case v: String => Some(SubjectField(v))
    case v: SubjectField => Some(v)
    case _ => scala.Option.empty[SubjectField]
  } 
}
