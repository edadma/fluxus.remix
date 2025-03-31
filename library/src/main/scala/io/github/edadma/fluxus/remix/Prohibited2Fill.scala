/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Prohibited2Fill icon from the Remix Icon library, System category.
 */
case class Prohibited2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Prohibited2Fill icon component.
 *
 * @example Prohibited2Fill <> Prohibited2FillProps(size = 24, color = "blue")
 */
def Prohibited2Fill = (props: Prohibited2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.25705 18.3287C2.84636 16.6049 2 14.4013 2 12C2 6.47715 6.47715 2 12 2C14.4013 2 16.6049 2.84637 18.3287 4.25705L4.25705 18.3287ZM19.7429 5.67127C21.1536 7.39514 22 9.59873 22 12C22 17.5228 17.5228 22 12 22C9.59873 22 7.39514 21.1536 5.67127 19.7429L19.7429 5.67127Z")
  )
}
