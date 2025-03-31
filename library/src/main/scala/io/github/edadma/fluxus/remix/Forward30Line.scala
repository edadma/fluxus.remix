/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Forward30Line icon from the Remix Icon library, Media category.
 */
case class Forward30LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Forward30Line icon component.
 *
 * @example Forward30Line <> Forward30LineProps(size = 24, color = "blue")
 */
def Forward30Line = (props: Forward30LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2 12C2 6.47715 6.47715 2 12 2 15.2713 2 18.1757 3.57075 20.0001 5.99918L20 3.5H22V9.5H17.1655C17.3783 9.86772 17.5 10.2946 17.5 10.75V13.25C17.5 14.6307 16.3807 15.75 15 15.75 13.6193 15.75 12.5 14.6307 12.5 13.25V10.75C12.5 9.36929 13.6193 8.25 15 8.25 15.3556 8.25 15.6938 8.32422 16 8.45802V7.5L18.6155 7.50024C17.1755 5.38734 14.7498 4 12 4 7.58172 4 4 7.58172 4 12 4 16.4183 7.58172 20 12 20 16.4183 20 20 16.4183 20 12H22C22 17.5228 17.5228 22 12 22 6.47715 22 2 17.5228 2 12ZM15 9.75C14.4477 9.75 14 10.1977 14 10.75V13.25C14 13.8023 14.4477 14.25 15 14.25 15.5523 14.25 16 13.8023 16 13.25V10.75C16 10.1977 15.5523 9.75 15 9.75ZM9.37481 12.75C9.71999 12.75 9.99981 13.0298 9.99981 13.375 9.99981 13.7202 9.71999 14 9.37481 14H6.75V15.5H9.37481C10.5484 15.5 11.4998 14.5486 11.4998 13.375 11.4998 12.8506 11.3099 12.3706 10.9951 12 11.3099 11.6294 11.4998 11.1494 11.4998 10.625 11.4998 9.4514 10.5484 8.5 9.37481 8.5H6.75V10H9.37481C9.71999 10 9.99981 10.2798 9.99981 10.625 9.99981 10.9702 9.71999 11.25 9.37481 11.25H7.5V12.75H9.37481Z")
  )
}
