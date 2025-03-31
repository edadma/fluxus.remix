/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CollapseHorizontalFill icon from the Remix Icon library, Arrows category.
 */
case class CollapseHorizontalFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CollapseHorizontalFill icon component.
 *
 * @example CollapseHorizontalFill <> CollapseHorizontalFillProps(size = 24, color = "blue")
 */
def CollapseHorizontalFill = (props: CollapseHorizontalFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.5 12 18.4497 7.05029 18.4488 11H23V13H18.4483L18.4473 16.9473 13.5 12ZM1 13H5.55013L5.55005 16.9493 10.5 11.9996 5.55025 7.0498 5.55017 11H1V13Z")
  )
}
