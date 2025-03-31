/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PokerHeartsFill icon from the Remix Icon library, Others category.
 */
case class PokerHeartsFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PokerHeartsFill icon component.
 *
 * @example PokerHeartsFill <> PokerHeartsFillProps(size = 24, color = "blue")
 */
def PokerHeartsFill = (props: PokerHeartsFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 8.5C2 5.46243 4.46243 3 7.5 3C9.36016 3 11.0046 3.92345 12 5.33692C12.9954 3.92345 14.6398 3 16.5 3C19.5376 3 22 5.46243 22 8.5C22 16 11.9999 21.4852 11.9999 21.4852C11.9999 21.4852 2 16 2 8.5Z")
  )
}
