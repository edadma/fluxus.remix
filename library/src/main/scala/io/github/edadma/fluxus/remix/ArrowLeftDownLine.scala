/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftDownLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftDownLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftDownLine icon component.
 *
 * @example ArrowLeftDownLine <> ArrowLeftDownLineProps(size = 24, color = "blue")
 */
def ArrowLeftDownLine = (props: ArrowLeftDownLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9 13.589L17.6066 4.98242L19.0208 6.39664L10.4142 15.0032H18V17.0032H7V6.00324H9V13.589Z")
  )
}
