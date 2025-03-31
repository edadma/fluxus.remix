/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftUpLongFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftUpLongFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftUpLongFill icon component.
 *
 * @example ArrowLeftUpLongFill <> ArrowLeftUpLongFillProps(size = 24, color = "blue")
 */
def ArrowLeftUpLongFill = (props: ArrowLeftUpLongFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M18.3642 19.7783L19.7784 18.3643L10.1716 8.75734L14 4.92896L4.92889 4.92896L4.9289 14L8.75735 10.1716L18.3642 19.7783Z")
  )
}
