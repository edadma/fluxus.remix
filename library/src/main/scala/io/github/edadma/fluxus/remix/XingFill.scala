/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * XingFill icon from the Remix Icon library, Logos category.
 */
case class XingFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * XingFill icon component.
 *
 * @example XingFill <> XingFillProps(size = 24, color = "blue")
 */
def XingFill = (props: XingFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.4619 3.23071C20.6158 3.23071 20.7696 3.30764 20.8465 3.38456C20.9235 3.53841 20.9235 3.69225 20.8465 3.8461L14.7696 14.6153L18.6158 21.6923C18.6927 21.8461 18.6927 21.9999 18.6158 22.1538C18.5388 22.2307 18.385 22.3076 18.2311 22.3076H15.4619C15.0773 22.3076 14.8465 21.9999 14.6927 21.7692L10.7696 14.6153C11.0004 14.3076 16.9235 3.76917 16.9235 3.76917C17.0773 3.46148 17.3081 3.23071 17.6927 3.23071H20.4619ZM8.92345 6.99994C9.30807 6.99994 9.53884 7.30764 9.69268 7.53841L11.6158 10.8461C11.4619 10.9999 8.61576 16.0769 8.61576 16.0769C8.46191 16.3076 8.23114 16.6153 7.84653 16.6153H5.15422C5.00038 16.6153 4.84653 16.5384 4.76961 16.4615C4.69268 16.3076 4.69268 16.1538 4.76961 15.9999L7.61576 10.8461L5.76961 7.61533C5.69268 7.46148 5.69268 7.30764 5.76961 7.15379C5.84653 7.07687 6.00038 6.99994 6.15422 6.99994H8.92345Z")
  )
}
