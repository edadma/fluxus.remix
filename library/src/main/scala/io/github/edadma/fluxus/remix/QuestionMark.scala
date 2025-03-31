/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * QuestionMark icon from the Remix Icon library, Editor category.
 */
case class QuestionMarkProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * QuestionMark icon component.
 *
 * @example QuestionMark <> QuestionMarkProps(size = 24, color = "blue")
 */
def QuestionMark = (props: QuestionMarkProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 19C12.8284 19 13.5 19.6716 13.5 20.5C13.5 21.3284 12.8284 22 12 22C11.1716 22 10.5 21.3284 10.5 20.5C10.5 19.6716 11.1716 19 12 19ZM12 2C15.3137 2 18 4.68629 18 8C18 10.1646 17.2474 11.2907 15.3259 12.9231C13.3986 14.5604 13 15.2969 13 17H11C11 14.526 11.787 13.3052 14.031 11.3989C15.5479 10.1102 16 9.43374 16 8C16 5.79086 14.2091 4 12 4C9.79086 4 8 5.79086 8 8V9H6V8C6 4.68629 8.68629 2 12 2Z")
  )
}
