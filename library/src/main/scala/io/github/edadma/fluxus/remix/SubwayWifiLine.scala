/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SubwayWifiLine icon from the Remix Icon library, Map category.
 */
case class SubwayWifiLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SubwayWifiLine icon component.
 *
 * @example SubwayWifiLine <> SubwayWifiLineProps(size = 24, color = "blue")
 */
def SubwayWifiLine = (props: SubwayWifiLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M21 18C21 19.1046 20.1046 20 19 20H17.2L19 21.5V22H5V21.5L6.8 20H5C3.89543 20 3 19.1046 3 18V7C3 4.79086 4.79086 3 7 3H13V11H21V18ZM19 13H5V18H19V13ZM7.5 14C8.32843 14 9 14.6716 9 15.5C9 16.3284 8.32843 17 7.5 17C6.67157 17 6 16.3284 6 15.5C6 14.6716 6.67157 14 7.5 14ZM16.5 14C17.3284 14 18 14.6716 18 15.5C18 16.3284 17.3284 17 16.5 17C15.6716 17 15 16.3284 15 15.5C15 14.6716 15.6716 14 16.5 14ZM11 5H7C5.94564 5 5.08183 5.81588 5.00549 6.85074L5 7V11H11V5ZM18.5 1C20.9853 1 23 3.01472 23 5.5C23 7.98528 20.9853 10 18.5 10C16.0147 10 14 7.98528 14 5.5C14 3.01472 16.0147 1 18.5 1ZM18.4998 6.16667C18.0089 6.16667 17.5593 6.34354 17.2113 6.63704L17.0856 6.75245L18.4998 8.16667L19.9131 6.7515C19.5512 6.39013 19.0516 6.16667 18.4998 6.16667ZM18.4998 3.5C17.2966 3.5 16.1998 3.95536 15.3722 4.70316L15.199 4.86781L16.1428 5.80964C16.746 5.20643 17.5794 4.83333 18.4998 4.83333C19.3436 4.83333 20.1141 5.14684 20.7013 5.66372L20.8569 5.80964L21.7997 4.86684C20.9552 4.02233 19.7885 3.5 18.4998 3.5Z")
  )
}
