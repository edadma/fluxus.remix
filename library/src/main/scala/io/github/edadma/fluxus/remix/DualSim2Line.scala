/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DualSim2Line icon from the Remix Icon library, Device category.
 */
case class DualSim2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DualSim2Line icon component.
 *
 * @example DualSim2Line <> DualSim2LineProps(size = 24, color = "blue")
 */
def DualSim2Line = (props: DualSim2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15 2L19.7071 6.70711C19.8946 6.89464 20 7.149 20 7.41421V21C20 21.5523 19.5523 22 19 22H5C4.44772 22 4 21.5523 4 21V3C4 2.44772 4.44772 2 5 2H15ZM14.171 4H6V20H18V7.829L14.171 4ZM12 7.5C13.6569 7.5 15 8.84315 15 10.5C15 11.3841 14.6175 12.179 14.009 12.728L14.0013 12.72L14.0074 12.7294L12.5953 14H15V16H9L8.99926 14.547L12.6691 11.2431C12.8723 11.06 13 10.7949 13 10.5C13 9.94772 12.5523 9.5 12 9.5C11.4477 9.5 11 9.94772 11 10.5H9C9 8.84315 10.3431 7.5 12 7.5Z")
  )
}
