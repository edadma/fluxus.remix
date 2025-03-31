/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftDoubleLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftDoubleLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftDoubleLine icon component.
 *
 * @example ArrowLeftDoubleLine <> ArrowLeftDoubleLineProps(size = 24, color = "blue")
 */
def ArrowLeftDoubleLine = (props: ArrowLeftDoubleLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.83582 12L11.0429 18.2071L12.4571 16.7929L7.66424 12L12.4571 7.20712L11.0429 5.79291L4.83582 12ZM10.4857 12L16.6928 18.2071L18.107 16.7929L13.3141 12L18.107 7.20712L16.6928 5.79291L10.4857 12Z")
  )
}
