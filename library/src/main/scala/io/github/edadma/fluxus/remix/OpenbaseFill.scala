/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * OpenbaseFill icon from the Remix Icon library, Logos category.
 */
case class OpenbaseFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * OpenbaseFill icon component.
 *
 * @example OpenbaseFill <> OpenbaseFillProps(size = 24, color = "blue")
 */
def OpenbaseFill = (props: OpenbaseFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12.0001 2.76001L21.9992 5.996L21.1001 15.464L12.0001 22.3235L2.90012 15.46L2.01074 6.00001L12.0001 2.76001ZM12.0001 3.58535L3.18898 6.43501L12.0001 20.7932L20.8058 6.43501L12.0001 3.58535Z")
  )
}
