/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TicketLine icon from the Remix Icon library, Finance category.
 */
case class TicketLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TicketLine icon component.
 *
 * @example TicketLine <> TicketLineProps(size = 24, color = "blue")
 */
def TicketLine = (props: TicketLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21.0049 2.99979C21.5572 2.99979 22.0049 3.4475 22.0049 3.99979V9.49979C20.6242 9.49979 19.5049 10.6191 19.5049 11.9998C19.5049 13.3805 20.6242 14.4998 22.0049 14.4998V19.9998C22.0049 20.5521 21.5572 20.9998 21.0049 20.9998H3.00488C2.4526 20.9998 2.00488 20.5521 2.00488 19.9998V14.4998C3.38559 14.4998 4.50488 13.3805 4.50488 11.9998C4.50488 10.6191 3.38559 9.49979 2.00488 9.49979V3.99979C2.00488 3.4475 2.4526 2.99979 3.00488 2.99979H21.0049ZM20.0049 4.99979H4.00488V7.96779L4.16077 8.04886C5.49935 8.78084 6.42516 10.1733 6.49998 11.788L6.50488 11.9998C6.50488 13.704 5.55755 15.1869 4.16077 15.9507L4.00488 16.0308V18.9998H20.0049V16.0308L19.849 15.9507C18.5104 15.2187 17.5846 13.8263 17.5098 12.2116L17.5049 11.9998C17.5049 10.2956 18.4522 8.81266 19.849 8.04886L20.0049 7.96779V4.99979Z")
  )
}
