package org.sapienapps.http4s

case class Session[Params, U](params: Map[Params, _] = Map(), user: Option[U] = None) {

}
