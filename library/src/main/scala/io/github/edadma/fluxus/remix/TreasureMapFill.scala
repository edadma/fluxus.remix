/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TreasureMapFill icon from the Remix Icon library, Map category.
 */
case class TreasureMapFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TreasureMapFill icon component.
 *
 * @example TreasureMapFill <> TreasureMapFillProps(size = 24, color = "blue")
 */
def TreasureMapFill = (props: TreasureMapFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 5L9 2L15 5L21.303 2.2987C21.5569 2.18992 21.8508 2.30749 21.9596 2.56131C21.9862 2.62355 22 2.69056 22 2.75827V19L15 22L9 19L2.69696 21.7013C2.44314 21.8101 2.14921 21.6925 2.04043 21.4387C2.01375 21.3765 2 21.3094 2 21.2417V5ZM6 11V13H8V11H6ZM10 11V13H12V11H10ZM16 10.9393L14.7626 9.7019L13.7019 10.7626L14.9393 12L13.7019 13.2374L14.7626 14.2981L16 13.0607L17.2374 14.2981L18.2981 13.2374L17.0607 12L18.2981 10.7626L17.2374 9.7019L16 10.9393Z")
  )
}
