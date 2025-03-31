/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MenuFold2Line icon from the Remix Icon library, System category.
 */
case class MenuFold2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MenuFold2Line icon component.
 *
 * @example MenuFold2Line <> MenuFold2LineProps(size = 24, color = "blue")
 */
def MenuFold2Line = (props: MenuFold2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.40347 3.90332L2.98926 5.31753L6.17124 8.49951L2.98926 11.6815L4.40347 13.0957L8.99967 8.49951L4.40347 3.90332ZM20.9997 19.9995V17.9995H2.99967V19.9995H20.9997ZM20.9997 12.9995V10.9995H11.9997V12.9995H20.9997ZM20.9997 5.99951V3.99951H11.9997V5.99951H20.9997Z")
  )
}
