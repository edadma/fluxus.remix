/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PlayList2Line icon from the Remix Icon library, Media category.
 */
case class PlayList2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PlayList2Line icon component.
 *
 * @example PlayList2Line <> PlayList2LineProps(size = 24, color = "blue")
 */
def PlayList2Line = (props: PlayList2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M22 18V20H2V18H22ZM2 3.5L10 8.5L2 13.5V3.5ZM22 11V13H12V11H22ZM4 7.1085V9.8915L6.22641 8.5L4 7.1085ZM22 4V6H12V4H22Z")
  )
}
