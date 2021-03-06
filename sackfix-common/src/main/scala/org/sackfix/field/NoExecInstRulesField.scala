package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoExecInstRulesField(override val value: Int) extends SfNumInGroup(1232, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1232)NoExecInstRules=(").append(value).append(")")
}

object NoExecInstRulesField {
  val TagId = 1232  
  def apply(value: String) = try {
    new NoExecInstRulesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoExecInstRules("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoExecInstRulesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoExecInstRulesField]
  }

  def decode(a: Any) : Option[NoExecInstRulesField] = a match {
    case v: String => Some(NoExecInstRulesField(v))
    case v: Int => Some(NoExecInstRulesField(v))
    case v: NoExecInstRulesField => Some(v)
    case _ => scala.Option.empty[NoExecInstRulesField]
  } 
}
