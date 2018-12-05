package nl.thijsbroersen.visjs

import org.scalajs.dom.html._

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSGlobal, JSName }

@js.native
@JSGlobal("vis.Graph2d")
class Graph2d(container: Element) extends js.Object {

  def destroy(): Unit = js.native
  def setItems(items: js.Object): Unit = js.native //x,y,group,label
  def setOptions(options: js.Object): Unit = js.native
  def on(event: String, callback: js.Function1[TimelineSelectEvent, js.Dynamic]): Unit = js.native
  def off(event: String, callback: js.Function1[TimelineSelectEvent, js.Dynamic]): Unit = js.native

  def redraw(): Unit = js.native
}

object Graph2d {
  def apply(container: Element): Graph2d = new Graph2d(container)
}
