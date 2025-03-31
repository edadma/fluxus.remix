/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * GitClosePullRequestLine icon from the Remix Icon library, Development category.
 */
case class GitClosePullRequestLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * GitClosePullRequestLine icon component.
 *
 * @example GitClosePullRequestLine <> GitClosePullRequestLineProps(size = 24, color = "blue")
 */
def GitClosePullRequestLine = (props: GitClosePullRequestLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M6 5C5.44772 5 5 5.44772 5 6C5 6.55228 5.44772 7 6 7C6.55228 7 7 6.55228 7 6C7 5.44772 6.55228 5 6 5ZM3 6C3 4.34315 4.34315 3 6 3C7.65685 3 9 4.34315 9 6C9 7.30622 8.16519 8.41746 7 8.82929V15.1707C8.16519 15.5825 9 16.6938 9 18C9 19.6569 7.65685 21 6 21C4.34315 21 3 19.6569 3 18C3 16.6938 3.83481 15.5825 5 15.1707V8.82929C3.83481 8.41746 3 7.30622 3 6ZM15.2929 3.29289C15.6834 2.90237 16.3166 2.90237 16.7071 3.29289L18 4.58579L19.2929 3.29289C19.6834 2.90237 20.3166 2.90237 20.7071 3.29289C21.0976 3.68342 21.0976 4.31658 20.7071 4.70711L19.4142 6L20.7071 7.29289C21.0976 7.68342 21.0976 8.31658 20.7071 8.70711C20.3166 9.09763 19.6834 9.09763 19.2929 8.70711L18 7.41421L16.7071 8.70711C16.3166 9.09763 15.6834 9.09763 15.2929 8.70711C14.9024 8.31658 14.9024 7.68342 15.2929 7.29289L16.5858 6L15.2929 4.70711C14.9024 4.31658 14.9024 3.68342 15.2929 3.29289ZM18 10C18.5523 10 19 10.4477 19 11V15.1707C20.1652 15.5825 21 16.6938 21 18C21 19.6569 19.6569 21 18 21C16.3431 21 15 19.6569 15 18C15 16.6938 15.8348 15.5825 17 15.1707V11C17 10.4477 17.4477 10 18 10ZM6 17C5.44772 17 5 17.4477 5 18C5 18.5523 5.44772 19 6 19C6.55228 19 7 18.5523 7 18C7 17.4477 6.55228 17 6 17ZM18 17C17.4477 17 17 17.4477 17 18C17 18.5523 17.4477 19 18 19C18.5523 19 19 18.5523 19 18C19 17.4477 18.5523 17 18 17Z")
  )
}
