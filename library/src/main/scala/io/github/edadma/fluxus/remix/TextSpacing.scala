/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TextSpacing icon from the Remix Icon library, Editor category.
 */
case class TextSpacingProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TextSpacing icon component.
 *
 * @example TextSpacing <> TextSpacingProps(size = 24, color = "blue")
 */
def TextSpacing = (props: TextSpacingProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7 17H17V14.5L20.5 18L17 21.5V19H7V21.5L3.5 18L7 14.5V17ZM13 6V15H11V6H5V4H19V6H13Z")
  )
}
