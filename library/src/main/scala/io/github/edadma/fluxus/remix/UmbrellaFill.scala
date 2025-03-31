/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * UmbrellaFill icon from the Remix Icon library, Others category.
 */
case class UmbrellaFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * UmbrellaFill icon component.
 *
 * @example UmbrellaFill <> UmbrellaFillProps(size = 24, color = "blue")
 */
def UmbrellaFill = (props: UmbrellaFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.998 2.04938C18.0514 2.5511 21.998 6.81465 21.998 12V13H12.998V19C12.998 20.1046 13.8935 21 14.998 21C16.1026 21 16.998 20.1046 16.998 19V18H18.998V19C18.998 21.2091 17.2072 23 14.998 23C12.7889 23 10.998 21.2091 10.998 19V13H1.99805V12C1.99805 6.81465 5.94472 2.5511 10.998 2.04938V2C10.998 1.44772 11.4458 1 11.998 1C12.5503 1 12.998 1.44772 12.998 2V2.04938Z")
  )
}
