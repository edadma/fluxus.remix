/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ContrastDrop2Line icon from the Remix Icon library, Design category.
 */
case class ContrastDrop2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ContrastDrop2Line icon component.
 *
 * @example ContrastDrop2Line <> ContrastDrop2LineProps(size = 24, color = "blue")
 */
def ContrastDrop2Line = (props: ContrastDrop2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 3.09735L7.05025 8.04709C4.31658 10.7808 4.31658 15.2129 7.05025 17.9466C9.78392 20.6803 14.2161 20.6803 16.9497 17.9466C19.6834 15.2129 19.6834 10.7808 16.9497 8.0471L12 3.09735ZM12 0.268921L18.364 6.63288C21.8787 10.1476 21.8787 15.8461 18.364 19.3608C14.8492 22.8755 9.15076 22.8755 5.63604 19.3608C2.12132 15.8461 2.12132 10.1476 5.63604 6.63288L12 0.268921ZM7 12.9968H17C17 15.7583 14.7614 17.9968 12 17.9968C9.23858 17.9968 7 15.7583 7 12.9968Z")
  )
}
