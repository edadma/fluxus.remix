/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LoopLeftFill icon from the Remix Icon library, System category.
 */
case class LoopLeftFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LoopLeftFill icon component.
 *
 * @example LoopLeftFill <> LoopLeftFillProps(size = 24, color = "blue")
 */
def LoopLeftFill = (props: LoopLeftFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 4C9.4095 4 7.10606 5.23053 5.64274 7.14274L8 9.5H2V3.5L4.21863 5.71863C6.05061 3.452 8.85558 2 12 2 17.5228 2 22 6.47715 22 12H20C20 7.58172 16.4183 4 12 4ZM4 12C4 16.4183 7.58172 20 12 20 14.5905 20 16.894 18.7695 18.3573 16.8573L16 14.5 22 14.5V20.5L19.7814 18.2814C17.9494 20.548 15.1444 22 12 22 6.47715 22 2 17.5228 2 12H4Z")
  )
}
