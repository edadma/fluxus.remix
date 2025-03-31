/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Ram2Fill icon from the Remix Icon library, Device category.
 */
case class Ram2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Ram2Fill icon component.
 *
 * @example Ram2Fill <> Ram2FillProps(size = 24, color = "blue")
 */
def Ram2Fill = (props: Ram2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 5H22C22.5523 5 23 5.44772 23 6V15C23 15.5523 22.5523 16 22 16V18C22 18.5523 21.5523 19 21 19H13.5858L12.5858 18H11.4142L10.4142 19H3C2.44772 19 2 18.5523 2 18L2 16C1.44772 16 1 15.5523 1 15V6C1 5.44771 1.44772 5 2 5ZM4 16V17H9.58579L10.5858 16H4ZM13.4142 16L14.4142 17H20V16H13.4142ZM7 9H5V12H7V9ZM9 9V12H11V9H9ZM15 9H13V12H15V9ZM17 9V12H19V9H17Z")
  )
}
