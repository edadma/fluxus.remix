/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ZzzFill icon from the Remix Icon library, Health & Medical category.
 */
case class ZzzFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ZzzFill icon component.
 *
 * @example ZzzFill <> ZzzFillProps(size = 24, color = "blue")
 */
def ZzzFill = (props: ZzzFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 11V13L5.67257 19H11V21H3V19L8.32557 13H3V11H11ZM21 3V5L15.6726 11H21V13H13V11L18.3256 5H13V3H21Z")
  )
}
