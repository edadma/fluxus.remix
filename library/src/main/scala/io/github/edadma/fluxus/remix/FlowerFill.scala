/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FlowerFill icon from the Remix Icon library, Others category.
 */
case class FlowerFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FlowerFill icon component.
 *
 * @example FlowerFill <> FlowerFillProps(size = 24, color = "blue")
 */
def FlowerFill = (props: FlowerFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.455 2.30885L11.9998 2.07617L11.5447 2.30885C10.3952 2.89646 9.35317 3.6638 8.45557 4.57394C9.77392 5.26024 10.9693 6.15018 12.0001 7.20207C13.0308 6.15028 14.2261 5.26041 15.5443 4.57414C14.6466 3.66391 13.6045 2.8965 12.455 2.30885ZM10.6993 8.73433C8.98925 6.93503 6.72625 5.66541 4.18066 5.19783L3 4.98096V13.0002C3 16.8047 5.36065 20.0579 8.69711 21.3748C8.24472 19.9984 8 18.5278 8 17C8 13.9083 9.00215 11.0507 10.6993 8.73433ZM21 4.98096L19.8193 5.19783C14.233 6.22396 10 11.1168 10 17.0002C10 18.5362 10.2891 20.0071 10.8167 21.3598L11.0569 21.9754C11.3711 21.9852 11.6856 22.0002 12 22.0002C16.9706 22.0002 21 17.9708 21 13.0002V4.98096Z")
  )
}
