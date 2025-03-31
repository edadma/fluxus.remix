/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GatsbyLine icon from the Remix Icon library, Logos category.
 */
case class GatsbyLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GatsbyLine icon component.
 *
 * @example GatsbyLine <> GatsbyLineProps(size = 24, color = "blue")
 */
def GatsbyLine = (props: GatsbyLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.7519 21.997C6.53059 21.8694 2.3017 17.7397 2.01626 12.559L2.00391 12.246L11.7519 21.997ZM12.0009 2C15.39 2 18.3854 3.68597 20.194 6.26495L18.556 7.41293C17.1092 5.3492 14.7126 4 12.0009 4C8.59784 4 5.69105 6.12484 4.53491 9.12017L14.8807 19.466C17.2681 18.5445 19.1025 16.5109 19.7488 14.0004L15.5009 14V12H22.0009C22.0009 16.7261 18.7223 20.6865 14.3155 21.7308L2.27013 9.68538C3.31443 5.27856 7.27479 2 12.0009 2Z")
  )
}
