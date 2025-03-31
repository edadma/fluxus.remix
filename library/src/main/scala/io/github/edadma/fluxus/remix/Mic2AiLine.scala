/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Mic2AiLine icon from the Remix Icon library, Media category.
 */
case class Mic2AiLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Mic2AiLine icon component.
 *
 * @example Mic2AiLine <> Mic2AiLineProps(size = 24, color = "blue")
 */
def Mic2AiLine = (props: Mic2AiLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.7134 7.12811L20.4668 7.69379C20.2864 8.10792 19.7136 8.10792 19.5331 7.69379L19.2866 7.12811C18.8471 6.11947 18.0555 5.31641 17.0677 4.87708L16.308 4.53922C15.8973 4.35653 15.8973 3.75881 16.308 3.57612L17.0252 3.25714C18.0384 2.80651 18.8442 1.97373 19.2761 0.930828L19.5293 0.319534C19.7058 -0.106511 20.2942 -0.106511 20.4706 0.319534L20.7238 0.930828C21.1558 1.97373 21.9616 2.80651 22.9748 3.25714L23.6919 3.57612C24.1027 3.75881 24.1027 4.35653 23.6919 4.53922L22.9323 4.87708C21.9445 5.31641 21.1529 6.11947 20.7134 7.12811ZM7 6C7 3.23858 9.23858 1 12 1C12.9914 1 13.9182 1.28957 14.6969 1.7891L13.617 3.47248C13.1509 3.17349 12.5972 3 12 3C10.3431 3 9 4.34315 9 6V12C9 13.6569 10.3431 15 12 15C13.6569 15 15 13.6569 15 12V7H17V12C17 14.7614 14.7614 17 12 17C9.23858 17 7 14.7614 7 12V6ZM2.19238 13.9617L4.15392 13.5693C4.88321 17.2362 8.11888 20.0001 12.0001 20.0001C15.8813 20.0001 19.1169 17.2363 19.8462 13.5693L21.8078 13.9617C20.8961 18.5453 16.8516 22.0001 12.0001 22.0001C7.14858 22.0001 3.104 18.5453 2.19238 13.9617Z")
  )
}
