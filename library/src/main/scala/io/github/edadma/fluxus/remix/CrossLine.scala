/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CrossLine icon from the Remix Icon library, Others category.
 */
case class CrossLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CrossLine icon component.
 *
 * @example CrossLine <> CrossLineProps(size = 24, color = "blue")
 */
def CrossLine = (props: CrossLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9 2H15V7H20V13H15V22H9V13H4V7H9V2ZM11 4V9H6V11H11V20H13V11H18V9H13V4H11Z")
  )
}
