/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GogglesFill icon from the Remix Icon library, Others category.
 */
case class GogglesFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GogglesFill icon component.
 *
 * @example GogglesFill <> GogglesFillProps(size = 24, color = "blue")
 */
def GogglesFill = (props: GogglesFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.95151 6.94243C7.08082 6.11818 9.75096 6 12 6C14.249 6 16.9192 6.11818 19.0485 6.94243C20.1296 7.36094 21.1294 7.98254 21.8583 8.91561C22.5975 9.86175 23 11.0541 23 12.5C23 13.9701 22.4751 15.4334 21.6205 16.5424C20.7689 17.6475 19.5033 18.5 18 18.5C16.5751 18.5 15.3437 17.7094 14.4251 17.1196C13.7195 16.6666 12.8833 16 12 16C11.1167 16 10.2804 16.6666 9.5749 17.1196C8.65627 17.7094 7.42486 18.5 6 18.5C4.49667 18.5 3.23108 17.6475 2.37947 16.5424C1.52489 15.4334 1 13.9701 1 12.5C1 11.0541 1.40249 9.86175 2.14166 8.91561C2.87062 7.98254 3.87036 7.36094 4.95151 6.94243Z")
  )
}
