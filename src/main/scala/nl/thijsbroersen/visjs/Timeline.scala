package nl.thijsbroersen.visjs

import org.scalajs.dom.html._

import scala.scalajs.js
import scala.scalajs.js.Date
import scala.scalajs.js.annotation.{JSGlobal, JSName}

@js.native
@JSGlobal("vis.Timeline")
class TimeLine(container: Element) extends js.Object {
  def destroy(): Unit = js.native
  def fit(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Unit = js.native
  def focus(ids: js.Array[String], options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Unit = js.native
  def on[T <: TimelineEvent](event: String, callback: js.Function1[T, Unit]): Unit = js.native
  def off[T <: TimelineEvent](event: String, callback: js.Function1[T, Unit]): Unit = js.native
  def redraw(): Unit = js.native
  def setCurrentTime(time: Date): Unit = js.native
  def setCustomTime(time: Date): Unit = js.native
  def setCustomTimeTitle(title: String, id: js.UndefOr[String] = js.undefined): Unit = js.native
  def setOptions(options: js.Dictionary[Any]): Unit = js.native
  def setData(data: js.Dictionary[Any]): Unit = js.native
  def setItems(items: DataSet): Unit = js.native
  def setGroups(items: DataSet): Unit = js.native
  def setSelection(ids: js.Array[String], options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Unit = js.native
  def setWindow(start: Date, end: Date, options: js.UndefOr[js.Dictionary[Any]] = js.undefined,
                callback: js.UndefOr[js.Function0[Unit]] = js.undefined): Unit = js.native
  def moveTo(date: String, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Unit = js.native
}

object TimeLine {
  def apply(container: Element): TimeLine = new TimeLine(container)
}
