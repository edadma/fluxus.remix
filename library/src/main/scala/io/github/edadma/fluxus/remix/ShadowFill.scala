/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ShadowFill icon from the Remix Icon library, Design category.
 */
case class ShadowFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ShadowFill icon component.
 *
 * @example ShadowFill <> ShadowFillProps(size = 24, color = "blue")
 */
def ShadowFill = (props: ShadowFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 3C2 2.44772 2.44772 2 3 2H17C17.5523 2 18 2.44772 18 3V6H21C21.5523 6 22 6.44772 22 7V21C22 21.5523 21.5523 22 21 22H7C6.44772 22 6 21.5523 6 21V18H3C2.44772 18 2 17.5523 2 17V3ZM8 18V20H11.4393L9.43934 18H8ZM11.5607 18L13.5607 20H16.4393L14.4393 18H11.5607ZM20 20V18.5607L18 16.5607V17C18 17.5523 17.5523 18 17 18H16.5607L18.5607 20H20ZM20 13.5607L18 11.5607V14.4393L20 16.4393V13.5607ZM20 11.4393V8H18V9.43934L20 11.4393Z")
  )
}
