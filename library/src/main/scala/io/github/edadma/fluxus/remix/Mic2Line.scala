/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Mic2Line icon from the Remix Icon library, Media category.
 */
case class Mic2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Mic2Line icon component.
 *
 * @example Mic2Line <> Mic2LineProps(size = 24, color = "blue")
 */
def Mic2Line = (props: Mic2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0001 3C10.3432 3 9.00008 4.34315 9.00008 6V12C9.00008 13.6569 10.3432 15 12.0001 15C13.6569 15 15.0001 13.6569 15.0001 12V6C15.0001 4.34315 13.6569 3 12.0001 3ZM12.0001 1C14.7615 1 17.0001 3.23858 17.0001 6V12C17.0001 14.7614 14.7615 17 12.0001 17C9.23865 17 7.00008 14.7614 7.00008 12V6C7.00008 3.23858 9.23865 1 12.0001 1ZM2.19238 13.9615L4.15392 13.5692C4.88321 17.2361 8.11888 20 12.0001 20C15.8813 20 19.1169 17.2361 19.8462 13.5692L21.8078 13.9615C20.8961 18.5452 16.8516 22 12.0001 22C7.14858 22 3.104 18.5452 2.19238 13.9615Z")
  )
}
