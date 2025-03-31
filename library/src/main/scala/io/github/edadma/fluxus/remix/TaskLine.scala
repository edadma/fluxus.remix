/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TaskLine icon from the Remix Icon library, Document category.
 */
case class TaskLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TaskLine icon component.
 *
 * @example TaskLine <> TaskLineProps(size = 24, color = "blue")
 */
def TaskLine = (props: TaskLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19 4H5V20H19V4ZM3 2.9918C3 2.44405 3.44749 2 3.9985 2H19.9997C20.5519 2 20.9996 2.44772 20.9997 3L21 20.9925C21 21.5489 20.5551 22 20.0066 22H3.9934C3.44476 22 3 21.5447 3 21.0082V2.9918ZM11.2929 13.1213L15.5355 8.87868L16.9497 10.2929L11.2929 15.9497L7.40381 12.0607L8.81802 10.6464L11.2929 13.1213Z")
  )
}
