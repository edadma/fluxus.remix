/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ShareForwardFill icon from the Remix Icon library, System category.
 */
case class ShareForwardFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ShareForwardFill icon component.
 *
 * @example ShareForwardFill <> ShareForwardFillProps(size = 24, color = "blue")
 */
def ShareForwardFill = (props: ShareForwardFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M13 14H11C7.54202 14 4.53953 15.9502 3.03239 18.8107C3.01093 18.5433 3 18.2729 3 18C3 12.4772 7.47715 8 13 8V3L23 11L13 19V14Z")
  )
}
