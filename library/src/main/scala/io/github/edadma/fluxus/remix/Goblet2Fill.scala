/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Goblet2Fill icon from the Remix Icon library, Food category.
 */
case class Goblet2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Goblet2Fill icon component.
 *
 * @example Goblet2Fill <> Goblet2FillProps(size = 24, color = "blue")
 */
def Goblet2Fill = (props: Goblet2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6.13317 2L5.01052 9.85858C4.70849 11.9728 5.53231 13.7891 6.89117 15.0465C7.99601 16.0688 9.45948 16.7319 11.0005 16.9343V20H6.00047V22H18.0005V20H13.0005V16.9343C14.5415 16.7319 16.0049 16.0688 17.1098 15.0465C18.4686 13.7891 19.2924 11.9728 18.9904 9.85858L17.8678 2H6.13317ZM10.0003 7C9.16936 7.00013 8.16238 7.24244 7.37122 7.47579L7.86776 4H16.1332L16.6234 7.4314C15.7848 7.70691 14.8897 8 14.0005 8C12.6083 8 11.4276 6.99978 10.0003 7Z")
  )
}
