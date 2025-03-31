/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CameraAiFill icon from the Remix Icon library, Media category.
 */
case class CameraAiFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CameraAiFill icon component.
 *
 * @example CameraAiFill <> CameraAiFillProps(size = 24, color = "blue")
 */
def CameraAiFill = (props: CameraAiFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.7134 8.12811L20.4668 8.69379C20.2864 9.10792 19.7136 9.10792 19.5331 8.69379L19.2866 8.12811C18.8471 7.11947 18.0555 6.31641 17.0677 5.87708L16.308 5.53922C15.8973 5.35653 15.8973 4.75881 16.308 4.57612L17.0252 4.25714C18.0384 3.80651 18.8442 2.97373 19.2761 1.93083L19.5293 1.31953C19.7058 0.893489 20.2942 0.893489 20.4706 1.31953L20.7238 1.93083C21.1558 2.97373 21.9616 3.80651 22.9748 4.25714L23.6919 4.57612C24.1027 4.75881 24.1027 5.35653 23.6919 5.53922L22.9323 5.87708C21.9445 6.31641 21.1529 7.11947 20.7134 8.12811ZM22 20V10.6586C21.3744 10.8797 20.7013 11 20 11C19.0753 11 18.1994 10.7908 17.4172 10.4172C17.7908 11.1994 18 12.0753 18 13C18 16.3137 15.3137 19 12 19C8.68629 19 6 16.3137 6 13C6 9.68629 8.68629 7 12 7C12.9247 7 13.8006 7.20919 14.5828 7.58283C14.2092 6.80057 14 5.92472 14 5C14 4.29873 14.1203 3.62556 14.3414 3H9L7 5H3C2.44772 5 2 5.44772 2 6V20C2 20.5523 2.44772 21 3 21H21C21.5523 21 22 20.5523 22 20ZM12 17C9.79086 17 8 15.2091 8 13C8 10.7909 9.79086 9 12 9C14.2091 9 16 10.7909 16 13C16 15.2091 14.2091 17 12 17Z")
  )
}
