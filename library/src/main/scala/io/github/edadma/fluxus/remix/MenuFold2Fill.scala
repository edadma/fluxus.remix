/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MenuFold2Fill icon from the Remix Icon library, System category.
 */
case class MenuFold2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MenuFold2Fill icon component.
 *
 * @example MenuFold2Fill <> MenuFold2FillProps(size = 24, color = "blue")
 */
def MenuFold2Fill = (props: MenuFold2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 3.5L9 8.49955L4 13.5V3.5ZM21 19.9995V17.9995H3V19.9995H21ZM21 12.9995V10.9995H12V12.9995H21ZM21 5.99951V3.99951H12V5.99951H21Z")
  )
}
