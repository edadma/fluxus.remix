/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SpamLine icon from the Remix Icon library, System category.
 */
case class SpamLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SpamLine icon component.
 *
 * @example SpamLine <> SpamLineProps(size = 24, color = "blue")
 */
def SpamLine = (props: SpamLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17.5 2.5L23 12L17.5 21.5H6.5L1 12L6.5 2.5H17.5ZM16.3469 4.5H7.65311L3.311 12L7.65311 19.5H16.3469L20.689 12L16.3469 4.5ZM11 15H13V17H11V15ZM11 7H13V13H11V7Z")
  )
}
