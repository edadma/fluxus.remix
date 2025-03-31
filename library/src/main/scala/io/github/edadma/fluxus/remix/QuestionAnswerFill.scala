/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * QuestionAnswerFill icon from the Remix Icon library, Communication category.
 */
case class QuestionAnswerFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * QuestionAnswerFill icon component.
 *
 * @example QuestionAnswerFill <> QuestionAnswerFillProps(size = 24, color = "blue")
 */
def QuestionAnswerFill = (props: QuestionAnswerFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 18H18.2372L20 19.3851V9H21C21.5523 9 22 9.44772 22 10V23.5L17.5455 20H9C8.44772 20 8 19.5523 8 19V18ZM5.45455 16L1 19.5V4C1 3.44772 1.44772 3 2 3H17C17.5523 3 18 3.44772 18 4V16H5.45455Z")
  )
}
