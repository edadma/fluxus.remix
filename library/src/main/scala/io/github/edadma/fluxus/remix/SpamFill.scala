/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SpamFill icon from the Remix Icon library, System category.
 */
case class SpamFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SpamFill icon component.
 *
 * @example SpamFill <> SpamFillProps(size = 24, color = "blue")
 */
def SpamFill = (props: SpamFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17.5 2.5L23 12L17.5 21.5H6.5L1 12L6.5 2.5H17.5ZM11 15V17H13V15H11ZM11 7V13H13V7H11Z")
  )
}
