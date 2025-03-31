/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CollapseVerticalFill icon from the Remix Icon library, Arrows category.
 */
case class CollapseVerticalFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CollapseVerticalFill icon component.
 *
 * @example CollapseVerticalFill <> CollapseVerticalFillProps(size = 24, color = "blue")
 */
def CollapseVerticalFill = (props: CollapseVerticalFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.9995 13.4995 16.9492 18.4493 12.9995 18.4483 12.9995 22.9995H10.9995L10.9995 18.4478 7.05222 18.4468 11.9995 13.4995ZM10.9995.999512 10.9995 5.54964 7.05026 5.54956 12 10.4995 16.9497 5.54977 12.9995 5.54968V.999512L10.9995.999512Z")
  )
}
