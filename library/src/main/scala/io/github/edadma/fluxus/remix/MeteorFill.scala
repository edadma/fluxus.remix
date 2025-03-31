/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MeteorFill icon from the Remix Icon library, Weather category.
 */
case class MeteorFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MeteorFill icon component.
 *
 * @example MeteorFill <> MeteorFillProps(size = 24, color = "blue")
 */
def MeteorFill = (props: MeteorFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 1V13C21 17.9706 16.9706 22 12 22C7.02944 22 3 17.9706 3 13C3 9.72064 4.75393 6.85093 7.37488 5.27777L14 1.453V4.223L21 1ZM12 8C9.23858 8 7 10.2386 7 13C7 15.7614 9.23858 18 12 18C14.7614 18 17 15.7614 17 13C17 10.2386 14.7614 8 12 8Z")
  )
}
