/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ParentLine icon from the Remix Icon library, User & Faces category.
 */
case class ParentLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ParentLine icon component.
 *
 * @example ParentLine <> ParentLineProps(size = 24, color = "blue")
 */
def ParentLine = (props: ParentLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 9C8.38071 9 9.5 7.88071 9.5 6.5C9.5 5.11929 8.38071 4 7 4C5.61929 4 4.5 5.11929 4.5 6.5C4.5 7.88071 5.61929 9 7 9ZM7 11C4.51472 11 2.5 8.98528 2.5 6.5C2.5 4.01472 4.51472 2 7 2C9.48528 2 11.5 4.01472 11.5 6.5C11.5 8.98528 9.48528 11 7 11ZM17.5 13C18.6046 13 19.5 12.1046 19.5 11C19.5 9.89543 18.6046 9 17.5 9C16.3954 9 15.5 9.89543 15.5 11C15.5 12.1046 16.3954 13 17.5 13ZM17.5 15C15.2909 15 13.5 13.2091 13.5 11C13.5 8.79086 15.2909 7 17.5 7C19.7091 7 21.5 8.79086 21.5 11C21.5 13.2091 19.7091 15 17.5 15ZM20 21V20.5C20 19.1193 18.8807 18 17.5 18C16.1193 18 15 19.1193 15 20.5V21H13V20.5C13 18.0147 15.0147 16 17.5 16C19.9853 16 22 18.0147 22 20.5V21H20ZM10 21V17C10 15.3431 8.65685 14 7 14C5.34315 14 4 15.3431 4 17V21H2V17C2 14.2386 4.23858 12 7 12C9.76142 12 12 14.2386 12 17V21H10Z")
  )
}
