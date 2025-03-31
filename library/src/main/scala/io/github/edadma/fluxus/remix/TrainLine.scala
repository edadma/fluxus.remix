/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * TrainLine icon from the Remix Icon library, Map category.
 */
case class TrainLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * TrainLine icon component.
 *
 * @example TrainLine <> TrainLineProps(size = 24, color = "blue")
 */
def TrainLine = (props: TrainLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M17.2 20L19 21.5V22H5V21.5L6.8 20H5C3.89543 20 3 19.1046 3 18V7C3 4.79086 4.79086 3 7 3H17C19.2091 3 21 4.79086 21 7V18C21 19.1046 20.1046 20 19 20H17.2ZM7 5C5.89543 5 5 5.89543 5 7V18H19V7C19 5.89543 18.1046 5 17 5H7ZM12 17C10.8954 17 10 16.1046 10 15C10 13.8954 10.8954 13 12 13C13.1046 13 14 13.8954 14 15C14 16.1046 13.1046 17 12 17ZM6 7H18V11H6V7Z")
  )
}
