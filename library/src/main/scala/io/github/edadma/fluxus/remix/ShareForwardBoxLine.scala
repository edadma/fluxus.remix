/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ShareForwardBoxLine icon from the Remix Icon library, System category.
 */
case class ShareForwardBoxLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ShareForwardBoxLine icon component.
 *
 * @example ShareForwardBoxLine <> ShareForwardBoxLineProps(size = 24, color = "blue")
 */
def ShareForwardBoxLine = (props: ShareForwardBoxLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M9 2.9997V4.9997H4V18.9997H20V9.9997H22V19.9997C22 20.552 21.5523 20.9997 21 20.9997H3C2.44772 20.9997 2 20.552 2 19.9997V3.9997C2 3.44742 2.44772 2.9997 3 2.9997H9ZM18.9497 4.9997L16 2.04996L17.4142 0.635742L22.7539 5.97544C22.9882 6.20975 22.9882 6.58965 22.7539 6.82397C22.6414 6.93649 22.4888 6.9997 22.3296 6.9997H14C12.8954 6.9997 12 7.89513 12 8.9997V14.9997H10V8.9997C10 6.79056 11.7909 4.9997 14 4.9997H18.9497Z")
  )
}
