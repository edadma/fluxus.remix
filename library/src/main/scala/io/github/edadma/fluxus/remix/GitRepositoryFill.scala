/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GitRepositoryFill icon from the Remix Icon library, Development category.
 */
case class GitRepositoryFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GitRepositoryFill icon component.
 *
 * @example GitRepositoryFill <> GitRepositoryFillProps(size = 24, color = "blue")
 */
def GitRepositoryFill = (props: GitRepositoryFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 21V23.5L10 21.5L7 23.5V21H6.5C4.567 21 3 19.433 3 17.5V5C3 3.34315 4.34315 2 6 2H20C20.5523 2 21 2.44772 21 3V20C21 20.5523 20.5523 21 20 21H13ZM7 19V17H13V19H19V16H6.5C5.67157 16 5 16.6716 5 17.5C5 18.3284 5.67157 19 6.5 19H7ZM7 5V7H9V5H7ZM7 8V10H9V8H7ZM7 11V13H9V11H7Z")
  )
}
