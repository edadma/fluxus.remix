/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Settings6Line icon from the Remix Icon library, System category.
 */
case class Settings6LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Settings6Line icon component.
 *
 * @example Settings6Line <> Settings6LineProps(size = 24, color = "blue")
 */
def Settings6Line = (props: Settings6LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17.5 2.47363L23 11.9999L17.5 21.5262H6.5L1 11.9999L6.5 2.47363H17.5ZM16.3453 4.47363H7.6547L3.3094 11.9999L7.6547 19.5262H16.3453L20.6906 11.9999L16.3453 4.47363ZM8.63398 8.16979L10.366 7.16979L15.366 15.83L13.634 16.83L8.63398 8.16979Z")
  )
}
