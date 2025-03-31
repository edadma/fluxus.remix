/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MickeyFill icon from the Remix Icon library, User & Faces category.
 */
case class MickeyFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MickeyFill icon component.
 *
 * @example MickeyFill <> MickeyFillProps(size = 24, color = "blue")
 */
def MickeyFill = (props: MickeyFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18.5 2C20.9853 2 23 4.01472 23 6.5C23 8.68314 21.4454 10.5032 19.3828 10.9134C19.7802 11.8623 20 12.9055 20 14C20 18.4183 16.4183 22 12 22C7.58172 22 4 18.4183 4 14C4 12.9055 4.21981 11.8623 4.61769 10.9121C2.55463 10.5032 1 8.68314 1 6.5C1 4.01472 3.01472 2 5.5 2C7.90278 2 9.86572 3.88317 9.9934 6.2541C10.6348 6.08809 11.3071 6 12 6C12.6929 6 13.3652 6.08809 14.0064 6.25368C14.1343 3.88317 16.0972 2 18.5 2Z")
  )
}
