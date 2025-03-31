/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Skull2Fill icon from the Remix Icon library, User & Faces category.
 */
case class Skull2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Skull2Fill icon component.
 *
 * @example Skull2Fill <> Skull2FillProps(size = 24, color = "blue")
 */
def Skull2Fill = (props: Skull2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 2C17.5228 2 22 6.47715 22 12V15.7639C22 16.5215 21.572 17.214 20.8944 17.5528L18 19V20C18 21.5977 16.7511 22.9037 15.1763 22.9949L14.9499 23.0004C14.9718 22.8926 14.9868 22.7823 14.9943 22.67L15 22.5V22C15 20.9456 14.1841 20.0818 13.1493 20.0055L13 20H11C9.94564 20 9.08183 20.8159 9.00549 21.8507L9 22V22.5C9 22.6714 9.01725 22.8387 9.0501 23.0004L9 23C7.34315 23 6 21.6569 6 20V19L3.10557 17.5528C2.428 17.214 2 16.5215 2 15.7639V12C2 6.47715 6.47715 2 12 2ZM8 11C6.89543 11 6 11.8954 6 13C6 14.1046 6.89543 15 8 15C9.10457 15 10 14.1046 10 13C10 11.8954 9.10457 11 8 11ZM16 11C14.8954 11 14 11.8954 14 13C14 14.1046 14.8954 15 16 15C17.1046 15 18 14.1046 18 13C18 11.8954 17.1046 11 16 11Z")
  )
}
