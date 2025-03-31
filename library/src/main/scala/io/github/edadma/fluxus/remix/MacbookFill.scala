/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MacbookFill icon from the Remix Icon library, Device category.
 */
case class MacbookFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MacbookFill icon component.
 *
 * @example MacbookFill <> MacbookFillProps(size = 24, color = "blue")
 */
def MacbookFill = (props: MacbookFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 4.00685C2 3.45078 2.45531 3 2.9918 3H21.0082C21.556 3 22 3.44995 22 4.00685V17H2V4.00685ZM1 19H23V21H1V19Z")
  )
}
