/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SingleQuotesR icon from the Remix Icon library, Editor category.
 */
case class SingleQuotesRProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SingleQuotesR icon component.
 *
 * @example SingleQuotesR <> SingleQuotesRProps(size = 24, color = "blue")
 */
def SingleQuotesR = (props: SingleQuotesRProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14.4167 6.67891C15.4469 7.77257 16.0001 9 16.0001 10.9897C16.0001 14.4891 13.5436 17.6263 9.96951 19.1768L9.07682 17.7992C12.4121 15.9946 13.0639 13.6539 13.3245 12.178C12.7875 12.4557 12.0845 12.5533 11.3954 12.4895C9.59102 12.3222 8.16895 10.8409 8.16895 9C8.16895 7.067 9.73595 5.5 11.6689 5.5C12.742 5.5 13.7681 5.99045 14.4167 6.67891Z")
  )
}
