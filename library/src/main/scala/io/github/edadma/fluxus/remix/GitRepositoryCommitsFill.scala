/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GitRepositoryCommitsFill icon from the Remix Icon library, Development category.
 */
case class GitRepositoryCommitsFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GitRepositoryCommitsFill icon component.
 *
 * @example GitRepositoryCommitsFill <> GitRepositoryCommitsFillProps(size = 24, color = "blue")
 */
def GitRepositoryCommitsFill = (props: GitRepositoryCommitsFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 17V23H12V17H9L13 12L17 17H14ZM16 19H19V16H18.2L13 9.5L7.64706 16H6.5C5.67157 16 5 16.6716 5 17.5C5 18.3284 5.67157 19 6.5 19H10V21H6.5C4.567 21 3 19.433 3 17.5V5C3 3.34315 4.34315 2 6 2H20C20.5523 2 21 2.44772 21 3V20C21 20.5523 20.5523 21 20 21H16V19ZM7 5V7H9V5H7ZM7 8V10H9V8H7Z")
  )
}
