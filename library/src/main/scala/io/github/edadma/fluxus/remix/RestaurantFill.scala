/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * RestaurantFill icon from the Remix Icon library, Food category.
 */
case class RestaurantFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * RestaurantFill icon component.
 *
 * @example RestaurantFill <> RestaurantFillProps(size = 24, color = "blue")
 */
def RestaurantFill = (props: RestaurantFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 2V22H19V14H16V7C16 4.23858 18.2386 2 21 2ZM9 13.9V22H7V13.9C4.71776 13.4367 3 11.419 3 9V3H5V10H7V3H9V10H11V3H13V9C13 11.419 11.2822 13.4367 9 13.9Z")
  )
}
