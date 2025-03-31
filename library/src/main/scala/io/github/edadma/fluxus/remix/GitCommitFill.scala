/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GitCommitFill icon from the Remix Icon library, Development category.
 */
case class GitCommitFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GitCommitFill icon component.
 *
 * @example GitCommitFill <> GitCommitFillProps(size = 24, color = "blue")
 */
def GitCommitFill = (props: GitCommitFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.874 13C15.4299 14.7252 13.8638 16 12 16C10.1362 16 8.57006 14.7252 8.12602 13H3V11H8.12602C8.57006 9.27477 10.1362 8 12 8C13.8638 8 15.4299 9.27477 15.874 11H21V13H15.874Z")
  )
}
