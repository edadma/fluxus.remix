/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * EBike2Line icon from the Remix Icon library, Map category.
 */
case class EBike2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * EBike2Line icon component.
 *
 * @example EBike2Line <> EBike2LineProps(size = 24, color = "blue")
 */
def EBike2Line = (props: EBike2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16 1C16.5523 1 17 1.44772 17 2V3H22V9H19.9813L22.7271 16.5439C22.9033 16.9948 23 17.4856 23 17.999C23 20.2082 21.2091 21.999 19 21.999C17.1365 21.999 15.5707 20.7247 15.1263 19H10.874C10.4299 20.7252 8.86384 22 7 22C5.05551 22 3.43508 20.6125 3.07474 18.7736C2.43596 18.4396 2 17.7707 2 17V7C2 6.44772 2.44772 6 3 6H10C10.5523 6 11 6.44772 11 7V12C11 12.5523 11.4477 13 12 13H14C14.5523 13 15 12.5523 15 12V3H12V1H16ZM7 16C5.89543 16 5 16.8954 5 18C5 19.1046 5.89543 20 7 20C8.10457 20 9 19.1046 9 18C9 16.8954 8.10457 16 7 16ZM19 15.999C17.8954 15.999 17 16.8944 17 17.999C17 19.1036 17.8954 19.999 19 19.999C20.1046 19.999 21 19.1036 21 17.999C21 17.7587 20.9576 17.5282 20.8799 17.3148L20.8635 17.2714C20.5725 16.5266 19.8479 15.999 19 15.999ZM17.853 9H17V12C17 13.6569 15.6569 15 14 15H12C10.3431 15 9 13.6569 9 12H4V15.3542C4.73294 14.5238 5.80531 14 7 14C8.86384 14 10.4299 15.2748 10.874 17H15.1258C15.5695 15.2743 17.1358 13.999 19 13.999C19.2368 13.999 19.4688 14.0196 19.6943 14.0591L17.853 9ZM9 8H4V10H9V8ZM20 5H17V7H20V5Z")
  )
}
