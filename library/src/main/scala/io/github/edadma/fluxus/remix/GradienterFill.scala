/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GradienterFill icon from the Remix Icon library, Device category.
 */
case class GradienterFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GradienterFill icon component.
 *
 * @example GradienterFill <> GradienterFillProps(size = 24, color = "blue")
 */
def GradienterFill = (props: GradienterFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22ZM8.12602 11H4.06189C4.02104 11.3276 4 11.6613 4 12C4 12.3387 4.02104 12.6724 4.06189 13H8.12602C8.04375 12.6804 8 12.3453 8 12C8 11.6547 8.04375 11.3196 8.12602 11ZM15.874 11C15.9562 11.3196 16 11.6547 16 12C16 12.3453 15.9562 12.6804 15.874 13H19.9381C19.979 12.6724 20 12.3387 20 12C20 11.6613 19.979 11.3276 19.9381 11H15.874ZM12 14C13.1046 14 14 13.1046 14 12C14 10.8954 13.1046 10 12 10C10.8954 10 10 10.8954 10 12C10 13.1046 10.8954 14 12 14Z")
  )
}
