/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftDownFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftDownFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftDownFill icon component.
 *
 * @example ArrowLeftDownFill <> ArrowLeftDownFillProps(size = 24, color = "blue")
 */
def ArrowLeftDownFill = (props: ArrowLeftDownFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.3608 13.0515L17.3105 18.0013H5.99683V6.68758L10.9466 11.6373L16.6034 5.98047L18.0176 7.39468L12.3608 13.0515Z")
  )
}
