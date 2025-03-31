/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * StickyNote2Fill icon from the Remix Icon library, Document category.
 */
case class StickyNote2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * StickyNote2Fill icon component.
 *
 * @example StickyNote2Fill <> StickyNote2FillProps(size = 24, color = "blue")
 */
def StickyNote2Fill = (props: StickyNote2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 16L15.9968 21H3.99826C3.44694 21 3 20.5551 3 20.0066V3.9934C3 3.44476 3.44495 3 3.9934 3H20.0066C20.5552 3 21 3.44749 21 3.9985V16Z")
  )
}
