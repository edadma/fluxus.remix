/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DiamondRingLine icon from the Remix Icon library, Finance category.
 */
case class DiamondRingLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DiamondRingLine icon component.
 *
 * @example DiamondRingLine <> DiamondRingLineProps(size = 24, color = "blue")
 */
def DiamondRingLine = (props: DiamondRingLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9.46488 1L7.69076 3.66118L9.55579 5.35667C6.05273 6.40661 3.5 9.6552 3.5 13.5C3.5 18.1944 7.30558 22 12 22C16.6944 22 20.5 18.1944 20.5 13.5C20.5 9.65523 17.9473 6.40667 14.4443 5.35669L16.3094 3.66118L14.5352 1H9.46488ZM12 7C15.5899 7 18.5 9.91015 18.5 13.5C18.5 17.0899 15.5899 20 12 20C8.41015 20 5.5 17.0899 5.5 13.5C5.5 9.91015 8.41015 7 12 7ZM10.3094 3.33882L10.5352 3H13.4649L13.6908 3.33882L12.0001 4.87581L10.3094 3.33882Z")
  )
}
