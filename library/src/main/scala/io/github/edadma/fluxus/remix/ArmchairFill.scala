/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArmchairFill icon from the Remix Icon library, Others category.
 */
case class ArmchairFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArmchairFill icon component.
 *
 * @example ArmchairFill <> ArmchairFillProps(size = 24, color = "blue")
 */
def ArmchairFill = (props: ArmchairFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 3H8C5.79086 3 4 4.79086 4 7V8C6.76142 8 9 10.2386 9 13H15C15 10.2386 17.2386 8 20 8V7C20 4.79086 18.2091 3 16 3ZM20 10C18.3431 10 17 11.3431 17 13V16H15V15H9V16H7V13C7 11.3431 5.65685 10 4 10C2.34315 10 1 11.3431 1 13C1 14.3062 1.83481 15.4175 3 15.8293V21H5V20H19V21H21V15.8293C22.1652 15.4175 23 14.3062 23 13C23 11.3431 21.6569 10 20 10Z")
  )
}
