/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FlutterFill icon from the Remix Icon library, Logos category.
 */
case class FlutterFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FlutterFill icon component.
 *
 * @example FlutterFill <> FlutterFillProps(size = 24, color = "blue")
 */
def FlutterFill = (props: FlutterFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13.5039 2.00098L3.50391 12.001L6.58724 15.0843L19.6673 2.00098H13.5039ZM13.4985 11.1989L8.12328 16.6199L13.4956 21.9998H19.6842L14.2975 16.5999L19.6856 11.1998L13.4985 11.1989Z")
  )
}
