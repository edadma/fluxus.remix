/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ContrastFill icon from the Remix Icon library, Design category.
 */
case class ContrastFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ContrastFill icon component.
 *
 * @example ContrastFill <> ContrastFillProps(size = 24, color = "blue")
 */
def ContrastFill = (props: ContrastFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 21.9967C6.47715 21.9967 2 17.5196 2 11.9967C2 6.47386 6.47715 1.9967 12 1.9967C17.5228 1.9967 22 6.47386 22 11.9967C22 17.5196 17.5228 21.9967 12 21.9967ZM12 19.9967V3.9967C7.58172 3.9967 4 7.57843 4 11.9967C4 16.415 7.58172 19.9967 12 19.9967Z")
  )
}
