/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DualSim1Fill icon from the Remix Icon library, Device category.
 */
case class DualSim1FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DualSim1Fill icon component.
 *
 * @example DualSim1Fill <> DualSim1FillProps(size = 24, color = "blue")
 */
def DualSim1Fill = (props: DualSim1FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 2L19.7071 6.70711C19.8946 6.89464 20 7.149 20 7.41421V21C20 21.5523 19.5523 22 19 22H5C4.44772 22 4 21.5523 4 21V3C4 2.44772 4.44772 2 5 2H15ZM13 8H10V10H11V16H13V8Z")
  )
}
