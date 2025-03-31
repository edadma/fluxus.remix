/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * CriminalLine icon from the Remix Icon library, User & Faces category.
 */
case class CriminalLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * CriminalLine icon component.
 *
 * @example CriminalLine <> CriminalLineProps(size = 24, color = "blue")
 */
def CriminalLine = (props: CriminalLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 2C16.9706 2 21 6.02944 21 11C21 13.2031 20.2084 15.2213 18.8941 16.7858C20.1491 17.6156 20.9275 18.6754 20.9952 19.835L21 20L12 22L3 20L3.00481 19.835C3.0725 18.6755 3.85076 17.6158 5.10554 16.7859C3.79194 15.2222 3 13.2036 3 11C3 6.02944 7.02944 2 12 2ZM12 4C8.13401 4 5 7.13401 5 11C5 12.5669 5.5143 14.0501 6.44521 15.261L6.63691 15.4995L8.07955 17.2168L6.11776 18.5156L5.981 18.613L12 19.951L18.018 18.613L17.9693 18.577L17.791 18.454L15.9199 17.2168L17.3628 15.4993C18.415 14.2468 19 12.6712 19 11C19 7.13401 15.866 4 12 4ZM12 13C13.3807 13 14.5 13.6716 14.5 14.5C14.5 15.3284 13.3807 16 12 16C10.6193 16 9.5 15.3284 9.5 14.5C9.5 13.6716 10.6193 13 12 13ZM9 8C10.1046 8 11 8.67157 11 9.5C11 10.3284 10.1046 11 9 11C7.89543 11 7 10.3284 7 9.5C7 8.67157 7.89543 8 9 8ZM15 8C16.1046 8 17 8.67157 17 9.5C17 10.3284 16.1046 11 15 11C13.8954 11 13 10.3284 13 9.5C13 8.67157 13.8954 8 15 8Z")
  )
}
