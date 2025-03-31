/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AedElectrodesFill icon from the Remix Icon library, Health & Medical category.
 */
case class AedElectrodesFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AedElectrodesFill icon component.
 *
 * @example AedElectrodesFill <> AedElectrodesFillProps(size = 24, color = "blue")
 */
def AedElectrodesFill = (props: AedElectrodesFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 3C7.44772 3 7 3.44772 7 4V7H4C3.44772 7 3 7.44772 3 8V20C3 20.5523 3.44772 21 4 21H9V23H11V21H16C16.5523 21 17 20.5523 17 20V17H20C20.5523 17 21 16.5523 21 16V4C21 3.44772 20.5523 3 20 3H8ZM17 15V8C17 7.44772 16.5523 7 16 7H9V5H19V15H17Z")
  )
}
