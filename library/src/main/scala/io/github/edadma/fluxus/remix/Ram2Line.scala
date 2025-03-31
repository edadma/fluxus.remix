/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Ram2Line icon from the Remix Icon library, Device category.
 */
case class Ram2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Ram2Line icon component.
 *
 * @example Ram2Line <> Ram2LineProps(size = 24, color = "blue")
 */
def Ram2Line = (props: Ram2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 5C1.44772 5 1 5.44772 1 6V15C1 15.5523 1.44772 16 2 16V18C2 18.5523 2.44772 19 3 19H10.4142L11.4142 18H12.5858L13.5858 19H21C21.5523 19 22 18.5523 22 18V16C22.5523 16 23 15.5523 23 15V6C23 5.44772 22.5523 5 22 5H2ZM20 16V17H14.4142L13.4142 16H20ZM10.5858 16L9.58579 17H4V16H10.5858ZM3 14V7H21V14H3ZM5 9H7V12H5V9ZM11 9H9V12H11V9ZM13 9H15V12H13V9ZM19 9H17V12H19V9Z")
  )
}
