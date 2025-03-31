/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Vidicon2Fill icon from the Remix Icon library, Media category.
 */
case class Vidicon2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Vidicon2Fill icon component.
 *
 * @example Vidicon2Fill <> Vidicon2FillProps(size = 24, color = "blue")
 */
def Vidicon2Fill = (props: Vidicon2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 6V4H5V2H15V6H16C16.5523 6 17 6.44772 17 7V9.2L22.2133 5.55071C22.4395 5.39235 22.7513 5.44737 22.9096 5.6736C22.9684 5.75764 23 5.85774 23 5.96033V18.0397C23 18.3158 22.7761 18.5397 22.5 18.5397C22.3974 18.5397 22.2973 18.5081 22.2133 18.4493L17 14.8V19C17 19.5523 16.5523 20 16 20H2C1.44772 20 1 19.5523 1 19V7C1 6.44772 1.44772 6 2 6H13ZM5 10V12H7V10H5Z")
  )
}
