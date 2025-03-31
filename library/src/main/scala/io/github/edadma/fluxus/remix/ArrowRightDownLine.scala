/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ArrowRightDownLine icon from the Remix Icon library, Arrows category.
 */
case class ArrowRightDownLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ArrowRightDownLine icon component.
 *
 * @example ArrowRightDownLine <> ArrowRightDownLineProps(size = 24, color = "blue")
 */
def ArrowRightDownLine = (props: ArrowRightDownLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M14.5895 16.0032L5.98291 7.39664L7.39712 5.98242L16.0037 14.589V7.00324H18.0037V18.0032H7.00373V16.0032H14.5895Z")
  )
}
