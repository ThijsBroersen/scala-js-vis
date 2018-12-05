package nl.thijsbroersen.visjs

import org.scalajs.dom._

import scala.collection.mutable
import scala.scalajs.js
import scala.scalajs.js.Date
import scala.scalajs.js.annotation.{ JSExportAll, ScalaJSDefined }

@js.native
trait TimelineEvent extends js.Object

@js.native
trait TimelineSelectEvent extends TimelineEvent {
  val items: js.Array[String]
  val event: MouseEvent
}

@js.native
trait TimelineEventProperties extends TimelineEvent {
  val group: String
  val item: String
  val pageX: Double
  val pageY: Double
  val x: Double
  val y: Double
  val time: Date
  val snappedTime: Date
  val what: String
  val event: MouseEvent
}

@js.native
trait RangeChangeEvent extends TimelineEvent {
  val start: Date
  val end: Date
  val byUser: Boolean
  val event: MouseEvent
}

@js.native
trait NetworkEvent extends Event {
  val srcEvent: MouseEvent
}

@js.native
trait NetworkSelectEvent extends js.Object {
  val nodes: js.Array[String]
  val edges: js.Array[String]
  val event: NetworkEvent
  val pointer: Pointer
  val previousSelection: NetworkSelection
}

@js.native
trait Pointer extends js.Object {
  val DOM: Position
  val canvas: Position
}

@js.native
trait NetworkSelection extends js.Object {
  val nodes: js.Array[String]
  val edges: js.Array[String]
}

object NetworkSelection {
  def apply(nodes: js.Array[String], edges: js.Array[String]): NetworkSelection =
    js.Dictionary[Any]("nodes" -> nodes, "edges" -> edges).asInstanceOf[NetworkSelection]
}

@js.native
trait Animation extends js.Object {
  val duration: Int
  val easingFunction: String
}

object Animation {
  def apply(duration: Int, easingFunction: String): Animation =
    js.Dictionary[Any]("duration" -> duration, "easingFunction" -> easingFunction).asInstanceOf[Animation]
}

@js.native
trait NetworkFit extends js.Object {
  val nodes: js.Array[String]
  val edges: js.Array[String]
}

object NetworkFit {
  def apply(nodes: js.Array[String], animation: Animation): NetworkFit =
    js.Dictionary[Any]("nodes" -> nodes, "animation" -> animation).asInstanceOf[NetworkFit]
}

@js.native
trait NetworkFocus extends js.Object {
  val nodes: js.Array[String]
  val edges: js.Array[String]
}

object NetworkFocus {
  def apply(scale: Double, offset: Position, locked: Boolean, animation: js.|[Boolean, Animation]): NetworkFocus =
    js.Dictionary[Any]("scale" -> scale, "offset" -> offset, "locked" -> locked, "animation" -> animation).asInstanceOf[NetworkFocus]
}

@js.native
trait NetworkMoveTo extends js.Object {
  val nodes: js.Array[String]
  val edges: js.Array[String]
}

object NetworkMoveTo {
  def apply(position: Position, scale: Double, offset: Position, animation: js.|[Boolean, Animation]): NetworkMoveTo =
    js.Dictionary[Any]("position" -> position, "scale" -> scale, "offset" -> offset, "animation" -> animation).asInstanceOf[NetworkMoveTo]
}

@js.native
trait NetworkOptions extends js.Object {
  var autoResize: Boolean
  var height: String
  var width: String
  var clickToUse: Boolean
  var nodes: NodeOptions
  var groups: js.Dictionary[NodeOptions] //mutable.Map[String, NetworkGroup]
  var interaction: NetworkInteraction
}

object NetworkOptions {
  def apply(): NetworkOptions = js.Dynamic.literal().asInstanceOf[NetworkOptions]
}

@js.native
trait NetworkInteraction extends js.Object {
  var multiselect: Boolean
}

object NetworkInteraction {
  def apply(): NetworkInteraction = js.Dynamic.literal().asInstanceOf[NetworkInteraction]
}

@js.native
trait NodeOptions extends js.Object {
  val color: NodeColor
  var shape: String
  var label: String
  var icon: NodeIcon
}

object NodeOptions {
  def apply(): NodeOptions = js.Dynamic.literal().asInstanceOf[NodeOptions]
}

@js.native
trait NodeIcon extends js.Object {
  var face: String
  var code: String
  var size: Int
  var color: NodeColor
}

object NodeIcon {
  def apply(): NodeIcon = js.Dynamic.literal().asInstanceOf[NodeIcon]
}

@js.native
trait NodeColor extends js.Object {
  var background: String
  var highlight: String
  var border: String
}

object NodeColor {
  def apply(): NodeColor = js.Dynamic.literal().asInstanceOf[NodeColor]
}

@js.native
trait Position extends js.Object {
  val x: Double
  val y: Double
}

object Position {
  def apply(x: Double, y: Double): Position = js.Dictionary[Any]("x" -> x, "y" -> y).asInstanceOf[Position]
}
