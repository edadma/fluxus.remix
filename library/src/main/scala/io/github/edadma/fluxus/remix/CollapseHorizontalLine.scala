/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CollapseHorizontalLine icon from the Remix Icon library, Arrows category.
 */
case class CollapseHorizontalLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CollapseHorizontalLine icon component.
 *
 * @example CollapseHorizontalLine <> CollapseHorizontalLineProps(size = 24, color = "blue")
 */
def CollapseHorizontalLine = (props: CollapseHorizontalLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.5 12 18.4497 7.05029 19.864 8.46451 17.3284 11H23V13H17.3284L19.8615 15.5331 18.4473 16.9473 13.5 12ZM1 13H6.67084L4.13584 15.535 5.55005 16.9493 10.5 11.9996 5.55025 7.0498 4.13604 8.46402 6.67206 11H1V13Z")
  )
}
