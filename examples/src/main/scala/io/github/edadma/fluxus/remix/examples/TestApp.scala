package io.github.edadma.fluxus.remix.examples

import io.github.edadma.fluxus.*
import io.github.edadma.fluxus.remix.{HeartFill, HeartFillProps}
import org.scalajs.dom.MouseEvent

object TestApp {
  def App: FluxusNode =
    div(
      cls := "min-h-screen bg-base-200 flex items-center justify-center",
      HeartFill <> HeartFillProps(size = 200, color = "blue", className = "mx-auto"),
    )
}
