/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * UploadLine icon from the Remix Icon library, System category.
 */
case class UploadLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * UploadLine icon component.
 *
 * @example UploadLine <> UploadLineProps(size = 24, color = "blue")
 */
def UploadLine = (props: UploadLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 19H21V21H3V19ZM13 5.82843V17H11V5.82843L4.92893 11.8995L3.51472 10.4853L12 2L20.4853 10.4853L19.0711 11.8995L13 5.82843Z")
  )
}
