/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FilterOffLine icon from the Remix Icon library, System category.
 */
case class FilterOffLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FilterOffLine icon component.
 *
 * @example FilterOffLine <> FilterOffLineProps(size = 24, color = "blue")
 */
def FilterOffLine = (props: FilterOffLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6.92893 0.514648L21.0711 14.6568L19.6569 16.071L15.834 12.2486L15 13.4999V21.9999H9V13.4999L4 5.99993H3V3.99993L7.585 3.99965L5.51472 1.92886L6.92893 0.514648ZM9.585 5.99965L6.4037 5.99993L11 12.8944V19.9999H13V12.8944L14.392 10.8066L9.585 5.99965ZM21 3.99993V5.99993H20L18.085 8.87193L16.643 7.42893L17.5963 5.99993H15.213L13.213 3.99993H21Z")
  )
}
