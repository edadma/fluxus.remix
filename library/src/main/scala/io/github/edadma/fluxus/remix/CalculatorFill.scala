/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CalculatorFill icon from the Remix Icon library, Business category.
 */
case class CalculatorFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CalculatorFill icon component.
 *
 * @example CalculatorFill <> CalculatorFillProps(size = 24, color = "blue")
 */
def CalculatorFill = (props: CalculatorFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4 2H20C20.5523 2 21 2.44772 21 3V21C21 21.5523 20.5523 22 20 22H4C3.44772 22 3 21.5523 3 21V3C3 2.44772 3.44772 2 4 2ZM7 12V14H9V12H7ZM7 16V18H9V16H7ZM11 12V14H13V12H11ZM11 16V18H13V16H11ZM15 12V18H17V12H15ZM7 6V10H17V6H7Z")
  )
}
