/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LineHeight2 icon from the Remix Icon library, Editor category.
 */
case class LineHeight2Props(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LineHeight2 icon component.
 *
 * @example LineHeight2 <> LineHeight2Props(size = 24, color = "blue")
 */
def LineHeight2 = (props: LineHeight2Props) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 3.00012L2.00008 5.00012L4.00004 5.00004L4.00004 19L2 19.0001L2.00008 21.0001L8.00004 21V19H6.00004L6.00004 5.00004L8 5.00012L8.00008 3.00012L2 3.00012ZM10.2 18H12.3541L13.5541 15H18.4459L19.6459 18H21.8L17 6H15L10.2 18ZM16 8.88517L17.6459 13H14.3541L16 8.88517Z")
  )
}
