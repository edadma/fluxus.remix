/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CreativeCommonsSaFill icon from the Remix Icon library, Business category.
 */
case class CreativeCommonsSaFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CreativeCommonsSaFill icon component.
 *
 * @example CreativeCommonsSaFill <> CreativeCommonsSaFillProps(size = 24, color = "blue")
 */
def CreativeCommonsSaFill = (props: CreativeCommonsSaFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 2C17.52 2 22 6.48 22 12C22 17.52 17.52 22 12 22C6.48 22 2 17.52 2 12C2 6.48 6.48 2 12 2ZM12 6C9.82278 6 7.97058 7.66991 7.28433 10.0006L6 10L8.5 13L11 10L9.40123 10.0003C9.91991 8.80452 10.8895 8 12 8C13.6569 8 15 9.79086 15 12C15 14.2091 13.6569 16 12 16C10.8899 16 9.92064 15.1961 9.40181 14.0011L7.28471 14.0007C7.97126 16.3307 9.82318 18 12 18C14.7614 18 17 15.3137 17 12C17 8.68629 14.7614 6 12 6Z")
  )
}
