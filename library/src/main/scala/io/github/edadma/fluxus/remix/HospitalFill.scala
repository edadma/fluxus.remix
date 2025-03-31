/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * HospitalFill icon from the Remix Icon library, Buildings category.
 */
case class HospitalFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * HospitalFill icon component.
 *
 * @example HospitalFill <> HospitalFillProps(size = 24, color = "blue")
 */
def HospitalFill = (props: HospitalFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 20H23V22H1V20H3V3C3 2.44772 3.44772 2 4 2H20C20.5523 2 21 2.44772 21 3V20ZM11 8H9V10H11V12H13V10H15V8H13V6H11V8ZM14 20H16V14H8V20H10V16H14V20Z")
  )
}
