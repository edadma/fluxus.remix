/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PokerDiamondsFill icon from the Remix Icon library, Others category.
 */
case class PokerDiamondsFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PokerDiamondsFill icon component.
 *
 * @example PokerDiamondsFill <> PokerDiamondsFillProps(size = 24, color = "blue")
 */
def PokerDiamondsFill = (props: PokerDiamondsFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M4.03607 10.7336L11.2259 1.94599C11.626 1.45697 12.3737 1.45697 12.7738 1.94599L19.9637 10.7336C20.5664 11.4703 20.5664 12.5298 19.9637 13.2665L12.7738 22.0541C12.3737 22.5431 11.626 22.5431 11.2259 22.0541L4.03607 13.2665C3.43329 12.5298 3.43329 11.4703 4.03607 10.7336Z")
  )
}
