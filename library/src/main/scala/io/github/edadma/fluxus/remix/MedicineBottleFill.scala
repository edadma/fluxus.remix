/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MedicineBottleFill icon from the Remix Icon library, Health & Medical category.
 */
case class MedicineBottleFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MedicineBottleFill icon component.
 *
 * @example MedicineBottleFill <> MedicineBottleFillProps(size = 24, color = "blue")
 */
def MedicineBottleFill = (props: MedicineBottleFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 5V7C18.6569 7 20 8.34315 20 10V21C20 21.5523 19.5523 22 19 22H5C4.44772 22 4 21.5523 4 21V10C4 8.34315 5.34315 7 7 7V5H17ZM13 11H11V13H9V15H10.999L11 17H13L12.999 15H15V13H13V11ZM19 2V4H5V2H19Z")
  )
}
