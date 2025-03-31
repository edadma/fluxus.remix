/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * NewspaperFill icon from the Remix Icon library, Document category.
 */
case class NewspaperFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * NewspaperFill icon component.
 *
 * @example NewspaperFill <> NewspaperFillProps(size = 24, color = "blue")
 */
def NewspaperFill = (props: NewspaperFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M19 22H5C3.34315 22 2 20.6569 2 19V3C2 2.44772 2.44772 2 3 2H17C17.5523 2 18 2.44772 18 3V10H22V19C22 20.6569 20.6569 22 19 22ZM18 12V19C18 19.5523 18.4477 20 19 20C19.5523 20 20 19.5523 20 19V12H18ZM5 6V12H11V6H5ZM5 13V15H15V13H5ZM5 16V18H15V16H5ZM7 8H9V10H7V8Z")
  )
}
