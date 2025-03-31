/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MenuUnfold2Fill icon from the Remix Icon library, System category.
 */
case class MenuUnfold2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MenuUnfold2Fill icon component.
 *
 * @example MenuUnfold2Fill <> MenuUnfold2FillProps(size = 24, color = "blue")
 */
def MenuUnfold2Fill = (props: MenuUnfold2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 3.5V13.5L16 8.49955L21 3.5ZM21 19.9995V17.9995H3V19.9995H21ZM12 12.9995V10.9995H3V12.9995H12ZM12 5.99951V3.99951H3V5.99951H12Z")
  )
}
