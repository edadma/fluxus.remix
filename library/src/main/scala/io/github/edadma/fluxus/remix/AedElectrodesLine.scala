/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AedElectrodesLine icon from the Remix Icon library, Health & Medical category.
 */
case class AedElectrodesLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AedElectrodesLine icon component.
 *
 * @example AedElectrodesLine <> AedElectrodesLineProps(size = 24, color = "blue")
 */
def AedElectrodesLine = (props: AedElectrodesLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 4C7 3.44772 7.44772 3 8 3H20C20.5523 3 21 3.44772 21 4V16C21 16.5523 20.5523 17 20 17H17V20C17 20.5523 16.5523 21 16 21H11V23H9V21H4C3.44772 21 3 20.5523 3 20V8C3 7.44772 3.44772 7 4 7H7V4ZM19 15V5H9V7H16C16.5523 7 17 7.44772 17 8V15H19ZM5 9V19H15V9H5Z")
  )
}
