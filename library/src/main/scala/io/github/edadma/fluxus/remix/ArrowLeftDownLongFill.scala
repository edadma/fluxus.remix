/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowLeftDownLongFill icon from the Remix Icon library, Arrows category.
 */
case class ArrowLeftDownLongFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowLeftDownLongFill icon component.
 *
 * @example ArrowLeftDownLongFill <> ArrowLeftDownLongFillProps(size = 24, color = "blue")
 */
def ArrowLeftDownLongFill = (props: ArrowLeftDownLongFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19.7783 5.63577L18.3643 4.22156L8.75734 13.8284L4.92896 10L4.92896 19.0711L14 19.0711L10.1716 15.2426L19.7783 5.63577Z")
  )
}
