/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CoreosLine icon from the Remix Icon library, Logos category.
 */
case class CoreosLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CoreosLine icon component.
 *
 * @example CoreosLine <> CoreosLineProps(size = 24, color = "blue")
 */
def CoreosLine = (props: CoreosLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9.45447 4.41393C8.31731 4.79453 7.24869 5.4376 6.34315 6.34315C3.21895 9.46734 3.21895 14.5327 6.34315 17.6569C9.46734 20.781 14.5327 20.781 17.6569 17.6569C18.6209 16.6929 19.2874 15.544 19.6565 14.3245C16.2563 15.7834 12.4077 16.3049 8.11091 15.8891C7.39961 11.7635 7.84746 7.93846 9.45447 4.41393ZM11.9023 4.00059C11.2268 5.21641 10.7129 6.47151 10.3605 7.76913C11.853 7.80085 13.3359 8.38618 14.4749 9.52513C15.5494 10.5997 16.1312 11.9804 16.2202 13.3864C17.5495 13.0447 18.8086 12.5666 19.9999 11.9528C19.9922 10.6417 19.6642 9.33223 19.016 8.15169C18.6567 7.49783 18.202 6.88829 17.6569 6.34315C17.0828 5.76913 16.4374 5.29549 15.7442 4.92788C14.5473 4.29366 13.2232 3.98456 11.9023 4.00059ZM4.92893 19.0711C1.02369 15.1658 1.02369 8.83418 4.92893 4.92893C8.83418 1.02369 15.1658 1.02369 19.0711 4.92893C22.9763 8.83418 22.9763 15.1658 19.0711 19.0711C15.1658 22.9763 8.83418 22.9763 4.92893 19.0711ZM9.94875 9.77776C9.75716 11.1407 9.73211 12.5491 9.87338 14.0066C11.3972 14.0679 12.8495 13.9948 14.2322 13.788C14.2374 12.7576 13.8469 11.7255 13.0607 10.9393C12.2075 10.0861 11.0647 9.69895 9.94875 9.77776Z")
  )
}
