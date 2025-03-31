/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MailVolumeLine icon from the Remix Icon library, Business category.
 */
case class MailVolumeLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MailVolumeLine icon component.
 *
 * @example MailVolumeLine <> MailVolumeLineProps(size = 24, color = "blue")
 */
def MailVolumeLine = (props: MailVolumeLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20 14.5V23.5L16.667 21H14V17H16.667L20 14.5ZM21 3C21.5523 3 22 3.44772 22 4V13H20V7.237L12.0718 14.338L4 7.215V19H12V21H3C2.44772 21 2 20.5523 2 20V4C2 3.44772 2.44772 3 3 3H21ZM21 17C22.1046 17 23 17.8954 23 19C23 20.0544 22.1841 20.9182 21.1493 20.9945L21 21V17ZM19.5 5H4.511L12.061 11.662L19.5 5Z")
  )
}
