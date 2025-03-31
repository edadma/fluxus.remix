/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * RewindStartMiniLine icon from the Remix Icon library, Media category.
 */
case class RewindStartMiniLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * RewindStartMiniLine icon component.
 *
 * @example RewindStartMiniLine <> RewindStartMiniLineProps(size = 24, color = "blue")
 */
def RewindStartMiniLine = (props: RewindStartMiniLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 6C2.44772 6 2 6.44771 2 7V17C2 17.5523 2.44772 18 3 18C3.55228 18 4 17.5523 4 17V7C4 6.44772 3.55228 6 3 6ZM7.96831 11.9999L11.0002 9.85972V14.14L7.96831 11.9999ZM12.2119 17.4434C12.4375 17.6027 12.7494 17.5489 12.9087 17.3233C12.9682 17.2389 13.0002 17.1382 13.0002 17.0349V6.96484C13.0002 6.6887 12.7763 6.46484 12.5002 6.46484C12.3969 6.46484 12.2962 6.49681 12.2119 6.55636L5.07889 11.5914C4.85329 11.7506 4.7995 12.0626 4.95874 12.2882C4.99164 12.3348 5.03228 12.3755 5.07889 12.4084L12.2119 17.4434ZM16.9683 11.9999L20.0002 9.85972V14.14L16.9683 11.9999ZM13.9587 12.2882C13.9916 12.3348 14.0323 12.3755 14.0789 12.4084L21.2119 17.4434C21.4375 17.6027 21.7494 17.5489 21.9087 17.3233C21.9682 17.2389 22.0002 17.1382 22.0002 17.0349V6.96484C22.0002 6.6887 21.7763 6.46484 21.5002 6.46484C21.3969 6.46484 21.2962 6.49681 21.2119 6.55636L14.0789 11.5914C13.8533 11.7506 13.7995 12.0626 13.9587 12.2882Z")
  )
}
