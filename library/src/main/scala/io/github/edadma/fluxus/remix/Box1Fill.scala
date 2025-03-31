/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Box1Fill icon from the Remix Icon library, Others category.
 */
case class Box1FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Box1Fill icon component.
 *
 * @example Box1Fill <> Box1FillProps(size = 24, color = "blue")
 */
def Box1Fill = (props: Box1FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 1 21.5 6.5V17.5L13 22.4211V11.4234L3.49793 5.92225 12 1ZM2.5 7.6555V17.5L11 22.4211V12.5765L2.5 7.6555Z")
  )
}
