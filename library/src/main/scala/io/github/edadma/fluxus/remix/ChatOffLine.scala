/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ChatOffLine icon from the Remix Icon library, Communication category.
 */
case class ChatOffLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ChatOffLine icon component.
 *
 * @example ChatOffLine <> ChatOffLineProps(size = 24, color = "blue")
 */
def ChatOffLine = (props: ChatOffLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2.80777 1.3934L22.6068 21.1924L21.1925 22.6066L17.5846 18.9994L6.45516 19L2.00016 22.5V4C2.00016 3.8307 2.04223 3.67123 2.11649 3.53146L1.39355 2.80762L2.80777 1.3934ZM3.99955 5.4134L4.00016 18.3853L5.76349 17L15.5846 16.9994L3.99955 5.4134ZM21.0002 3C21.5524 3 22.0002 3.44772 22.0002 4V17.785L20.0002 15.785V5L9.21316 4.999L7.21416 3H21.0002Z")
  )
}
