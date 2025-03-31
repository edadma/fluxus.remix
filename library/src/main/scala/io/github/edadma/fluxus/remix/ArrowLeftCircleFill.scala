/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftCircleFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftCircleFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftCircleFill icon component.
 *
 * @example ArrowLeftCircleFill <> ArrowLeftCircleFillProps(size = 24, color = "blue")
 */
def ArrowLeftCircleFill = (props: ArrowLeftCircleFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 2C17.52 2 22 6.48 22 12C22 17.52 17.52 22 12 22C6.48 22 2 17.52 2 12C2 6.48 6.48 2 12 2ZM12 11V8L8 12L12 16V13H16V11H12Z")
  )
}
