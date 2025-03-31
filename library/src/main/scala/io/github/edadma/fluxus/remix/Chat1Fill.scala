/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Chat1Fill icon from the Remix Icon library, Communication category.
 */
case class Chat1FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Chat1Fill icon component.
 *
 * @example Chat1Fill <> Chat1FillProps(size = 24, color = "blue")
 */
def Chat1Fill = (props: Chat1FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10 3H14C18.4183 3 22 6.58172 22 11C22 15.4183 18.4183 19 14 19V22.5C9 20.5 2 17.5 2 11C2 6.58172 5.58172 3 10 3Z")
  )
}
