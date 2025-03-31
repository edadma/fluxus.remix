/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * EthLine icon from the Remix Icon library, Finance category.
 */
case class EthLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * EthLine icon component.
 *
 * @example EthLine <> EthLineProps(size = 24, color = "blue")
 */
def EthLine = (props: EthLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8.1488 15.3042L12 20.5996L15.8513 15.3042L12 17.6742L8.1488 15.3042ZM17.1374 12.1643L12 3.81608L6.86261 12.1643L12 15.3258L17.1374 12.1643ZM4 13L12 0L20 13L12.0001 24L4 13Z")
  )
}
