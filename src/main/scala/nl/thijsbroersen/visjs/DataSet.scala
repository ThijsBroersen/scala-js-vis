package nl.thijsbroersen.visjs

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSGlobal, JSName }

@js.native
@JSGlobal("vis.DataSet")
class DataSet(data: js.UndefOr[js.Array[js.Dictionary[Any]]] = js.undefined,
              options: js.UndefOr[js.Dictionary[Any]] = js.undefined) extends js.Object {
  def add(data: js.Array[js.Dictionary[Any]], senderId: js.UndefOr[String] = js.undefined): js.Array[String] = js.native
  def clear(senderId: js.UndefOr[String] = js.undefined): js.Array[String] = js.native
  def flush(): Unit = js.native
  def forEach(callback: js.Function2[js.Dynamic, String, Unit], options: js.Dictionary[Any]): Unit = js.native
  def getIds(): js.Array[String] = js.native
  def map(callback: js.Function2[js.Dynamic, String, js.Dynamic], options: js.Dictionary[Any]): js.Array[js.Dictionary[Any]] = js.native
  def setOptions(options: js.Dictionary[Any]): Unit = js.native
  def update(data: js.Array[js.Dictionary[Any]], senderId: js.UndefOr[String] = js.undefined): js.Array[String] = js.native
  //  def remove(id: String, senderId: js.UndefOr[String] = js.undefined): js.Array[String] = js.native
  def remove(id: js.Array[String], senderId: js.UndefOr[String] = js.undefined): js.Array[String] = js.native
}

object DataSet {
  def apply(data: js.UndefOr[js.Array[js.Dictionary[Any]]] = js.undefined,
            options: js.UndefOr[js.Dictionary[Any]] = js.undefined): DataSet =
    new DataSet(data, options)
}
