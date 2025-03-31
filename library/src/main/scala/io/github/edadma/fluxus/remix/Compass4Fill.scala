/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Compass4Fill icon from the Remix Icon library, Map category.
 */
case class Compass4FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Compass4Fill icon component.
 *
 * @example Compass4Fill <> Compass4FillProps(size = 24, color = "blue")
 */
def Compass4Fill = (props: Compass4FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22ZM15.4462 9.96803C15.102 9.38559 14.6144 8.89798 14.032 8.55382L8.55382 14.032C8.89798 14.6144 9.38559 15.102 9.96803 15.4462L15.4462 9.96803Z")
  )
}
