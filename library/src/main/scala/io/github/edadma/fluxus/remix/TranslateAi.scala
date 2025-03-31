/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TranslateAi icon from the Remix Icon library, Editor category.
 */
case class TranslateAiProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TranslateAi icon component.
 *
 * @example TranslateAi <> TranslateAiProps(size = 24, color = "blue")
 */
def TranslateAi = (props: TranslateAiProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19.7134 8.12811L19.4668 8.69379C19.2864 9.10792 18.7136 9.10792 18.5331 8.69379L18.2866 8.12811C17.8471 7.11947 17.0555 6.31641 16.0677 5.87708L15.308 5.53922C14.8973 5.35653 14.8973 4.75881 15.308 4.57612L16.0252 4.25714C17.0384 3.80651 17.8442 2.97373 18.2761 1.93083L18.5293 1.31953C18.7058 0.893489 19.2942 0.893489 19.4706 1.31953L19.7238 1.93083C20.1558 2.97373 20.9616 3.80651 21.9748 4.25714L22.6919 4.57612C23.1027 4.75881 23.1027 5.35653 22.6919 5.53922L21.9323 5.87708C20.9445 6.31641 20.1529 7.11947 19.7134 8.12811ZM5 17V15H3V17C3 19.2091 4.79086 21 7 21H10V19H7L6.85074 18.9945C5.81588 18.9182 5 18.0544 5 17ZM22.4 21L18 10H16L11.601 21H13.755L14.954 18H19.044L20.245 21H22.4ZM15.753 16L17 12.8852L18.245 16H15.753ZM8 4V2H6V4H2V11H6V14H8V11H12V4H8ZM4 6H6V9H4V6ZM8 6H10V9H8V6Z")
  )
}
