/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FileShield2Fill icon from the Remix Icon library, Document category.
 */
case class FileShield2FillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FileShield2Fill icon component.
 *
 * @example FileShield2Fill <> FileShield2FillProps(size = 24, color = "blue")
 */
def FileShield2Fill = (props: FileShield2FillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 10H11V17.3823C11 18.9449 11.7775 20.4053 13.074 21.2742L14.1569 22H3.9934C3.44495 22 3 21.556 3 21.0082V2.9918C3 2.45531 3.44694 2 3.99826 2H15.9968L21 7V10ZM13 12H21V17.3823C21 18.2786 20.5544 19.1156 19.8125 19.6128L17 21.4978L14.1875 19.6128C13.4456 19.1156 13 18.2786 13 17.3823V12Z")
  )
}
