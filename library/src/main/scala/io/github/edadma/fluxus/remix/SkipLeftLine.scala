/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SkipLeftLine icon from the Remix Icon library, Arrows category.
 */
case class SkipLeftLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SkipLeftLine icon component.
 *
 * @example SkipLeftLine <> SkipLeftLineProps(size = 24, color = "blue")
 */
def SkipLeftLine = (props: SkipLeftLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.9142 12L18.7071 7.20712L17.2929 5.79291L11.0858 12L17.2929 18.2071L18.7071 16.7929L13.9142 12ZM7 18V6.00001H9V18H7Z")
  )
}
