/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GitBranchLine icon from the Remix Icon library, Development category.
 */
case class GitBranchLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GitBranchLine icon component.
 *
 * @example GitBranchLine <> GitBranchLineProps(size = 24, color = "blue")
 */
def GitBranchLine = (props: GitBranchLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M7.10508 15.2101C8.21506 15.6501 9 16.7334 9 18C9 19.6569 7.65685 21 6 21C4.34315 21 3 19.6569 3 18C3 16.6938 3.83481 15.5825 5 15.1707V8.82929C3.83481 8.41746 3 7.30622 3 6C3 4.34315 4.34315 3 6 3C7.65685 3 9 4.34315 9 6C9 7.30622 8.16519 8.41746 7 8.82929V11.9996C7.83566 11.3719 8.87439 11 10 11H14C15.3835 11 16.5482 10.0635 16.8949 8.78991C15.7849 8.34988 15 7.26661 15 6C15 4.34315 16.3431 3 18 3C19.6569 3 21 4.34315 21 6C21 7.3332 20.1303 8.46329 18.9274 8.85392C18.5222 11.2085 16.4703 13 14 13H10C8.61653 13 7.45179 13.9365 7.10508 15.2101ZM6 17C5.44772 17 5 17.4477 5 18C5 18.5523 5.44772 19 6 19C6.55228 19 7 18.5523 7 18C7 17.4477 6.55228 17 6 17ZM6 5C5.44772 5 5 5.44772 5 6C5 6.55228 5.44772 7 6 7C6.55228 7 7 6.55228 7 6C7 5.44772 6.55228 5 6 5ZM18 5C17.4477 5 17 5.44772 17 6C17 6.55228 17.4477 7 18 7C18.5523 7 19 6.55228 19 6C19 5.44772 18.5523 5 18 5Z")
  )
}
