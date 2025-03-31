/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * VideoOffFill icon from the Remix Icon library, Media category.
 */
case class VideoOffFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * VideoOffFill icon component.
 *
 * @example VideoOffFill <> VideoOffFillProps(size = 24, color = "blue")
 */
def VideoOffFill = (props: VideoOffFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 18.4142L21.1925 22.6067L22.6067 21.1925L2.80769 1.39349L1.39348 2.80771L2.58579 4.00001H2C1.44772 4.00001 1 4.44773 1 5.00001V19C1 19.5523 1.44772 20 2 20H16C16.5523 20 17 19.5523 17 19V18.4142ZM16 4.00001H8.21402L22.7083 18.4943C22.8805 18.4153 23 18.2415 23 18.0397V5.96034C23 5.85776 22.9684 5.75765 22.9096 5.67361C22.7513 5.44739 22.4395 5.39237 22.2133 5.55073L17 9.20001V5.00001C17 4.44773 16.5523 4.00001 16 4.00001Z")
  )
}
