/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TShirtLine icon from the Remix Icon library, Others category.
 */
case class TShirtLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TShirtLine icon component.
 *
 * @example TShirtLine <> TShirtLineProps(size = 24, color = "blue")
 */
def TShirtLine = (props: TShirtLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14.5135 5.00008L17.1201 2.39348C17.5106 2.00295 18.1438 2.00295 18.5343 2.39348L22.777 6.63612C23.1675 7.02664 23.1675 7.65981 22.777 8.05033L18.9988 11.8285V21.0001C18.9988 21.5524 18.5511 22.0001 17.9988 22.0001H5.9988C5.44652 22.0001 4.9988 21.5524 4.9988 21.0001V11.8285L1.22063 8.05033C0.830103 7.65981 0.830103 7.02664 1.22063 6.63612L5.46327 2.39348C5.85379 2.00295 6.48696 2.00295 6.87748 2.39348L9.48408 5.00008H14.5135ZM15.3419 7.00008H8.65566L6.17037 4.5148L3.34195 7.34323L6.9988 11.0001V20.0001H16.9988V11.0001L20.6557 7.34323L17.8272 4.5148L15.3419 7.00008Z")
  )
}
