/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ClosedCaptioningAiFill icon from the Remix Icon library, Media category.
 */
case class ClosedCaptioningAiFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ClosedCaptioningAiFill icon component.
 *
 * @example ClosedCaptioningAiFill <> ClosedCaptioningAiFillProps(size = 24, color = "blue")
 */
def ClosedCaptioningAiFill = (props: ClosedCaptioningAiFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.4668 8.69379L20.7134 8.12811C21.1529 7.11947 21.9445 6.31641 22.9323 5.87708L23.6919 5.53922C24.1027 5.35653 24.1027 4.75881 23.6919 4.57612L22.9748 4.25714C21.9616 3.80651 21.1558 2.97373 20.7238 1.93083L20.4706 1.31953C20.2942 0.893489 19.7058 0.893489 19.5293 1.31953L19.2761 1.93083C18.8442 2.97373 18.0384 3.80651 17.0252 4.25714L16.308 4.57612C15.8973 4.75881 15.8973 5.35653 16.308 5.53922L17.0677 5.87708C18.0555 6.31641 18.8471 7.11947 19.2866 8.12811L19.5331 8.69379C19.7136 9.10792 20.2864 9.10792 20.4668 8.69379ZM22 20V10.6586C21.3744 10.8797 20.7013 11 20 11C19.1201 11 18.2845 10.8106 17.5316 10.4703L17.4153 10.5866C17.0534 10.2241 16.553 10 16 10C14.895 10 14 10.895 14 12C14 13.105 14.895 14 16 14C16.5525 14 17.0525 13.7762 17.4144 13.4144L18.828 14.828C18.104 15.552 17.104 16 16 16C13.792 16 12 14.208 12 12C12 10.1752 13.224 8.63446 14.8953 8.1547C14.3277 7.23814 14 6.15734 14 5C14 4.29873 14.1203 3.62556 14.3414 3H3C2.44772 3 2 3.44772 2 4V20C2 20.5523 2.44772 21 3 21H21C21.5523 21 22 20.5523 22 20ZM9 8C10.1045 8 11.1049 8.44841 11.829 9.173L10.4153 10.5866C10.0483 10.22 9.55 10 9 10C7.895 10 7 10.895 7 12C7 13.105 7.895 14 9 14C9.5525 14 10.0525 13.7762 10.4144 13.4144L11.828 14.828C11.1 15.55 10.1 16 9 16C6.792 16 5 14.208 5 12C5 9.792 6.792 8 9 8Z")
  )
}
