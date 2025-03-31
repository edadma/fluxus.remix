/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TempColdFill icon from the Remix Icon library, Weather category.
 */
case class TempColdFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TempColdFill icon component.
 *
 * @example TempColdFill <> TempColdFillProps(size = 24, color = "blue")
 */
def TempColdFill = (props: TempColdFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 10.2547V5C8 2.79086 9.79086 1 12 1C14.2091 1 16 2.79086 16 5V10.2547C17.8135 11.5196 19 13.6213 19 16C19 19.866 15.866 23 12 23C8.13401 23 5 19.866 5 16C5 13.6213 6.18652 11.5196 8 10.2547ZM8 16C8 18.2091 9.79086 20 12 20C14.2091 20 16 18.2091 16 16H8Z")
  )
}
