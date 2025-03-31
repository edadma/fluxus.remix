/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * InfinityFill icon from the Remix Icon library, Others category.
 */
case class InfinityFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * InfinityFill icon component.
 *
 * @example InfinityFill <> InfinityFillProps(size = 24, color = "blue")
 */
def InfinityFill = (props: InfinityFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M3 12C3 13.933 4.567 15.5 6.5 15.5C7.7035 15.5 8.51959 15.0662 9.19914 14.3866C9.82141 13.7644 10.3213 12.9468 10.8546 12C10.3213 11.0532 9.82141 10.2356 9.19914 9.61336C8.51959 8.9338 7.7035 8.5 6.5 8.5C4.567 8.5 3 10.067 3 12ZM6.5 17.5C3.46243 17.5 1 15.0376 1 12C1 8.96243 3.46243 6.5 6.5 6.5C8.2965 6.5 9.60541 7.1912 10.6134 8.19914C11.1486 8.7344 11.5999 9.36157 12 10.0017C12.4001 9.36157 12.8514 8.7344 13.3866 8.19914C14.3946 7.1912 15.7035 6.5 17.5 6.5C20.5376 6.5 23 8.96243 23 12C23 15.0376 20.5376 17.5 17.5 17.5C15.7035 17.5 14.3946 16.8088 13.3866 15.8009C12.8514 15.2656 12.4001 14.6384 12 13.9983C11.5999 14.6384 11.1486 15.2656 10.6134 15.8009C9.60541 16.8088 8.2965 17.5 6.5 17.5ZM13.1454 12C13.6787 12.9468 14.1786 13.7644 14.8009 14.3866C15.4804 15.0662 16.2965 15.5 17.5 15.5C19.433 15.5 21 13.933 21 12C21 10.067 19.433 8.5 17.5 8.5C16.2965 8.5 15.4804 8.9338 14.8009 9.61336C14.1786 10.2356 13.6787 11.0532 13.1454 12Z")
  )
}
