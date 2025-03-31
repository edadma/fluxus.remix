/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FolderShieldFill icon from the Remix Icon library, Document category.
 */
case class FolderShieldFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FolderShieldFill icon component.
 *
 * @example FolderShieldFill <> FolderShieldFillProps(size = 24, color = "blue")
 */
def FolderShieldFill = (props: FolderShieldFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.4142 5H21C21.5523 5 22 5.44772 22 6V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H10.4142L12.4142 5ZM8 9V13.904C8 14.7956 8.4456 15.6282 9.18747 16.1228L12 17.9978L14.8125 16.1228C15.5544 15.6282 16 14.7956 16 13.904V9H8ZM10 13.904V11H14V13.904C14 14.1269 13.8886 14.335 13.7031 14.4587L12 15.5941L10.2969 14.4587C10.1114 14.335 10 14.1269 10 13.904Z")
  )
}
