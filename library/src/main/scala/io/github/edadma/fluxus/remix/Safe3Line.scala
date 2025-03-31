/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Safe3Line icon from the Remix Icon library, Finance category.
 */
case class Safe3LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Safe3Line icon component.
 *
 * @example Safe3Line <> Safe3LineProps(size = 24, color = "blue")
 */
def Safe3Line = (props: Safe3LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 4C2 3.44772 2.44772 3 3 3H21C21.5523 3 22 3.44772 22 4V19C22 19.5523 21.5523 20 21 20H20V22H18V20H6V22H4V20H3C2.44772 20 2 19.5523 2 19V4ZM4 18H5H19H20V5H4V18ZM15.3492 8.23642C14.2058 7.58767 12.7942 7.58767 11.6508 8.23642L10.318 6.90366L8.90381 8.31787L10.2366 9.65063C9.58781 10.794 9.58781 12.2057 10.2366 13.3491L8.90381 14.6818L10.318 16.096L11.6508 14.7633C12.7942 15.412 14.2058 15.412 15.3492 14.7633L16.682 16.096L18.0962 14.6818L16.7634 13.3491C17.4122 12.2057 17.4122 10.794 16.7634 9.65063L18.0962 8.31787L16.682 6.90366L15.3492 8.23642ZM14.7374 10.2624C15.4209 10.9458 15.4209 12.0539 14.7374 12.7373C14.054 13.4207 12.946 13.4207 12.2626 12.7373C11.5791 12.0539 11.5791 10.9458 12.2626 10.2624C12.946 9.579 14.054 9.579 14.7374 10.2624ZM5 8V15H7V8H5Z")
  )
}
