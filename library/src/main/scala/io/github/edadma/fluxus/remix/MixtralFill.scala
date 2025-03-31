/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MixtralFill icon from the Remix Icon library, Logos category.
 */
case class MixtralFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MixtralFill icon component.
 *
 * @example MixtralFill <> MixtralFillProps(size = 24, color = "blue")
 */
def MixtralFill = (props: MixtralFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 3H6.6V6.6L10.2001 6.6001V10.2001L13.8 10.2002L13.8 6.6001H17.3999V3H20.9999V20.9999H17.3999V13.8002L13.8 13.7998V17.3998H10.2V13.8002L6.6 13.7998V20.9999H3V3Z")
  )
}
