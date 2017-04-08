package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class ListOrderStatusField(override val value: Int) extends SfFieldInt(431, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(431)ListOrderStatus=(").append(value).append(")").append(ListOrderStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object ListOrderStatusField {
  val TagId = 431 
  val Inbiddingprocess=1
  val Receivedforexecution=2
  val Executing=3
  val Canceling=4
  val Alert=5
  val AllDone=6
  val Reject=7
  lazy val fixDescriptionByValue = Map(1->"INBIDDINGPROCESS",2->"RECEIVEDFOREXECUTION",
    3->"EXECUTING",4->"CANCELING",5->"ALERT",
    6->"ALL_DONE",7->"REJECT")
 
  def apply(value: String) = try {
    new ListOrderStatusField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ListOrderStatus("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ListOrderStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ListOrderStatusField]
  }

  def decode(a: Any) : Option[ListOrderStatusField] = a match {
    case v: String => Some(ListOrderStatusField(v))
    case v: Int => Some(ListOrderStatusField(v))
    case v: ListOrderStatusField => Some(v)
    case _ => scala.Option.empty[ListOrderStatusField]
  } 
}