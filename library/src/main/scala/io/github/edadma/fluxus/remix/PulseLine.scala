/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PulseLine icon from the Remix Icon library, Health & Medical category.
 */
case class PulseLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PulseLine icon component.
 *
 * @example PulseLine <> PulseLineProps(size = 24, color = "blue")
 */
def PulseLine = (props: PulseLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9 7.53861L15 21.5386L18.6594 13H23V11H17.3406L15 16.4614L9 2.46143L5.3406 11H1V13H6.6594L9 7.53861Z")
  )
}
