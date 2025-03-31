/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * RewindLine icon from the Remix Icon library, Media category.
 */
case class RewindLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * RewindLine icon component.
 *
 * @example RewindLine <> RewindLineProps(size = 24, color = "blue")
 */
def RewindLine = (props: RewindLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 10.6667L21.2227 4.51823C21.4524 4.36506 21.7629 4.42714 21.9161 4.65691C21.9708 4.73904 22 4.83554 22 4.93426V19.0657C22 19.3419 21.7762 19.5657 21.5 19.5657C21.4013 19.5657 21.3048 19.5365 21.2227 19.4818L12 13.3333V19.0657C12 19.3419 11.7762 19.5657 11.5 19.5657C11.4013 19.5657 11.3048 19.5365 11.2227 19.4818L0.62407 12.416C0.394306 12.2628 0.332219 11.9524 0.485395 11.7226C0.522013 11.6677 0.569144 11.6206 0.62407 11.584L11.2227 4.51823C11.4524 4.36506 11.7629 4.42714 11.9161 4.65691C11.9708 4.73904 12 4.83554 12 4.93426V10.6667ZM10 16.263V7.73703L3.60558 12L10 16.263ZM20 16.263V7.73703L13.6056 12L20 16.263Z")
  )
}
