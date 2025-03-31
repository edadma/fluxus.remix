/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftUpFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftUpFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftUpFill icon component.
 *
 * @example ArrowLeftUpFill <> ArrowLeftUpFillProps(size = 24, color = "blue")
 */
def ArrowLeftUpFill = (props: ArrowLeftUpFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.3608 10.9468L18.0176 16.6037L16.6034 18.0179L10.9466 12.361L5.99683 17.3108V5.99707H17.3105L12.3608 10.9468Z")
  )
}
