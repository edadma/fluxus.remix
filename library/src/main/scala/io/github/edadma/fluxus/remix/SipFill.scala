/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SipFill icon from the Remix Icon library, Design category.
 */
case class SipFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SipFill icon component.
 *
 * @example SipFill <> SipFillProps(size = 24, color = "blue")
 */
def SipFill = (props: SipFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.9602 6.50108L16.7886 3.67265C17.1791 3.28213 17.8123 3.28213 18.2028 3.67265L20.3241 5.79397C20.7146 6.1845 20.7146 6.81766 20.3241 7.20819L17.4957 10.0366L19.2635 11.8044L17.8492 13.2186L10.7782 6.14753L12.1924 4.73331L13.9602 6.50108ZM10.7782 8.97596L15.0208 13.2186L7.24264 20.9968H3V16.7541L10.7782 8.97596Z")
  )
}
