/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DislikeFill icon from the Remix Icon library, Health & Medical category.
 */
case class DislikeFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DislikeFill icon component.
 *
 * @example DislikeFill <> DislikeFillProps(size = 24, color = "blue")
 */
def DislikeFill = (props: DislikeFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2.80777 1.3934L21.1925 19.7782L19.7783 21.1924L16.0316 17.4454L12 21.485L3.52154 12.993C1.48186 10.7094 1.49309 7.24014 3.55524 4.96959L1.39355 2.80762L2.80777 1.3934ZM20.2428 4.75736C22.5054 7.02472 22.5831 10.637 20.4788 12.993L18.8442 14.629L7.2604 3.04551C8.92926 2.83935 10.6682 3.33369 12.0011 4.52853C14.3502 2.42 17.9802 2.49 20.2428 4.75736Z")
  )
}
