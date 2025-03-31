/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Forbid2Fill icon from the Remix Icon library, System category.
 */
case class Forbid2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Forbid2Fill icon component.
 *
 * @example Forbid2Fill <> Forbid2FillProps(size = 24, color = "blue")
 */
def Forbid2Fill = (props: Forbid2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22ZM16.8911 8.52313C16.6997 8.25459 16.4836 7.99828 16.2426 7.75736C16.0017 7.51644 15.7454 7.30029 15.4769 7.10891L7.10891 15.4769C7.30029 15.7454 7.51644 16.0017 7.75736 16.2426C7.99828 16.4836 8.25459 16.6997 8.52313 16.8911L16.8911 8.52313Z")
  )
}
