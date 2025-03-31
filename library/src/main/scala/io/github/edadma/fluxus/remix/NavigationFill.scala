/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * NavigationFill icon from the Remix Icon library, Map category.
 */
case class NavigationFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * NavigationFill icon component.
 *
 * @example NavigationFill <> NavigationFillProps(size = 24, color = "blue")
 */
def NavigationFill = (props: NavigationFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2.89945 2.29983L21.7052 8.56842C21.9672 8.65574 22.1088 8.93891 22.0215 9.20088C21.975 9.3404 21.8694 9.45238 21.7328 9.507L13.0002 13.0001L8.57501 21.8504C8.45151 22.0974 8.15118 22.1975 7.90419 22.074C7.77883 22.0113 7.68553 21.8989 7.64703 21.7641L2.26058 2.91153C2.18472 2.64601 2.33846 2.36927 2.60398 2.29341C2.70087 2.26573 2.80386 2.26796 2.89945 2.29983Z")
  )
}
