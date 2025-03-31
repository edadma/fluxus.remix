/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * OctagonFill icon from the Remix Icon library, Design category.
 */
case class OctagonFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * OctagonFill icon component.
 *
 * @example OctagonFill <> OctagonFillProps(size = 24, color = "blue")
 */
def OctagonFill = (props: OctagonFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.936 2.50098L21.501 8.06595V15.936L15.936 21.501H8.06595L2.50098 15.936V8.06595L8.06595 2.50098H15.936Z")
  )
}
