/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowRightUpFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowRightUpFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowRightUpFill icon component.
 *
 * @example ArrowRightUpFill <> ArrowRightUpFillProps(size = 24, color = "blue")
 */
def ArrowRightUpFill = (props: ArrowRightUpFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.0508 12.361L7.39395 18.0179L5.97974 16.6037L11.6366 10.9468L6.68684 5.99707H18.0006V17.3108L13.0508 12.361Z")
  )
}
