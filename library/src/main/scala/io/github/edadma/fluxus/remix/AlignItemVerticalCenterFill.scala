/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * AlignItemVerticalCenterFill icon from the Remix Icon library, Design category.
 */
case class AlignItemVerticalCenterFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * AlignItemVerticalCenterFill icon component.
 *
 * @example AlignItemVerticalCenterFill <> AlignItemVerticalCenterFillProps(size = 24, color = "blue")
 */
def AlignItemVerticalCenterFill = (props: AlignItemVerticalCenterFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 19C4 19.5523 4.44772 20 5 20H10C10.5523 20 11 19.5523 11 19V13H13V17C13 17.5523 13.4477 18 14 18H19C19.5523 18 20 17.5523 20 17V13H22V11H20V7C20 6.44772 19.5523 6 19 6L14 6C13.4477 6 13 6.44772 13 7V11H11V5C11 4.44771 10.5523 4 10 4H5C4.44771 4 4 4.44772 4 5L4 11H2V13H4L4 19Z")
  )
}
