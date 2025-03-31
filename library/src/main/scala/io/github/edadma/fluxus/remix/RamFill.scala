/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * RamFill icon from the Remix Icon library, Device category.
 */
case class RamFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * RamFill icon component.
 *
 * @example RamFill <> RamFillProps(size = 24, color = "blue")
 */
def RamFill = (props: RamFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 5C1.44772 5 1 5.44772 1 6V18C1 18.5523 1.44772 19 2 19H5V17H7V19H9V17H11V19H13V17H15V19H17V17H19V19H22C22.5523 19 23 18.5523 23 18V6C23 5.44772 22.5523 5 22 5H2ZM5 9H11V12H5V9ZM13 9H19V12H13V9Z")
  )
}
