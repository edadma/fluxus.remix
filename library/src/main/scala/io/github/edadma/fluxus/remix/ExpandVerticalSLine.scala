/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ExpandVerticalSLine icon from the Remix Icon library, Arrows category.
 */
case class ExpandVerticalSLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ExpandVerticalSLine icon component.
 *
 * @example ExpandVerticalSLine <> ExpandVerticalSLineProps(size = 24, color = "blue")
 */
def ExpandVerticalSLine = (props: ExpandVerticalSLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16.9492 7.44926L11.9995 2.49951L7.05223 7.44678L8.46644 8.86099L10.9995 6.32794L10.9995 17.6704L8.46449 15.1353L7.05028 16.5496L12 21.4995L16.9497 16.5498L15.5355 15.1356L12.9995 17.6716L12.9995 6.32794L15.535 8.86347L16.9492 7.44926Z")
  )
}
