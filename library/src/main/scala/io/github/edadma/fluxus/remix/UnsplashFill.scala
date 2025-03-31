/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * UnsplashFill icon from the Remix Icon library, Logos category.
 */
case class UnsplashFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * UnsplashFill icon component.
 *
 * @example UnsplashFill <> UnsplashFillProps(size = 24, color = "blue")
 */
def UnsplashFill = (props: UnsplashFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8.50098 11V16H15.501V11H21.001V21H3.00098V11H8.50098ZM15.501 3V8H8.50098V3H15.501Z")
  )
}
