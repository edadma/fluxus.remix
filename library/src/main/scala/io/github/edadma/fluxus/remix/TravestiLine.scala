/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TravestiLine icon from the Remix Icon library, User & Faces category.
 */
case class TravestiLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TravestiLine icon component.
 *
 * @example TravestiLine <> TravestiLineProps(size = 24, color = "blue")
 */
def TravestiLine = (props: TravestiLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8.95126 8.53668C10.2131 7.57265 11.7898 7.00002 13.5004 7.00002C17.6425 7.00002 21.0004 10.3579 21.0004 14.5C21.0004 18.6422 17.6425 22 13.5004 22C9.35825 22 6.00038 18.6422 6.00038 14.5C6.00038 12.7895 6.57302 11.2127 7.53705 9.95089L4.66155 7.0754L2.18667 9.55027L0.772461 8.13606L7.13642 1.77209L8.55064 3.18631L6.07576 5.66118L8.95126 8.53668ZM13.5004 20C16.5379 20 19.0004 17.5376 19.0004 14.5C19.0004 11.4625 16.5379 9.00002 13.5004 9.00002C10.4628 9.00002 8.00038 11.4625 8.00038 14.5C8.00038 17.5376 10.4628 20 13.5004 20Z")
  )
}
