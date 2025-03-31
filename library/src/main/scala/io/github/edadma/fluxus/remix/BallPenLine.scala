/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BallPenLine icon from the Remix Icon library, Design category.
 */
case class BallPenLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BallPenLine icon component.
 *
 * @example BallPenLine <> BallPenLineProps(size = 24, color = "blue")
 */
def BallPenLine = (props: BallPenLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17.8492 11.6983L17.1421 10.9912L7.24264 20.8907H3V16.648L14.3137 5.33432L19.9706 10.9912C20.3611 11.3817 20.3611 12.0149 19.9706 12.4054L12.8995 19.4765L11.4853 18.0622L17.8492 11.6983ZM15.7279 9.57696L14.3137 8.16274L5 17.4765V18.8907H6.41421L15.7279 9.57696ZM18.5563 2.50589L21.3848 5.33432C21.7753 5.72484 21.7753 6.35801 21.3848 6.74853L19.9706 8.16274L15.7279 3.9201L17.1421 2.50589C17.5327 2.11537 18.1658 2.11537 18.5563 2.50589Z")
  )
}
