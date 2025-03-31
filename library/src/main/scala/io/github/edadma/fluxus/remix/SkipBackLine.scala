/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SkipBackLine icon from the Remix Icon library, Media category.
 */
case class SkipBackLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SkipBackLine icon component.
 *
 * @example SkipBackLine <> SkipBackLineProps(size = 24, color = "blue")
 */
def SkipBackLine = (props: SkipBackLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 4C7.55228 4 8 4.44772 8 5V11.3333L18.2227 4.51823C18.4524 4.36506 18.7628 4.42714 18.916 4.65691C18.9708 4.73904 19 4.83555 19 4.93426V19.0657C19 19.3419 18.7761 19.5657 18.5 19.5657C18.4013 19.5657 18.3048 19.5365 18.2227 19.4818L8 12.6667V19C8 19.5523 7.55228 20 7 20C6.44772 20 6 19.5523 6 19V5C6 4.44772 6.44772 4 7 4ZM17 7.73703L10.6056 12L17 16.263V7.73703Z")
  )
}
