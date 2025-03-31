/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Goblet2Line icon from the Remix Icon library, Food category.
 */
case class Goblet2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Goblet2Line icon component.
 *
 * @example Goblet2Line <> Goblet2LineProps(size = 24, color = "blue")
 */
def Goblet2Line = (props: Goblet2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6.13317 2L5.01052 9.85858C4.70849 11.9728 5.53231 13.7891 6.89117 15.0465C7.99601 16.0688 9.45948 16.7319 11.0005 16.9343V20H6.00047V22H18.0005V20H13.0005V16.9343C14.5415 16.7319 16.0049 16.0688 17.1098 15.0465C18.4686 13.7891 19.2924 11.9728 18.9904 9.85858L17.8678 2H6.13317ZM6.99042 10.1414L7.86776 4H16.1332L17.0105 10.1414C17.2085 11.5272 16.6892 12.7109 15.7514 13.5785C14.7968 14.4618 13.4178 15 12.0005 15C10.5831 15 9.20412 14.4618 8.24948 13.5785C7.31177 12.7109 6.79245 11.5272 6.99042 10.1414Z")
  )
}
