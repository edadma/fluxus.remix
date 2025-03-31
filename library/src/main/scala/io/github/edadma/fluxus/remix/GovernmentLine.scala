/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GovernmentLine icon from the Remix Icon library, Buildings category.
 */
case class GovernmentLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GovernmentLine icon component.
 *
 * @example GovernmentLine <> GovernmentLineProps(size = 24, color = "blue")
 */
def GovernmentLine = (props: GovernmentLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 6H23V8H22V19H23V21H1V19H2V8H1V6H4V4C4 3.44772 4.44772 3 5 3H19C19.5523 3 20 3.44772 20 4V6ZM20 8H4V19H7V12H9V19H11V12H13V19H15V12H17V19H20V8ZM6 5V6H18V5H6Z")
  )
}
