package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegDatedDateField(override val value: LocalDate) extends SfFieldLocalMktDate(739, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(739)LegDatedDate=(").append(value).append(")")
}

object LegDatedDateField {
  val TagId = 739  
  def apply(value: String) = try {
    new LegDatedDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegDatedDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegDatedDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegDatedDateField]
  }

  def decode(a: Any) : Option[LegDatedDateField] = a match {
    case v: String => Some(LegDatedDateField(v))
    case v: LocalDate => Some(LegDatedDateField(v))
    case v: LegDatedDateField => Some(v)
    case _ => scala.Option.empty[LegDatedDateField]
  } 
}
