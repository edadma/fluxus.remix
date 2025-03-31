/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandVerticalFill icon from the Remix Icon library, Arrows category.
 */
case class ExpandVerticalFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandVerticalFill icon component.
 *
 * @example ExpandVerticalFill <> ExpandVerticalFillProps(size = 24, color = "blue")
 */
def ExpandVerticalFill = (props: ExpandVerticalFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.9995 0.499512L16.9492 5.44926L12.9995 5.44827V9.99951H10.9995V5.44777L7.05222 5.44678L11.9995 0.499512ZM10.9995 13.9995L10.9995 18.5496L7.05026 18.5496L12 23.4995L16.9497 18.5498L12.9995 18.5497V13.9995H10.9995Z")
  )
}
