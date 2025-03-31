/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ScreenshotFill icon from the Remix Icon library, Design category.
 */
case class ScreenshotFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ScreenshotFill icon component.
 *
 * @example ScreenshotFill <> ScreenshotFillProps(size = 24, color = "blue")
 */
def ScreenshotFill = (props: ScreenshotFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.9926 14.4068L10.4406 15.9587C10.7959 16.5563 11 17.2543 11 18C11 20.2091 9.20914 22 7 22C4.79086 22 3 20.2091 3 18C3 15.7909 4.79086 14 7 14C7.73792 14 8.42917 14.1998 9.0226 14.5483L10.5783 12.9926L7.45406 9.86827C6.86827 9.28249 6.86827 8.33274 7.45406 7.74695L7.80761 7.3934L11.9926 11.5783L16.1819 7.38904L16.5354 7.74259C17.1212 8.32838 17.1212 9.27813 16.5354 9.86391L13.4068 12.9926L14.968 14.5538C15.5635 14.2019 16.2582 14 17 14C19.2091 14 21 15.7909 21 18C21 20.2091 19.2091 22 17 22C14.7909 22 13 20.2091 13 18C13 17.2582 13.2019 16.5635 13.5538 15.968L11.9926 14.4068ZM19 13V5H5V13H3V4C3 3.44772 3.44772 3 4 3H20C20.5523 3 21 3.44772 21 4V13H19ZM7 20C8.10457 20 9 19.1046 9 18C9 16.8954 8.10457 16 7 16C5.89543 16 5 16.8954 5 18C5 19.1046 5.89543 20 7 20ZM17 20C18.1046 20 19 19.1046 19 18C19 16.8954 18.1046 16 17 16C15.8954 16 15 16.8954 15 18C15 19.1046 15.8954 20 17 20Z")
  )
}
