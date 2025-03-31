/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MarkupLine icon from the Remix Icon library, Design category.
 */
case class MarkupLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MarkupLine icon component.
 *
 * @example MarkupLine <> MarkupLineProps(size = 24, color = "blue")
 */
def MarkupLine = (props: MarkupLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M10 10.4967L11.0385 6.86202C11.1902 6.33099 11.7437 6.0235 12.2747 6.17522C12.6069 6.27014 12.8666 6.52981 12.9615 6.86202L14 10.4967V11.9967H14.7192C15.1781 11.9967 15.5781 12.309 15.6894 12.7542L17.051 18.2008C18.8507 16.7339 20 14.4995 20 11.9967C20 7.57841 16.4183 3.99669 12 3.99669C7.58172 3.99669 4 7.57841 4 11.9967C4 14.4995 5.14932 16.7339 6.94897 18.2008L8.31063 12.7542C8.42193 12.309 8.82191 11.9967 9.28078 11.9967H10V10.4967ZM12 19.9967C12.2415 19.9967 12.4813 19.986 12.7189 19.9649C13.6187 19.8847 14.4756 19.6556 15.2649 19.3023L13.9384 13.9967H10.0616L8.73514 19.3023C9.52438 19.6556 10.3813 19.8847 11.2811 19.9648C11.5187 19.986 11.7585 19.9967 12 19.9967ZM12 21.9967C6.47715 21.9967 2 17.5195 2 11.9967C2 6.47384 6.47715 1.99669 12 1.99669C17.5228 1.99669 22 6.47384 22 11.9967C22 17.5195 17.5228 21.9967 12 21.9967Z")
  )
}
