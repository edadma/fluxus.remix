/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FirebaseFill icon from the Remix Icon library, Logos category.
 */
case class FirebaseFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FirebaseFill icon component.
 *
 * @example FirebaseFill <> FirebaseFillProps(size = 24, color = "blue")
 */
def FirebaseFill = (props: FirebaseFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6.75651 1.50129L4 18.4998L4.00007 18.4998L9.47342 4.81645L7.69485 1.35292C7.47439 0.923595 6.83377 1.02489 6.75651 1.50129ZM11.5638 4.31793L4.00008 18.4998L4.00012 18.4999L13.8396 6.94912L12.4412 4.32699C12.2546 3.9771 11.7558 3.97408 11.5638 4.31793ZM10.94 22.8373L4.00013 18.4999L17.31 5.66535C17.6037 5.39537 18.0834 5.56273 18.1424 5.96076L20 18.4998L13.06 22.8373C12.4115 23.2426 11.5885 23.2426 10.94 22.8373Z")
  )
}
