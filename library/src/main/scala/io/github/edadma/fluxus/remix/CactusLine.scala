/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CactusLine icon from the Remix Icon library, Others category.
 */
case class CactusLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CactusLine icon component.
 *
 * @example CactusLine <> CactusLineProps(size = 24, color = "blue")
 */
def CactusLine = (props: CactusLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.998 2C14.2072 2 15.998 3.79086 15.998 6V15H16.998C17.548 15 17.998 14.55 17.998 14V8C17.998 7.44772 18.4458 7 18.998 7C19.5503 7 19.998 7.44772 19.998 8V14C19.998 15.66 18.658 17 16.998 17H15.998V20H17.998V22H5.99805V20H7.99805V14H6.99805C5.34119 14 3.99805 12.6569 3.99805 11V9C3.99805 8.44772 4.44576 8 4.99805 8C5.55033 8 5.99805 8.44772 5.99805 9V11C5.99805 11.55 6.44805 12 6.99805 12H7.99805V6C7.99805 3.79086 9.78891 2 11.998 2ZM11.998 4C10.8935 4 9.99805 4.89543 9.99805 6V20H13.998V6C13.998 4.89543 13.1026 4 11.998 4Z")
  )
}
