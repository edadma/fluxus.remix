/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * JewelryFill icon from the Remix Icon library, Finance category.
 */
case class JewelryFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * JewelryFill icon component.
 *
 * @example JewelryFill <> JewelryFillProps(size = 24, color = "blue")
 */
def JewelryFill = (props: JewelryFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.0004 2.84711V4.86312C15.0004 5.25164 15.2255 5.605 15.5775 5.7693L15.9865 5.96013C15.9009 7.36343 15.4285 8.59569 14.7433 9.48646C13.985 10.4723 13.0066 11 12.0004 11C10.9942 11 10.0158 10.4723 9.25751 9.48646C8.57231 8.59569 8.09992 7.36343 8.01438 5.96013L8.42331 5.7693C8.77538 5.605 9.00042 5.25164 9.00042 4.86312V2.84711C9.00042 2.35827 9.35407 1.94216 9.83969 1.88611C11.2822 1.71961 12.7187 1.71961 14.1612 1.88611C14.6468 1.94216 15.0004 2.35827 15.0004 2.84711ZM6.09747 6.85469L2.8504 8.36999C2.10333 8.71862 1.77764 9.60481 2.12113 10.3542L6.59937 20.125C6.84375 20.6581 7.37646 21 7.96297 21H16.0379C16.6244 21 17.1571 20.6581 17.4015 20.125L21.8797 10.3542C22.2232 9.60481 21.8975 8.71862 21.1504 8.36999L17.9034 6.85469C17.6905 8.3225 17.1365 9.65563 16.3286 10.7059C15.4157 11.8926 14.1482 12.7481 12.6811 12.9529L14.189 15.0641C14.3753 15.3248 14.3753 15.6751 14.189 15.9359L12.2039 18.7152C12.1042 18.8548 11.8967 18.8548 11.797 18.7152L9.8118 15.9359C9.62554 15.6751 9.62554 15.3248 9.8118 15.0641L11.3198 12.9529C9.85266 12.7481 8.58516 11.8926 7.67227 10.7059C6.86438 9.65563 6.3103 8.3225 6.09747 6.85469Z")
  )
}
