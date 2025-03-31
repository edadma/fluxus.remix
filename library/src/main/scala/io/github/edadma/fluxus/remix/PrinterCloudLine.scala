/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * PrinterCloudLine icon from the Remix Icon library, Business category.
 */
case class PrinterCloudLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * PrinterCloudLine icon component.
 *
 * @example PrinterCloudLine <> PrinterCloudLineProps(size = 24, color = "blue")
 */
def PrinterCloudLine = (props: PrinterCloudLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17 2C17.5523 2 18 2.44771 18 3V7H21C21.5523 7 22 7.44772 22 8V13.3243C21.8205 13.0765 21.6169 12.8387 21.3891 12.6109C20.9614 12.1832 20.4983 11.8406 20 11.5832V9H4V17H6V16C6 15.4477 6.44772 15 7 15H12.1938C12.1683 15.0933 12.1454 15.1877 12.1249 15.283C11.6949 15.5675 11.314 15.9255 10.9824 16.357C10.8228 16.5647 10.6827 16.779 10.562 17H8V20H10.0541C10.1628 20.7319 10.4352 21.3985 10.8715 22H7C6.44772 22 6 21.5523 6 21V19H3C2.44771 19 2 18.5523 2 18V8C2 7.44772 2.44771 7 3 7H6V3C6 2.44771 6.44772 2 7 2H17ZM16 4H8V7H16V4ZM8 10V12H5V10H8ZM21 16.5C21 14.567 19.433 13 17.5 13C15.567 13 14 14.567 14 16.5L14.0034 16.6025C12.8474 16.9279 12 17.99 12 19.25C12 20.7125 13.1417 21.9084 14.5825 21.995L14.75 22H20.25L20.4175 21.995C21.8583 21.9084 23 20.7125 23 19.25C23 17.9903 22.1531 16.9285 20.9985 16.6033L21 16.5ZM16.0069 16.3555C16.0796 15.5949 16.7203 15 17.5 15C18.2797 15 18.9204 15.5949 18.9931 16.3555L19 16.5V18.12C19.696 18.3189 20.1774 18.4541 20.4441 18.5256C20.8442 18.6328 21.0816 19.044 20.9744 19.4441C20.8851 19.7775 20.5846 19.998 20.2554 20.0002H14.7446C14.4154 19.998 14.1149 19.7775 14.0256 19.4441C13.9183 19.044 14.1558 18.6328 14.5559 18.5256C14.793 18.462 15.1997 18.3482 15.7759 18.1839L16 18.12V16.5L16.0069 16.3555Z")
  )
}
