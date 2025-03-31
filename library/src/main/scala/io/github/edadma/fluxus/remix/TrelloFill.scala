/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TrelloFill icon from the Remix Icon library, Logos category.
 */
case class TrelloFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TrelloFill icon component.
 *
 * @example TrelloFill <> TrelloFillProps(size = 24, color = "blue")
 */
def TrelloFill = (props: TrelloFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5.25098 3H18.751C19.993 3 21.001 4.00737 21.001 5.25V18.75C21.001 19.992 19.9935 21 18.751 21H5.25098C4.00898 21 3.00098 19.9925 3.00098 18.75V5.25C3.00098 4.008 4.00835 3 5.25098 3ZM13.171 6.42054V12.1795C13.171 12.7762 13.6545 13.26 14.2507 13.26H17.5812C18.1776 13.26 18.661 12.7765 18.661 12.1795V6.42054C18.661 5.82384 18.1774 5.34 17.5812 5.34H14.2507C13.6543 5.34 13.171 5.82348 13.171 6.42054ZM5.34098 6.42045V16.6796C5.34098 17.2762 5.82455 17.76 6.42071 17.76H9.75125C10.3476 17.76 10.831 17.277 10.831 16.6796V6.42045C10.831 5.82375 10.3474 5.34 9.75125 5.34H6.42071C5.82428 5.34 5.34098 5.82303 5.34098 6.42045Z")
  )
}
