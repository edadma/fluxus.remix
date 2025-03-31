/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BowlLine icon from the Remix Icon library, Food category.
 */
case class BowlLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BowlLine icon component.
 *
 * @example BowlLine <> BowlLineProps(size = 24, color = "blue")
 */
def BowlLine = (props: BowlLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8 1.5C8 0.947715 7.55228 0.5 7 0.5C6.44772 0.5 6 0.947715 6 1.5V2.5C6 2.50686 6.00042 2.51285 6.00081 2.51843C6.00385 2.56193 6.00516 2.58063 5.79289 2.79289L5.77277 2.81298C5.50599 3.07912 5 3.58391 5 4.5V5.5C5 6.05228 5.44772 6.5 6 6.5C6.55228 6.5 7 6.05228 7 5.5V4.5C7 4.49314 6.99958 4.48715 6.99919 4.48157C6.99615 4.43807 6.99484 4.41937 7.20711 4.20711L7.22723 4.18702C7.49401 3.92088 8 3.41609 8 2.5V1.5ZM19 1.5C19 0.947715 18.5523 0.5 18 0.5C17.4477 0.5 17 0.947715 17 1.5V2.5C17 2.50686 17.0004 2.51285 17.0008 2.51843C17.0038 2.56193 17.0052 2.58063 16.7929 2.79289L16.7728 2.81298C16.506 3.07912 16 3.58391 16 4.5V5.5C16 6.05228 16.4477 6.5 17 6.5C17.5523 6.5 18 6.05228 18 5.5V4.5C18 4.49314 17.9996 4.48715 17.9992 4.48157C17.9962 4.43807 17.9948 4.41937 18.2071 4.20711L18.2272 4.18702C18.494 3.92088 19 3.41609 19 2.5V1.5ZM12.5 0.5C13.0523 0.5 13.5 0.947715 13.5 1.5V2.5C13.5 3.41609 12.994 3.92088 12.7272 4.18702L12.7071 4.20711C12.4948 4.41937 12.4962 4.43807 12.4992 4.48157C12.4996 4.48715 12.5 4.49314 12.5 4.5V5.5C12.5 6.05228 12.0523 6.5 11.5 6.5C10.9477 6.5 10.5 6.05228 10.5 5.5V4.5C10.5 3.58391 11.006 3.07912 11.2728 2.81298L11.2929 2.79289C11.5052 2.58063 11.5038 2.56193 11.5008 2.51843C11.5004 2.51285 11.5 2.50686 11.5 2.5V1.5C11.5 0.947715 11.9477 0.5 12.5 0.5ZM4 10H20C20 14.4183 16.4183 18 12 18C7.58172 18 4 14.4183 4 10ZM3 8C2.44772 8 2 8.44771 2 9V10C2 14.1006 4.46819 17.6248 8 19.1679V20C8 20.5523 8.44772 21 9 21H15C15.5523 21 16 20.5523 16 20V19.1679C19.5318 17.6248 22 14.1006 22 10V9C22 8.44772 21.5523 8 21 8H3Z")
  )
}
