/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TestTubeFill icon from the Remix Icon library, Health & Medical category.
 */
case class TestTubeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TestTubeFill icon component.
 *
 * @example TestTubeFill <> TestTubeFillProps(size = 24, color = "blue")
 */
def TestTubeFill = (props: TestTubeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 2V4H16V18C16 20.2091 14.2091 22 12 22C9.79086 22 8 20.2091 8 18V4H7V2H17ZM13 15C12.4477 15 12 15.4477 12 16C12 16.5523 12.4477 17 13 17C13.5523 17 14 16.5523 14 16C14 15.4477 13.5523 15 13 15ZM11 12C10.4477 12 10 12.4477 10 13C10 13.5523 10.4477 14 11 14C11.5523 14 12 13.5523 12 13C12 12.4477 11.5523 12 11 12ZM14 4H10V8H14V4Z")
  )
}
