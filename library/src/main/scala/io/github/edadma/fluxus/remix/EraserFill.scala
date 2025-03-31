/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * EraserFill icon from the Remix Icon library, Design category.
 */
case class EraserFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * EraserFill icon component.
 *
 * @example EraserFill <> EraserFillProps(size = 24, color = "blue")
 */
def EraserFill = (props: EraserFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.9999 18.9966H20.9999V20.9966H11.9999L8.00229 20.9991L1.51457 14.5113C1.12405 14.1208 1.12405 13.4877 1.51457 13.0971L12.1212 2.49053C12.5117 2.1 13.1449 2.1 13.5354 2.49053L21.3136 10.2687C21.7041 10.6592 21.7041 11.2924 21.3136 11.6829L13.9999 18.9966ZM15.6567 14.5113L19.1922 10.9758L12.8283 4.61185L9.29275 8.14738L15.6567 14.5113Z")
  )
}
