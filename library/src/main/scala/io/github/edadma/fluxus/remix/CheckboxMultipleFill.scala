/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CheckboxMultipleFill icon from the Remix Icon library, System category.
 */
case class CheckboxMultipleFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CheckboxMultipleFill icon component.
 *
 * @example CheckboxMultipleFill <> CheckboxMultipleFillProps(size = 24, color = "blue")
 */
def CheckboxMultipleFill = (props: CheckboxMultipleFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6.99979 7V3C6.99979 2.44772 7.4475 2 7.99979 2H20.9998C21.5521 2 21.9998 2.44772 21.9998 3V16C21.9998 16.5523 21.5521 17 20.9998 17H17V20.9925C17 21.5489 16.551 22 15.9925 22H3.00728C2.45086 22 2 21.5511 2 20.9925L2.00276 8.00748C2.00288 7.45107 2.4518 7 3.01025 7H6.99979ZM8.99979 7H15.9927C16.549 7 17 7.44892 17 8.00748V15H19.9998V4H8.99979V7ZM8.50242 18L14.1593 12.3431L12.7451 10.9289L8.50242 15.1716L6.3811 13.0503L4.96689 14.4645L8.50242 18Z")
  )
}
