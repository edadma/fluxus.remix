/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CloudWindyFill icon from the Remix Icon library, Weather category.
 */
case class CloudWindyFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CloudWindyFill icon component.
 *
 * @example CloudWindyFill <> CloudWindyFillProps(size = 24, color = "blue")
 */
def CloudWindyFill = (props: CloudWindyFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14 19V15.0069H2.07423C1.39109 13.8286 1 12.46 1 11C1 6.58172 4.58172 3 9 3C12.3949 3 15.2959 5.11466 16.4576 8.09864C16.7951 8.0339 17.1436 8 17.5 8C20.5376 8 23 10.4624 23 13.5C23 16.5376 20.5376 19 17.5 19H14ZM6 21H16V23H6V21ZM2 17H12V19H2V17Z")
  )
}
