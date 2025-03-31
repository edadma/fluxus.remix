/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowDownLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowDownLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowDownLine icon component.
 *
 * @example ArrowDownLine <> ArrowDownLineProps(size = 24, color = "blue")
 */
def ArrowDownLine = (props: ArrowDownLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.0001 16.1716L18.3641 10.8076L19.7783 12.2218L12.0001 20L4.22192 12.2218L5.63614 10.8076L11.0001 16.1716V4H13.0001V16.1716Z")
  )
}
