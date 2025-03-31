/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ScanLine icon from the Remix Icon library, Device category.
 */
case class ScanLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ScanLine icon component.
 *
 * @example ScanLine <> ScanLineProps(size = 24, color = "blue")
 */
def ScanLine = (props: ScanLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M5.67127 4.25705L13.4142 12L12 13.4142L5.68014 7.09436C4.62708 8.44904 4 10.1513 4 12C4 16.4183 7.58172 20 12 20C16.4183 20 20 16.4183 20 12C20 7.58172 16.4183 4 12 4C11.0848 4 10.2054 4.15369 9.38641 4.43667L7.84921 2.89947C9.11354 2.32187 10.5192 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 8.87842 3.43029 6.09091 5.67127 4.25705Z")
  )
}
