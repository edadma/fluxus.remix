/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BasketballLine icon from the Remix Icon library, Others category.
 */
case class BasketballLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BasketballLine icon component.
 *
 * @example BasketballLine <> BasketballLineProps(size = 24, color = "blue")
 */
def BasketballLine = (props: BasketballLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2ZM12.366 13.366L8.89708 19.376C9.85124 19.7779 10.8997 20 12 20C12.4622 20 12.9152 19.9608 13.3559 19.8856C13.0984 18.0632 13.3411 16.1601 14.1404 14.3917L12.366 13.366ZM15.8835 15.3974C15.3519 16.6567 15.1671 17.9943 15.2969 19.2905C16.5173 18.7384 17.5737 17.8888 18.3745 16.8346L15.8835 15.3974ZM8.85855 11.3422C7.7265 12.919 6.1993 14.0809 4.49366 14.7699C5.0255 16.2135 5.96211 17.4604 7.16543 18.3745L10.634 12.366L8.85855 11.3422ZM19.9616 11.2111L19.7038 11.3328C18.6197 11.8687 17.6478 12.6548 16.8834 13.6653L19.3756 15.1039C19.7777 14.1495 20 13.1007 20 12C20 11.7338 19.987 11.4706 19.9616 11.2111ZM4 12C4 12.2662 4.013 12.5294 4.03841 12.7889C5.22626 12.2534 6.29168 11.4249 7.11596 10.3355L4.62402 8.89708C4.22214 9.85124 4 10.8997 4 12ZM16.8346 5.62552L13.366 11.634L15.1407 12.6588C16.2731 11.0812 17.8009 9.91878 19.5073 9.22969C19.0134 7.89068 18.1702 6.71922 17.0884 5.82653L16.8346 5.62552ZM12 4C11.5375 4 11.0841 4.03925 10.6431 4.1146C10.9016 5.93748 10.6588 7.8408 9.85915 9.60931L11.634 10.634L15.1029 4.62402C14.1488 4.22214 13.1003 4 12 4ZM8.70313 4.70955L8.51189 4.79845C7.37266 5.35126 6.38436 6.16644 5.62552 7.16543L8.11608 8.60349C8.64798 7.34403 8.83295 6.00607 8.70313 4.70955Z")
  )
}
