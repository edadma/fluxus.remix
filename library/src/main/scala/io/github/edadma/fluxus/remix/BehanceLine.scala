/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BehanceLine icon from the Remix Icon library, Logos category.
 */
case class BehanceLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BehanceLine icon component.
 *
 * @example BehanceLine <> BehanceLineProps(size = 24, color = "blue")
 */
def BehanceLine = (props: BehanceLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7.5 11C8.60457 11 9.5 10.1046 9.5 9C9.5 7.89543 8.60457 7 7.5 7H3V11H7.5ZM8.5 13H3V17H8.5C9.60457 17 10.5 16.1046 10.5 15C10.5 13.8954 9.60457 13 8.5 13ZM10.5632 11.5725C11.7239 12.2726 12.5 13.5457 12.5 15C12.5 17.2091 10.7091 19 8.5 19H1V5H7.5C9.70914 5 11.5 6.79086 11.5 9C11.5 9.97964 11.1478 10.877 10.5632 11.5725ZM15.5 6H21V7.5H15.5V6ZM23 14.5H15.5V14.75C15.5 16.2688 16.7312 17.5 18.25 17.5C19.3187 17.5 20.245 16.8904 20.7001 16H22.8338C22.2851 18.0169 20.4407 19.5 18.25 19.5C15.6266 19.5 13.5 17.3734 13.5 14.75V13.25C13.5 10.6266 15.6266 8.5 18.25 8.5C20.8734 8.5 23 10.6266 23 13.25V14.5ZM20.8965 12.5C20.57 11.3457 19.5088 10.5 18.25 10.5C16.9912 10.5 15.93 11.3457 15.6035 12.5H20.8965Z")
  )
}
