/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * EditBoxLine icon from the Remix Icon library, Design category.
 */
case class EditBoxLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * EditBoxLine icon component.
 *
 * @example EditBoxLine <> EditBoxLineProps(size = 24, color = "blue")
 */
def EditBoxLine = (props: EditBoxLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16.7574 2.99678L14.7574 4.99678H5V18.9968H19V9.23943L21 7.23943V19.9968C21 20.5491 20.5523 20.9968 20 20.9968H4C3.44772 20.9968 3 20.5491 3 19.9968V3.99678C3 3.4445 3.44772 2.99678 4 2.99678H16.7574ZM20.4853 2.09729L21.8995 3.5115L12.7071 12.7039L11.2954 12.7064L11.2929 11.2897L20.4853 2.09729Z")
  )
}
