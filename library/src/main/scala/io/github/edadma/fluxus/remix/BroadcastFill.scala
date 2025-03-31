/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BroadcastFill icon from the Remix Icon library, Media category.
 */
case class BroadcastFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BroadcastFill icon component.
 *
 * @example BroadcastFill <> BroadcastFillProps(size = 24, color = "blue")
 */
def BroadcastFill = (props: BroadcastFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.92893 2.92896L6.34315 4.34317C4.89543 5.79088 4 7.79088 4 10C4 12.2092 4.89543 14.2092 6.34315 15.6569L4.92893 17.0711C3.11929 15.2614 2 12.7614 2 10C2 7.2386 3.11929 4.7386 4.92893 2.92896ZM19.0711 2.92896C20.8807 4.7386 22 7.2386 22 10C22 12.7614 20.8807 15.2614 19.0711 17.0711L17.6569 15.6569C19.1046 14.2092 20 12.2092 20 10C20 7.79088 19.1046 5.79088 17.6569 4.34317L19.0711 2.92896ZM7.75736 5.75738L9.17157 7.1716C8.44771 7.89545 8 8.89545 8 10C8 11.1046 8.44771 12.1046 9.17157 12.8285L7.75736 14.2427C6.67157 13.1569 6 11.6569 6 10C6 8.34317 6.67157 6.84317 7.75736 5.75738ZM16.2426 5.75738C17.3284 6.84317 18 8.34317 18 10C18 11.6569 17.3284 13.1569 16.2426 14.2427L14.8284 12.8285C15.5523 12.1046 16 11.1046 16 10C16 8.89545 15.5523 7.89545 14.8284 7.1716L16.2426 5.75738ZM12 12C10.8954 12 10 11.1046 10 10C10 8.89545 10.8954 8.00002 12 8.00002C13.1046 8.00002 14 8.89545 14 10C14 11.1046 13.1046 12 12 12ZM12 14C12.5798 14 13.0774 14.413 13.1843 14.9829L14.5 22H9.5L10.8157 14.9829C10.9226 14.413 11.4202 14 12 14Z")
  )
}
