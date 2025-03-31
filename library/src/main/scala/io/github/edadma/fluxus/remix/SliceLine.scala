/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SliceLine icon from the Remix Icon library, Design category.
 */
case class SliceLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SliceLine icon component.
 *
 * @example SliceLine <> SliceLineProps(size = 24, color = "blue")
 */
def SliceLine = (props: SliceLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.6909 12.9147L17.4587 14.6824C11.4482 20.6929 6.4985 20.6929 2.25586 19.2786L17.8122 3.72229L21.3477 7.25782L15.6909 12.9147ZM12.8625 12.9147L18.5193 7.25782L17.8122 6.55072L6.3145 18.0484C9.04606 18.1558 11.6722 17.142 14.5808 14.633L12.8625 12.9147Z")
  )
}
