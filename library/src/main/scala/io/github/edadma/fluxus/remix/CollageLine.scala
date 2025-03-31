/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CollageLine icon from the Remix Icon library, Design category.
 */
case class CollageLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CollageLine icon component.
 *
 * @example CollageLine <> CollageLineProps(size = 24, color = "blue")
 */
def CollageLine = (props: CollageLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 3.10669C20.5523 3.10669 21 3.5544 21 4.10669V20.1067C21 20.659 20.5523 21.1067 20 21.1067H4C3.44772 21.1067 3 20.659 3 20.1067V4.10669C3 3.5544 3.44772 3.10669 4 3.10669H20ZM11.1888 13.2651L5 14.3557V19.1067H12.218L11.1888 13.2651ZM19 5.10669H11.781L14.249 19.1067H19V5.10669ZM9.75 5.10669H5V12.3247L10.8415 11.2955L9.75 5.10669Z")
  )
}
