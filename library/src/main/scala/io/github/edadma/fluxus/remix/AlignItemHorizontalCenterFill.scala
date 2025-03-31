/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AlignItemHorizontalCenterFill icon from the Remix Icon library, Design category.
 */
case class AlignItemHorizontalCenterFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AlignItemHorizontalCenterFill icon component.
 *
 * @example AlignItemHorizontalCenterFill <> AlignItemHorizontalCenterFillProps(size = 24, color = "blue")
 */
def AlignItemHorizontalCenterFill = (props: AlignItemHorizontalCenterFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11 4V2H13V4H19C19.5523 4 20 4.44772 20 5V10C20 10.5523 19.5523 11 19 11H13V13H17C17.5523 13 18 13.4477 18 14V19C18 19.5523 17.5523 20 17 20H13V22H11V20H7C6.44772 20 6 19.5523 6 19V14C6 13.4477 6.44772 13 7 13H11V11H5C4.44772 11 4 10.5523 4 10V5C4 4.44772 4.44772 4 5 4H11Z")
  )
}
