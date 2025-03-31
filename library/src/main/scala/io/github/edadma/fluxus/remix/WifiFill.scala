/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * WifiFill icon from the Remix Icon library, Device category.
 */
case class WifiFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * WifiFill icon component.
 *
 * @example WifiFill <> WifiFillProps(size = 24, color = "blue")
 */
def WifiFill = (props: WifiFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M0.689453 6.99659C3.78027 4.49704 7.71526 3 11.9999 3C16.2845 3 20.2195 4.49704 23.3104 6.99659L21.4253 9.33049C18.8496 7.24753 15.5704 6 11.9999 6C8.42937 6 5.15021 7.24753 2.57453 9.33049L0.689453 6.99659ZM3.83124 10.8864C6.0635 9.08119 8.90544 8 11.9999 8C15.0944 8 17.9363 9.08119 20.1686 10.8864L18.2835 13.2203C16.5664 11.8317 14.3803 11 11.9999 11C9.61954 11 7.43344 11.8317 5.71632 13.2203L3.83124 10.8864ZM6.97304 14.7763C8.34673 13.6653 10.0956 13 11.9999 13C13.9042 13 15.6531 13.6653 17.0268 14.7763L15.1417 17.1102C14.2831 16.4158 13.1901 16 11.9999 16C10.8097 16 9.71667 16.4158 8.85811 17.1102L6.97304 14.7763ZM10.1148 18.6661C10.63 18.2495 11.2858 18 11.9999 18C12.714 18 13.3698 18.2495 13.885 18.6661L11.9999 21L10.1148 18.6661Z")
  )
}
