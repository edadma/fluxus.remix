/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BasketballFill icon from the Remix Icon library, Others category.
 */
case class BasketballFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BasketballFill icon component.
 *
 * @example BasketballFill <> BasketballFillProps(size = 24, color = "blue")
 */
def BasketballFill = (props: BasketballFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.366 13.366L14.1407 14.3911C13.05 16.8036 12.9953 19.4669 13.8296 21.8314C13.2375 21.9426 12.6255 22 12 22C10.5353 22 9.14414 21.6851 7.89054 21.1193L12.366 13.366ZM15.8835 15.3976L20.1168 17.8423C19.0224 19.3601 17.5128 20.5586 15.7543 21.2714C15.1047 19.511 15.0756 17.5348 15.7624 15.7017L15.8835 15.3976ZM8.85892 11.3417L10.634 12.366L6.15773 20.1168C4.5194 18.9355 3.25309 17.2704 2.56813 15.3308C4.92702 14.8924 7.11579 13.6115 8.65334 11.6179L8.85892 11.3417ZM21.9051 10.6165C21.9677 11.0687 22 11.5306 22 12C22 13.4647 21.6851 14.8559 21.1193 16.1095L16.8838 13.6649C18.1057 12.0497 19.8575 11.0078 21.7497 10.6436L21.9051 10.6165ZM2.8807 7.89054L7.11588 10.3356C5.86043 11.9949 4.0458 13.0491 2.09489 13.3854C2.03239 12.932 2 12.4698 2 12C2 10.5353 2.3149 9.14414 2.8807 7.89054ZM17.8423 3.88318C19.4803 5.06428 20.7465 6.72901 21.4315 8.66817C19.0721 9.108 16.8836 10.3891 15.3463 12.3826L15.1407 12.6588L13.366 11.634L17.8423 3.88318ZM12 2C13.4647 2 14.8559 2.3149 16.1095 2.8807L11.634 10.634L9.85892 9.60983C10.95 7.19703 11.0048 4.53332 10.1704 2.16848C10.7625 2.05742 11.3745 2 12 2ZM8.24679 2.72936C8.89548 4.48945 8.92444 6.46595 8.2373 8.2992L8.11613 8.60335L3.88318 6.15773C4.93611 4.69744 6.37339 3.53272 8.04682 2.81177L8.24679 2.72936Z")
  )
}
