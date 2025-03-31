/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Formula icon from the Remix Icon library, Editor category.
 */
case class FormulaProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Formula icon component.
 *
 * @example Formula <> FormulaProps(size = 24, color = "blue")
 */
def Formula = (props: FormulaProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10 2C7.79086 2 6 3.79086 6 6V9H3V11H6V18C6 19.1046 5.10457 20 4 20H3V22H4C6.20914 22 8 20.2091 8 18V11H11V9H8V6C8 4.89543 8.89543 4 10 4H11V2H10ZM15.2022 16.9971L11.8907 21H14.4864L16.5 18.5659L18.5137 21H21.1093L17.7979 16.9971L21.1046 13H18.5089L16.5 15.4283L14.4912 13H11.8955L15.2022 16.9971Z")
  )
}
