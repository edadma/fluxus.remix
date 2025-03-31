/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BloggerLine icon from the Remix Icon library, Logos category.
 */
case class BloggerLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BloggerLine icon component.
 *
 * @example BloggerLine <> BloggerLineProps(size = 24, color = "blue")
 */
def BloggerLine = (props: BloggerLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 9.00886C3 5.69022 5.69071 2.99951 9.00935 2.99951H12C15.3093 2.99951 17.9942 5.67508 18.0093 8.98082H18.9533C20.1037 8.98082 21 9.87713 21 11.0275V14.9902C21 18.3088 18.3093 20.9995 14.9907 20.9995H9.00935C5.69071 20.9995 3 18.3088 3 14.9902V9.00886ZM9.00935 4.99951C6.79528 4.99951 5 6.79479 5 9.00886V14.9902C5 17.2042 6.79528 18.9995 9.00935 18.9995H14.9907C17.2047 18.9995 19 17.2042 19 14.9902V11H18C16.9243 11 16 10.0756 16 9C16 6.78593 14.2141 4.99951 12 4.99951H9.00935ZM8 9C8 8.44772 8.44772 8 9 8H12.5C13.0523 8 13.5 8.44772 13.5 9C13.5 9.55228 13.0523 10 12.5 10H9C8.44772 10 8 9.55228 8 9ZM9 14C8.44772 14 8 14.4477 8 15C8 15.5523 8.44772 16 9 16H15C15.5523 16 16 15.5523 16 15C16 14.4477 15.5523 14 15 14H9Z")
  )
}
