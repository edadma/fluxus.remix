/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GraduationCapFill icon from the Remix Icon library, Others category.
 */
case class GraduationCapFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GraduationCapFill icon component.
 *
 * @example GraduationCapFill <> GraduationCapFillProps(size = 24, color = "blue")
 */
def GraduationCapFill = (props: GraduationCapFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 2 0 9 12 16 22 10.1667V17.5H24V9L12 2ZM3.99902 13.4905V18.0001C5.82344 20.429 8.72812 22.0001 11.9998 22.0001 15.2714 22.0001 18.1761 20.429 20.0005 18.0001L20.0001 13.4913 12.0003 18.1579 3.99902 13.4905Z")
  )
}
