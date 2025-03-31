/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CompassDiscoverFill icon from the Remix Icon library, Map category.
 */
case class CompassDiscoverFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CompassDiscoverFill icon component.
 *
 * @example CompassDiscoverFill <> CompassDiscoverFillProps(size = 24, color = "blue")
 */
def CompassDiscoverFill = (props: CompassDiscoverFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 22C7.47715 22 3 17.5228 3 12C3 6.47715 7.47715 2 13 2C18.5228 2 23 6.47715 23 12C23 17.5228 18.5228 22 13 22ZM8 11.5L12 13L13.5 17.0021L17 8L8 11.5Z")
  )
}
