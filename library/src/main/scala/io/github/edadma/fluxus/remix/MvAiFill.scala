/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MvAiFill icon from the Remix Icon library, Media category.
 */
case class MvAiFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MvAiFill icon component.
 *
 * @example MvAiFill <> MvAiFillProps(size = 24, color = "blue")
 */
def MvAiFill = (props: MvAiFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.4668 8.69379L20.7134 8.12811C21.1529 7.11947 21.9445 6.31641 22.9323 5.87708L23.6919 5.53922C24.1027 5.35653 24.1027 4.75881 23.6919 4.57612L22.9748 4.25714C21.9616 3.80651 21.1558 2.97373 20.7238 1.93083L20.4706 1.31953C20.2942 0.893489 19.7058 0.893489 19.5293 1.31953L19.2761 1.93083C18.8442 2.97373 18.0384 3.80651 17.0252 4.25714L16.308 4.57612C15.8973 4.75881 15.8973 5.35653 16.308 5.53922L17.0677 5.87708C18.0555 6.31641 18.8471 7.11947 19.2866 8.12811L19.5331 8.69379C19.7136 9.10792 20.2864 9.10792 20.4668 8.69379ZM20 11C20.7013 11 21.3744 10.8797 22 10.6586V20.0066C22 20.5552 21.5447 21 21.0082 21H2.9918C2.44405 21 2 20.5551 2 20.0066V3.9934C2 3.44476 2.45531 3 2.9918 3H14.3414C14.1203 3.62556 14 4.29873 14 5C14 5.34071 14.0284 5.67479 14.083 6H12V12.1707C11.6872 12.0602 11.3506 12 11 12C9.34315 12 8 13.3431 8 15C8 16.6569 9.34315 18 11 18C12.6569 18 14 16.6569 14 15V8H14.8027C15.8401 9.7934 17.7792 11 20 11Z")
  )
}
