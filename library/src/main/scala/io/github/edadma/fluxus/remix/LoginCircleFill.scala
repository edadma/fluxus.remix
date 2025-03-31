/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * LoginCircleFill icon from the Remix Icon library, System category.
 */
case class LoginCircleFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * LoginCircleFill icon component.
 *
 * @example LoginCircleFill <> LoginCircleFillProps(size = 24, color = "blue")
 */
def LoginCircleFill = (props: LoginCircleFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9.99945 11H2.04883C2.55055 5.94668 6.8141 2 11.9995 2C17.5223 2 21.9995 6.47715 21.9995 12C21.9995 17.5228 17.5223 22 11.9995 22C6.8141 22 2.55055 18.0533 2.04883 13H9.99945V16L14.9995 12L9.99945 8V11Z")
  )
}
