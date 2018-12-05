package nl.thijsbroersen.visjs

import org.scalajs.dom.html._

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSGlobal, JSName }

@js.native
@JSGlobal("vis.Graph3d")
class Graph3d(container: Element) extends js.Object {

  def animationStart(): Unit = js.native
  def animationStop(): Unit = js.native
  def setData(data: js.Object): Unit = js.native //x,y,z,style,filter
  def setOptions(options: js.Object): Unit = js.native
  def setSize(width: String, height: String): Unit = js.native

  def redraw(): Unit = js.native

  def getCameraPosition(): CameraPositionChange = js.native
  def setCameraPosition(pos: CameraPositionChange): CameraPositionChange = js.native
}

object Graph3d {
  def apply(container: Element): Graph3d = new Graph3d(container)
}


@js.native
trait CameraPositionChange extends js.Object {
  def horizontal: Double
  def vertical: Double
  def distance: Double
}

@js.native
trait Point extends js.Object {
  def x: Double
  def y: Double
  def z: Double
  def data: DataItem
}

@js.native
trait DataItem extends js.Object {
  def x: Double
  def y: Double
  def z: Double
  def extra[T <: Element]: T
}