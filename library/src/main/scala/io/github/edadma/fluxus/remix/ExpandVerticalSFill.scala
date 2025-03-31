/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandVerticalSFill icon from the Remix Icon library, Arrows category.
 */
case class ExpandVerticalSFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandVerticalSFill icon component.
 *
 * @example ExpandVerticalSFill <> ExpandVerticalSFillProps(size = 24, color = "blue")
 */
def ExpandVerticalSFill = (props: ExpandVerticalSFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16.9493 7.44926L11.9995 2.49951L7.05226 7.44678L10.9995 7.44777L10.9995 16.5496L7.05031 16.5496L12 21.4995L16.9498 16.5498L12.9995 16.5497L12.9995 7.44827L16.9493 7.44926Z")
  )
}
