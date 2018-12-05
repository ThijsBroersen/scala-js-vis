package nl.thijsbroersen.visjs

import org.scalajs.dom.html._

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSGlobal, JSName }

@js.native
@JSGlobal("vis.Network")
class Network(container: Element) extends js.Object {

  def destroy(): Unit = js.native
  def setData(data: js.Dictionary[Any]): Unit = js.native
  def setOptions(options: js.Dictionary[Any]): Unit = js.native
  def on(event: String, callback: js.Function1[NetworkSelectEvent, Unit]): Unit = js.native
  def off(event: String, callback: js.Function1[NetworkSelectEvent, Unit]): Unit = js.native
  def once(event: String, callback: js.Function1[NetworkSelectEvent, Unit]): Unit = js.native

  def canvasToDOM(pos: Position): Position = js.native
  def DOMtoCanvas(pos: Position): Position = js.native
  def redraw(): Unit = js.native
  def setSize(width: String, height: String): Unit = js.native

  def cluster(options: js.Dictionary[Any]): Unit = js.native
  def clusterByConnection(nodeId: String): Unit = js.native
  def clusterByHubsize(hubsize: js.UndefOr[Int] = js.undefined): Unit = js.native
  def clusterOutliers(): Unit = js.native
  def findNode(nodeId: String): js.Array[String] = js.native
  def getClusterEdges(baseEdgeId: String): js.Array[String] = js.native
  def getBaseEdges(clusteredEdgeId: String): js.Array[String] = js.native
  def updateEdge(startEdgeId: String, options: js.Dictionary[Any]): Unit = js.native
  def updateClusteredNode(clusteredNodeId: String, options: js.Dictionary[Any]): Unit = js.native
  def isCluster(nodeId: String): Boolean = js.native
  def getNodesInCluster(clusterNodeId: String): js.Array[String] = js.native
  def openCluster(nodeId: String, options: js.Dictionary[Any]): Unit = js.native

  def getSeed(): Double = js.native

  def enableEditMode(): Unit = js.native
  def disableEditMode(): Unit = js.native

  def getPositions(nodes: js.Array[String]): js.Dictionary[Position] = js.native
  def storePositions(): Unit = js.native
  def moveNode(nodeId: String, x: Int, y: Int): Unit = js.native
  def getConnectedNodes(id: String, direction: js.UndefOr[String] = js.undefined): js.Array[String] = js.native
  def getConnectedEdges(id: String, direction: js.UndefOr[String] = js.undefined): js.Array[String] = js.native

  def startSimulation(): Unit = js.native
  def stopSimulation(): Unit = js.native
  def stabilize(iterations: js.UndefOr[Int] = js.undefined): Unit = js.native

  def getSelection(): NetworkSelection = js.native
  def getSelectedNodes(): js.Array[String] = js.native
  def getSelectedEdges(): js.Array[String] = js.native
  def getNodeAt(position: Position): js.UndefOr[String] = js.native
  def getEdgeAt(position: Position): js.UndefOr[String] = js.native
  def selectNodes(nodeIds: js.Array[String], highlightEdges: js.UndefOr[Boolean] = js.undefined): Unit = js.native
  def selectEdges(edgeIds: js.Array[String]): Unit = js.native
  def setSelection(selection: NetworkSelection): Unit = js.native
  def unselectAll(): Unit = js.native

  def getScale(): Double = js.native
  def getViewPosition(): Position = js.native
  def fit(options: js.UndefOr[NetworkFit] = js.undefined): Unit = js.native
  def focus(nodeId: String, options: js.UndefOr[NetworkFocus] = js.undefined): Unit = js.native
  def moveTo(nodeId: String, options: js.UndefOr[NetworkMoveTo] = js.undefined): Unit = js.native
  def releaseNode(): Unit = js.native
}

object Network {
  def apply(container: Element): Network = new Network(container)
}
