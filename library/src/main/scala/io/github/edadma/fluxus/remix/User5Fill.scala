/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * User5Fill icon from the Remix Icon library, User & Faces category.
 */
case class User5FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * User5Fill icon component.
 *
 * @example User5Fill <> User5FillProps(size = 24, color = "blue")
 */
def User5Fill = (props: User5FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7.38938 16.5386C5.33894 15.0901 4 12.7014 4 10C4 5.58172 7.58172 2 12 2C16.4183 2 20 5.58172 20 10C20 12.7014 18.6611 15.0901 16.6106 16.5386L18.6936 21.2996C18.8043 21.5526 18.6889 21.8474 18.4359 21.9581C18.3727 21.9857 18.3045 22 18.2355 22H5.76451C5.48837 22 5.26451 21.7761 5.26451 21.5C5.26451 21.431 5.27878 21.3628 5.30643 21.2996L7.38938 16.5386ZM8.11851 10.9704C8.55217 12.7106 10.1255 14 12 14C13.8745 14 15.4478 12.7106 15.8815 10.9704L13.9407 10.4852C13.7239 11.3553 12.9372 12 12 12C11.0628 12 10.2761 11.3553 10.0593 10.4852L8.11851 10.9704Z")
  )
}
