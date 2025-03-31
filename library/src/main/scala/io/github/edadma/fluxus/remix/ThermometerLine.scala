/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ThermometerLine icon from the Remix Icon library, Health & Medical category.
 */
case class ThermometerLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ThermometerLine icon component.
 *
 * @example ThermometerLine <> ThermometerLineProps(size = 24, color = "blue")
 */
def ThermometerLine = (props: ThermometerLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.5565 3.44367C22.1186 5.00576 22.1186 7.53842 20.5565 9.10052L12.3563 17.3008C11.714 17.943 10.8723 18.3476 9.96957 18.4479L6.59094 18.8221L4.29304 21.1213C3.90252 21.5119 3.26936 21.5119 2.87883 21.1213C2.48831 20.7308 2.48831 20.0976 2.87883 19.7071L5.17694 17.4081L5.55231 14.0306C5.65261 13.1279 6.05716 12.2862 6.69942 11.6439L14.8996 3.44367C16.4617 1.88157 18.9944 1.88157 20.5565 3.44367ZM16.3139 4.85788L8.11363 13.0581C7.7925 13.3792 7.59023 13.8001 7.54008 14.2515L7.264 16.7362L9.74871 16.4601C10.2001 16.4099 10.6209 16.2077 10.9421 15.8865L11.3639 15.4641L9.9499 14.0503L11.3641 12.6361L12.7779 14.0501L14.1919 12.6361L12.7783 11.2218L14.1925 9.80763L15.6069 11.2221L17.0209 9.8071L15.6068 8.39341L17.021 6.9792L18.4349 8.39309L19.1423 7.68631C19.9233 6.90526 19.9233 5.63893 19.1423 4.85788C18.3612 4.07683 17.0949 4.07683 16.3139 4.85788Z")
  )
}
